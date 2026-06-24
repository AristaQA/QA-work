package lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {

    @Test(description = "Проверка факториала числа 5")
    public void calculateFactorialOfFiveTest() {
        // Создаём объект класса, который будем тестировать
        FactorialCalculator calculator = new FactorialCalculator();

        // Вызываем метод и сохраняем фактический результат
        int actualResult = calculator.calculate(5);

        // Ожидаемый результат: 5! = 120
        int expectedResult = 120;

        // Сравниваем ожидаемый и фактический результат
        Assert.assertEquals(expectedResult, actualResult);
    }
}