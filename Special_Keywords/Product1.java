class Product {
    private static double discount = 10.0; // %
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public void displayProduct() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

public class Product1 {
    public static void main(String[] args) {
        Product p1 = new Product(301, "Laptop", 60000, 1);
        p1.displayProduct();

        Product.updateDiscount(15);
        Product p2 = new Product(302, "Mobile", 20000, 2);
        p2.displayProduct();
    }
}

