package lesson9;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsPaymentTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeEach
    public void setUp() {

        // Создаём браузер Chrome перед каждым тестом
        driver = new ChromeDriver();

        // Создаём ожидание на 10 секунд
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Открываем сайт МТС
        driver.get("https://www.mts.by/");

        // Открываем браузер на весь экран, чтобы элементы были видны
        driver.manage().window().maximize();

        // Принимаем cookie, если окно появилось
        acceptCookiesIfPresent();

        // Прокручиваем страницу два раза вниз, чтобы дойти до блока оплаты
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 600);");
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0, 600);");
    }

    private void acceptCookiesIfPresent() {
        try {
            // Создаём короткое ожидание только для окна cookie
            WebDriverWait shortWait = new WebDriverWait(driver, Duration.ofSeconds(5));

            // Если кнопка "Принять" появилась, нажимаем её
            shortWait.until(ExpectedConditions.elementToBeClickable(
                    By.id("cookie-agree")
            )).click();

        } catch (TimeoutException ignored) {
            // Если окно cookie не появилось, ничего не делаем и продолжаем тест
        }
    }

    // 1. Проверяем название указанного блока
    @Test
    public void checkPaymentBlockTitleTest() {
        // Ищем заголовок внутри блока оплаты
        WebElement blockTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("section.pay h2")
        ));

        // Получаем текст заголовка
        String actualTitle = blockTitle.getText();

        // Проверяем, что текст соответствует
        assertTrue(actualTitle.contains("ОНЛАЙН ПОПОЛНЕНИЕ"));
        assertTrue(actualTitle.contains("БЕЗ КОМИССИИ"));
    }

    // 2. Проверяем наличие логотипов платежных систем
    @Test
    public void checkPaymentSystemsLogosTest() {
        // Создаём массив с названиями логотипов из атрибута alt
        String[] paymentLogos = {
                "Visa",
                "Verified By Visa",
                "MasterCard",
                "MasterCard Secure Code",
                "Белкарт"
        };

        // По очереди берём каждый логотип из массива
        for (String logo : paymentLogos) {
            WebElement paymentLogo = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.cssSelector(".pay__partners img[alt='" + logo + "']")
            ));

            // Проверяем, что найденный логотип отображается на странице
            assertTrue(paymentLogo.isDisplayed());
        }
    }

    // 3. Проверяем работу ссылки "Подробнее о сервисе"
    @Test
    public void checkMoreAboutServiceLinkTest() {
        // Ищем ссылку внутри блока оплаты по части href
        WebElement moreAboutServiceLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("section.pay a[href*='poryadok-oplaty-i-bezopasnost-internet-platezhey']")
        ));

        // Нажимаем на нее
        moreAboutServiceLink.click();

        // Ждём, что после клика URL изменится на страницу с описанием сервиса
        wait.until(ExpectedConditions.urlContains("poryadok-oplaty-i-bezopasnost-internet-platezhey"));

        // Проверяем, что открылась нужная страница
        assertTrue(driver.getCurrentUrl().contains("poryadok-oplaty-i-bezopasnost-internet-platezhey"));
    }

    // 4. Заполняем поля и проверяем работу кнопки "Продолжить"
    @Test
    public void checkContinueButtonWithFilledFieldsTest() {
        // Ищем поле "Номер телефона" по id
        WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("connection-phone")
        ));
        // Вводим номер
        phoneInput.sendKeys("297777777");

        // Ищем поле "Сумма" по id и вводим сумму
        WebElement sumInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.id("connection-sum")
        ));
        sumInput.sendKeys("15");

        // Ищем кнопку "Продолжить" внутри формы оплаты
        WebElement continueButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("#pay-connection button[type='submit']")
        ));

        // Проверяем, что кнопка "Продолжить" доступна и нажимаем ее
        assertTrue(continueButton.isEnabled());
        continueButton.click();

        // Ждём появления платёжного iframe после нажатия "Продолжить"
        WebElement paymentFrame = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("iframe.bepaid-widget-iframe")
        ));
        // Переключаемся внутрь iframe, потому что сумма
        // и номер отображаются внутри платёжного окна и проверяем их
        driver.switchTo().frame(paymentFrame);

        WebElement paymentAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".pay-description__cost")
        ));
        assertTrue(paymentAmount.getText().contains("15.00 BYN"));

        WebElement paymentDescription = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector(".pay-description__text")
        ));
        assertTrue(paymentDescription.getText().contains("375297777777"));
    }

    @AfterEach
    public void closeBrowser() {
        // Закрываем браузер после каждого теста
        if (driver != null) {
            driver.quit();
        }
    }
}