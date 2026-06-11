package lesson3.task1;

public class MainLesson3Task1 {
    public static void main(String[] args) {
        // Создаем кота, собаку и миску.
        Cat catLoki = new Cat("Локи");
        Dog dogThor = new Dog("Тор");
        Plate plate = new Plate(50);

        // Создаем массив котов.
        Cat[] cats = {
                catLoki,
                new Cat("Халк"),
                new Cat("Доктор Стрэндж"),
                new Cat("Ракета")
        };
        // Проверяем ограничения на бег и плавание.
        System.out.println();
        catLoki.run(160);
        catLoki.swim(3);
        dogThor.run(430);
        dogThor.swim(8);
        System.out.println();

        // Проверяем кормление котов.
        System.out.println("Коты кушают:");
        for (Cat cat : cats) {
            cat.eat(plate, 20);
            cat.printSatiety();
        }

        System.out.println();

        System.out.println("Осталось еды:");
        plate.printFoodInfo();

        System.out.println();

        System.out.println("Добавляем еду:");
        plate.addFood(30);
        plate.printFoodInfo();

        // Выводим количество созданных животных по каждому счётчику.
        System.out.println();
        System.out.println("Животных создано: " + Animal.animalCount);
        System.out.println("Котов создано: " + Cat.catCount);
        System.out.println("Собак создано: " + Dog.dogCount);
    }

}
