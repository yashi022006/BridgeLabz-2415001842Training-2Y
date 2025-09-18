class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

    void display(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        Item i = new Item(101, "Laptop", 45000);
        i.display(2);
    }
}

