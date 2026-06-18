package lesson4;

// Своя ошибка для неправильного размера массива
public class MyArraySizeException extends Exception {

    // Конструктор принимает текст ошибки
    public MyArraySizeException(String message) {
        super(message); // передаем текст ошибки в родительский класс Exception
    }
}