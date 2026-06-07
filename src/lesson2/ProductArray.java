package lesson2;

public class ProductArray {

    public static void main(String[] args) {

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("iPhone 16 Pro Max", "09.09.2024", "Apple", "USA", 1199.99, true);
        productsArray[1] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung", "Korea", 999.99, false);
        productsArray[2] = new Product("PlayStation 5", "15.11.2023", "Sony", "Japan", 1499.99, true);
        productsArray[3] = new Product("MacBook Air M3", "20.03.2024", "Apple", "USA", 1599.99, false);
        productsArray[4] = new Product("Xiaomi 14", "10.10.2024", "Xiaomi", "China", 699.99, true);

        for (int i = 0; i < productsArray.length; i++) {
            productsArray[i].printInfo();
            System.out.println();
        }
    }
}
