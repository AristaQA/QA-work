package lesson3.task1;

public class Animal {
    String name;
    int runLimit;
    int swimLimit;

    // Общий счетчик всех созданных животных.
    static int animalCount;

    // Конструктор создания животного.
    public Animal (String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        animalCount++;
    }
    // Ниже два метода проверяют, может ли животное пробежать и проплыть переданную дистанцию.
    public void run(int distance) {

        if (distance <= runLimit) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }
    public void swim(int distance) {

        if (distance <= swimLimit) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м.");
        }
    }
}


