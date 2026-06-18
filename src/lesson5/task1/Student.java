package lesson5.task1;

import java.util.List;

public class Student {
    String name;
    String group;
    int course;
    List<Integer> grades;

    public Student(String name, String group, int course, List<Integer> grades) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grades = grades;
    }

    // Считаем средний бал студента.
    public double getAverageGrade() {
        double sum = 0;

        for (int grade : grades) {
            sum = sum + grade;
        }

        return sum / grades.size();
    }
}
