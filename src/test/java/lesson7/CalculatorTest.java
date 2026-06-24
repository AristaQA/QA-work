package lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    @DisplayName("Проверка сложения двух чисел")
    public void addTwoNumbersTest() {
        // Создаём объект калькулятора
        Calculator calculator = new Calculator();

        // Вызываем метод сложения
        int actualResult = calculator.add(5, 3);

        // Ожидаемый результат: 5 + 3 = 8
        int expectedResult = 8;

        // Проверяем, что результат правильный
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка вычитания двух чисел")
    public void subtractTwoNumbersTest() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.subtract(10, 4);

        int expectedResult = 6;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка умножения двух чисел")
    public void multiplyTwoNumbersTest() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.multiply(6, 7);

        int expectedResult = 42;

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка деления двух чисел")
    public void divideTwoNumbersTest() {
        Calculator calculator = new Calculator();

        int actualResult = calculator.divide(20, 5);

        int expectedResult = 4;

        Assertions.assertEquals(expectedResult, actualResult);
    }
}