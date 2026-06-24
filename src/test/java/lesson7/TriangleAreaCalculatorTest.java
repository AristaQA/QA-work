package lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TriangleAreaCalculatorTest {

    @Test
    @DisplayName("Проверка площади треугольника")
    public void calculateTriangleAreaTest() {
        // Создаём объект класса, который будем тестировать
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();

        // Вызываем метод: основание 10, высота 6
        double actualResult = calculator.calculate(10, 6);

        // Ожидаемый результат: 10 * 6 / 2 = 30
        double expectedResult = 30;

        // Сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expectedResult, actualResult);
    }
}
