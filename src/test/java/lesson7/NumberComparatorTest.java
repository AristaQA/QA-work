package lesson7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NumberComparatorTest {

    @Test
    @DisplayName("Проверка, что первое число больше второго")
    public void firstNumberGreaterTest() {
        // Создаём объект класса, который будем тестировать
        NumberComparator comparator = new NumberComparator();

        // Сравниваем два числа
        String actualResult = comparator.compare(10, 5);

        // Ожидаемый результат
        String expectedResult = "Первое число больше";

        // Сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка, что второе число больше первого")
    public void secondNumberGreaterTest() {
        NumberComparator comparator = new NumberComparator();

        String actualResult = comparator.compare(3, 8);

        String expectedResult = "Второе число больше";

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Проверка, что числа равны")
    public void numbersAreEqualTest() {
        NumberComparator comparator = new NumberComparator();

        String actualResult = comparator.compare(7, 7);

        String expectedResult = "Числа равны";

        Assertions.assertEquals(expectedResult, actualResult);
    }
}