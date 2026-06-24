package lesson7;

public class FactorialCalculator {

    // Метод считает факториал числа
    public int calculate(int number) {
        int result = 1;

        for (int i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;
    }
}
