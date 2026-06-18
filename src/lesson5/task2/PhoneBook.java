package lesson5.task2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    // Ключ — фамилия, значение — список телефонных номеров.
    Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    // Добавляет телефонный номер по фамилии.
    public void add(String surname, String phoneNumber) {

        // Проверяем, есть ли такая фамилия в справочнике.
        if (phoneBook.containsKey(surname)) {

            // Если фамилия уже есть, добавляем новый номер в её список.
            phoneBook.get(surname).add(phoneNumber);

        } else {

            // Если фамилии нет, создаём новый список номеров.
            ArrayList<String> phoneNumbers = new ArrayList<>();

            // Добавляем первый номер в список.
            phoneNumbers.add(phoneNumber);

            // Добавляем фамилию и список номеров в справочник.
            phoneBook.put(surname, phoneNumbers);
        }
    }
    // Ищет и выводит номера телефонов по фамилии.
    public void get(String surname) {

        // Проверяем, есть ли фамилия в справочнике.
        if (phoneBook.containsKey(surname)) {

            // Получаем и выводим весь список номеров этой фамилии.
            System.out.println(phoneBook.get(surname));

        } else {

            System.out.println("Фамилия не найдена");
        }
    }
}
