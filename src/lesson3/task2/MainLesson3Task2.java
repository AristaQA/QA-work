package lesson3.task2;

public class MainLesson3Task2 {
    public static void main(String[] args) {

        // Создаем фигуры с размерами и цветами.
        Circle circle = new Circle(8, "Оранжевый", "Серый");
        Rectangle rectangle = new Rectangle(8, 3, "Голубой", "Чёрный");
        Triangle triangle = new Triangle(6, 5, 5, 4, "Фиолетовый", "Белый");

        System.out.println("Круг:");
        circle.printInfo();

        System.out.println();

        System.out.println("Прямоугольник:");
        rectangle.printInfo();

        System.out.println();

        System.out.println("Треугольник:");
        triangle.printInfo();
    }
}