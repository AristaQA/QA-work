package lesson5.task2;

public class MainPhoneBook {

    public static void main(String[] args) {

        // Создаём телефонный справочник.
        PhoneBook phoneBook = new PhoneBook();

        // Добавляем фамилии и номера.
        phoneBook.add("Документов", "325-15-12");
        phoneBook.add("Косицина", "356-00-42");
        phoneBook.add("Сидоров", "322-11-05");
        phoneBook.add("Сидоров", "315-82-35");

        // Ищем все номера по фамилии.
        phoneBook.get("Сидоров");
        phoneBook.get("Шевчук");
    }
}