package lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TriangleAreaCalculatorTest {

    @Test(description = "Проверка площади треугольника")
    public void calculateTriangleAreaTest() {
        // Создаём объект класса, который будем тестировать
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();

        // Вызываем метод: основание 10, высота 6
        double actualResult = calculator.calculate(10, 6);

        // Ожидаемый результат: 10 * 6 / 2 = 30
        double expectedResult = 30;

        // Сравниваем фактический и ожидаемый результат
        Assert.assertEquals(actualResult, expectedResult);
    }
}