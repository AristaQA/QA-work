package lesson2;

public class ParkDemo {
    public static void main(String[] args) {

        Park park = new Park();

        Park.Attraction hauntedHouse = park.new Attraction("Дом с привидениями", "09:00 - 21:00", 450);
        Park.Attraction waterSlide = park.new Attraction("Водная горка", "09:00 - 21:00", 300);

        hauntedHouse.printInfo();
        System.out.println();

        waterSlide.printInfo();
        System.out.println();
    }
}
