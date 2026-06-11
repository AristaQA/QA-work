package lesson3.task2;

    public interface Figure {
        double getPerimeter();
        double getArea();
        String getFillColor();
        String getBorderColor();

        // Общий вывод характеристик фигуры.
        default void printInfo() {
            System.out.printf("Периметр: %.2f%n", getPerimeter());
            System.out.printf("Площадь: %.2f%n", getArea());
            System.out.println("Цвет заливки: " + getFillColor());
            System.out.println("Цвет границы: " + getBorderColor());
        }
    }
