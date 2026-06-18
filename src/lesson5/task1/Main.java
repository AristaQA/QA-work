package lesson5.task1;

import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Создаём пустую коллекцию студентов.
        Set<Student> students = new HashSet<>();

        // Создаём список оценок Гарри.
        ArrayList<Integer> harryGrades = new ArrayList<>();
        harryGrades.add(3);
        harryGrades.add(4);
        harryGrades.add(5);

        // Создаём объект студента.
        Student harry = new Student(
                "Гарри Поттер",
                "Гриффиндор",
                1, harryGrades);

        // Добавляем Гарри в коллекцию студентов.
        students.add(harry);

        // Повторяем для других студентов.
        ArrayList<Integer> hermioneGrades = new ArrayList<>();
        hermioneGrades.add(5);
        hermioneGrades.add(5);
        hermioneGrades.add(5);

        Student hermione = new Student(
                "Гермиона Грейнджер",
                "Гриффиндор",
                1, hermioneGrades);
        students.add(hermione);

        ArrayList<Integer> dracoGrades = new ArrayList<>();
        dracoGrades.add(4);
        dracoGrades.add(3);
        dracoGrades.add(4);

        Student draco = new Student(
                "Драко Малфой",
                "Слизерин",
                1, dracoGrades);
        students.add(draco);

        ArrayList<Integer> ronGrades = new ArrayList<>();
        ronGrades.add(2);
        ronGrades.add(2);
        ronGrades.add(3);

        Student ron = new Student(
                "Рон Уизли",
                "Гриффиндор",
                1, ronGrades);
        students.add(ron);


        System.out.println("Студенты 1 курса:");
        printStudents(students, 1);
        removeLowGradeStudents(students);
        promoteStudents(students);
        System.out.println();
        System.out.println("Студенты 2 курса:");
        printStudents(students, 2);

    }

    // Удаляет студентов со средним баллом меньше 3.
    public static void removeLowGradeStudents(Set<Student> students) {

        // Создаём копию коллекции, чтобы безопасно удалять из оригинала.
        Set<Student> studentsCopy = new HashSet<>(students);

        for (Student student : studentsCopy) {
            if (student.getAverageGrade() < 3) {
                students.remove(student);
            }
        }
    }

    // Переводит студентов со средним баллом 3 и выше на следующий курс.
    public static void promoteStudents(Set<Student> students) {

        for (Student student : students) {
            if (student.getAverageGrade() >= 3) {
                student.course++;
            }
        }
    }

    // Печатает имена студентов указанного курса.
    public static void printStudents(Set<Student> students, int course) {

        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
            }
        }
    }
}
