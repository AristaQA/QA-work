package lesson7;

public class NumberComparator {

    // Метод сравнивает два целых числа
    public String compare(int firstNumber, int secondNumber) {
        String result;

        if (firstNumber > secondNumber) {
            result = "Первое число больше";
        } else if (firstNumber < secondNumber) {
            result = "Второе число больше";
        } else {
            result = "Числа равны";
        }

        return result;
    }
}
