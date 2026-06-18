package lesson4;

public class MainException {

    public static void main(String[] args) {

        // Создаем правильный массив 4 на 4
        String[][] array = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        // Проверяем наш метод sumArray
        try {
            int result = sumArray(array);
            System.out.println("Сумма массива: " + result);

        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());

        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }


        // Отдельно генерируем и ловим ArrayIndexOutOfBoundsException
        try {
            int[] numbers = {1, 2, 3};

            // Ошибка: в массиве есть индексы 0, 1, 2
            // А мы специально обращаемся к индексу 5
            System.out.println(numbers[7]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: вышли за границы массива");
        }
    }


    // Метод принимает двумерный строковый массив
    // throws показывает, что метод может выбросить наши ошибки
    public static int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {

        // Проверяем количество строк
        if (array.length != 4) {
            throw new MyArraySizeException("Массив должен быть 4x4");
        }

        // Проверяем количество элементов в каждой строке
        for (int i = 0; i < array.length; i++) {

            if (array[i].length != 4) {
                throw new MyArraySizeException("Массив должен быть 4x4");
            }
        }

        // Здесь будем хранить сумму
        int sum = 0;

        // Идем по строкам массива
        for (int i = 0; i < array.length; i++) {

            // Идем по ячейкам внутри строки
            for (int j = 0; j < array[i].length; j++) {

                try {
                    // Берем текст из ячейки
                    String text = array[i][j];

                    // Переводим текст в число
                    int number = Integer.parseInt(text);

                    // Добавляем число к сумме
                    sum = sum + number;

                } catch (NumberFormatException e) {

                    // Если в ячейке не число, выбрасываем свою ошибку
                    throw new MyArrayDataException("Неверное значение в ячейке [" + i + "][" + j + "]");
                }
            }
        }

        // Возвращаем готовую сумму
        return sum;
    }
}