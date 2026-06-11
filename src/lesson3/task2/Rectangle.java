package lesson3.task2;

public class Rectangle implements Figure{
    double width;
    double height;
    String fillColor;
    String borderColor;

    // Создаем прямоугольник с шириной, высотой, цветами.
    public Rectangle(double width, double height, String fillColor, String borderColor) {
        this.width = width;
        this.height = height;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }
    // Считаем периметр прямоугольника: 2 * (ширина + высота).
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Считаем площадь прямоугольника: ширина * высота.
    @Override
    public double getArea() {
        return width * height;
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
