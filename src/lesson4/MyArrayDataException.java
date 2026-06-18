package lesson4;

// Своя ошибка для неправильных данных в массиве
public class MyArrayDataException extends Exception {

    // Конструктор принимает текст ошибки
    public MyArrayDataException(String message) {
        super(message); // передаем текст ошибки в родительский класс Exception
    }
}