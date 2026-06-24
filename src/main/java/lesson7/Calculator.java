package lesson7;

public class Calculator {

    // Метод складывает два целых числа
    public int add(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;

        return result;
    }

    // Метод вычитает второе число из первого
    public int subtract(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;

        return result;
    }

    // Метод умножает два целых числа
    public int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;

        return result;
    }

    // Метод делит первое число на второе
    public int divide(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;

        return result;
    }
}