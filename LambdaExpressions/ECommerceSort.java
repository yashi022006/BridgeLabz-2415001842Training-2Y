import java.util.*;

class Product {
    String name;
    double price;
    double rating;

    public Product(String name, double price, double rating) {
        this.name = name; this.price = price; this.rating = rating;
    }

    public String toString() {
        return name + " - ₹" + price + " - ⭐" + rating;
    }
}

public class ECommerceSort {
    public static void main(String[] args) {
        List<Product> list = Arrays.asList(
                new Product("Shoes", 1500, 4.5),
                new Product("Watch", 2500, 4.8),
                new Product("Bag", 900, 4.2)
        );

        System.out.println("\nSort by Price:");
        list.stream()
                .sorted((p1, p2) -> Double.compare(p1.price, p2.price))
                .forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        list.stream()
                .sorted((p1, p2) -> Double.compare(p2.rating, p1.rating))
                .forEach(System.out::println);
    }
}

