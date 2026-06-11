package lesson3.task2;

public class Circle implements Figure {
    double radius;
    String fillColor;
    String borderColor;

    // Создаём круг с радиусом и цветами.
    public Circle(double radius, String fillColor, String borderColor) {
        this.radius = radius;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Считаем периметр круга: 2 * 3,14 * радиус.
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Считаем площадь круга: 3,14 * радиус * радиус.
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Возвращаем цвет заливки.
    @Override
    public String getFillColor() {
        return fillColor;
    }

    // Возвращаем цвет границы.
    @Override
    public String getBorderColor() {
        return borderColor;
    }
}