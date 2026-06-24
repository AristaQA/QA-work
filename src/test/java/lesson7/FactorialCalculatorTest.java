package lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {

    @Test
    @DisplayName("Проверка факториала числа 5")
    public void calculateFactorialOfFiveTest() {
        // Создаём объект класса, который будем тестировать
        FactorialCalculator calculator = new FactorialCalculator();

        // Вызываем метод и сохраняем фактический результат
        int actualResult = calculator.calculate(5);

        // Ожидаемый результат: 5! = 120
        int expectedResult = 120;

        // Сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expectedResult, actualResult);
    }
}