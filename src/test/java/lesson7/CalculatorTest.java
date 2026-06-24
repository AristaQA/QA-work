package lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {

    @Test(description = "Проверка сложения двух чисел")
    public void addTwoNumbersTest() {
        // Создаём объект калькулятора
        Calculator calculator = new Calculator();

        // Вызываем метод сложения
        int actualResult = calculator.add(5, 3);

        // Ожидаемый результат: 5 + 3 = 8
        int expectedResult = 8;

        // Сравниваем фактический и ожидаемый результат
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Проверка вычитания двух чисел")
    public void subtractTwoNumbersTest() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.subtract(10, 4);

        int expectedResult = 6;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Проверка умножения двух чисел")
    public void multiplyTwoNumbersTest() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.multiply(6, 7);

        int expectedResult = 42;

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Проверка деления двух чисел")
    public void divideTwoNumbersTest() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.divide(20, 5);

        int expectedResult = 4;

        Assert.assertEquals(actualResult, expectedResult);
    }
}