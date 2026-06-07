package lesson2;

public class Product {

     String name;
     String productionDate;
     String company;
     String country;
     double price;
     boolean isBooked;

     public Product(String name, String productionDate, String company, String country, double price, boolean isBooked) {
    this.name = name;
    this.productionDate = productionDate;
    this.company = company;
    this.country = country;
    this.price = price;
    this.isBooked = isBooked;
}
    public void printInfo() {
        System.out.println("Название: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + company);
        System.out.println("Страна происхождения: " + country);
        System.out.println("Цена: " + price + " $");
        System.out.println("Забронирован: " + isBooked);
    }
}






