class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void addItem(int q) {
        quantity += q;
    }

    void removeItem(int q) {
        if (quantity >= q) quantity -= q;
    }

    void displayTotal() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Shoes", 1500, 2);
        c.addItem(1);
        c.removeItem(1);
        c.displayTotal();
    }
}

