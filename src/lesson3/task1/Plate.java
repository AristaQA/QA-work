package lesson3.task1;

public class Plate {
    int food;

    // Создаем миску с начальным количеством еды.
    public Plate(int food) {
        this.food = food;
    }

    // Метод уменьшает кол-во еды и возвращает true, если кот поел.
    // И возвращает false, если еды недостаточно.
    public boolean reduceFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }
    // Добавляет еду в миску.
    public void addFood(int amount) {
        food += amount;
    }
    // Выводит текущее количество еды в миске.
    public void printFoodInfo() {
        System.out.println("Еды в миске: " + food);
    }
}
