package lesson1;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
        System.out.println(sumBetween10and20(2, 7));
        printSignInt(-3);
        System.out.println(checkSignInt(-19));
        printStringNum("Творог", 3);
        System.out.println(checkYear(2024)); // true
        System.out.println(checkYear(1900)); // false
        System.out.println(checkYear(2000)); // true
        System.out.println(checkYear(2023)); // false
        arrayNums();
        fillArrayTo100();
        multiplyLessThanSix();
        fillArrayDiagonals();
        System.out.println(Arrays.toString(createFilledArray(3, 9)));
    }

    // Пункт 1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // Пункт 2
    public static void checkSumSign() {
        int a = 5;
        int b = 3;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // Пункт 3
    public static void printColor() {
        int value = 105;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // Пункт 4
    public static void compareNumbers() {
        int a = 2;
        int b = 6;

        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }

    // Пункт 5
    public static boolean sumBetween10and20(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    // Пункт 6
    public static void printSignInt(int x) {

        if (x >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    // Пункт 7
    public static boolean checkSignInt(int z) {

        if (z < 0) {
            return true;
        } else {
            return false;
        }
    }

    // Пункт 8
    public static void printStringNum(String text, int count) {

        for (int i = 0; i < count; i++) {
            System.out.println(text);

        }
    }

    // Пункт 9
    public static boolean checkYear(int year) {

        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // Пункт 10
    public static void arrayNums() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    //Пункт 11
    public static void fillArrayTo100() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    //Пункт 12
    public static void multiplyLessThanSix() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Пункт 13
    public static void fillArrayDiagonals() {
        int[][] table = new int[4][4];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                if (i == j || i + j == table.length - 1) {
                    table[i][j] = 1;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Пункт 14
    public static int[] createFilledArray(int len, int initialValue) {
        int[] array = new int[len];

        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }
}


