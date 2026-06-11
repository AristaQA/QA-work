package lesson3.task1;

public class Cat extends Animal {
    static int catCount;
    // Поле проверки состояния сытости кота.
    boolean satiety;

    public Cat(String name) {
        super(name, 200, 0);
        catCount++;
    }

    // Переопределяем плавание, потому что кот по условию не умеет плавать.
    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    // Выводим текущее состояние сытости кота.
    public void printSatiety() {
        System.out.println(name + " сытость: " + satiety);
    }

    // Кот пытается съесть указанное количество еды из миски.
    // Если еды хватило, кот становится сытым.
    public void eat(Plate plate, int amount) {
        if (plate.reduceFood(amount)) {
            satiety = true;
        }
    }
}
