package lesson3.task1;

public class Dog extends Animal {
        static int dogCount;

        public Dog(String name) {
            super(name, 500, 10);
            dogCount++;
        }
}

