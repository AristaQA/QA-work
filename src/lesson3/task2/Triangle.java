package lesson3.task2;

public class Triangle implements Figure {
    double sideA;
    double sideB;
    double sideC;
    double height;
    String fillColor;
    String borderColor;

    // Создаем треугольник: 3 стороны для периметра, высота для площади.
    public Triangle(double sideA, double sideB, double sideC, double height, String fillColor, String borderColor) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    // Считаем периметр треугольника.
    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    // Считаем площадь треугольника: основание * высота / 2.
    @Override
    public double getArea() {
        return sideA * height / 2;
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