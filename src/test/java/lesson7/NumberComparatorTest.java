package lesson7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {

    @Test(description = "Проверка, что первое число больше второго")
    public void firstNumberGreaterTest() {
        // Создаём объект класса, который будем тестировать
        NumberComparator comparator = new NumberComparator();

        // Сравниваем два числа
        String actualResult = comparator.compare(10, 5);

        // Ожидаемый результат
        String expectedResult = "Первое число больше";

        // Сравниваем фактический и ожидаемый результат
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Проверка, что второе число больше первого")
    public void secondNumberGreaterTest() {
        NumberComparator comparator = new NumberComparator();

        String actualResult = comparator.compare(3, 8);

        String expectedResult = "Второе число больше";

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(description = "Проверка, что числа равны")
    public void numbersAreEqualTest() {
        NumberComparator comparator = new NumberComparator();

        String actualResult = comparator.compare(7, 7);

        String expectedResult = "Числа равны";

        Assert.assertEquals(actualResult, expectedResult);
    }
}