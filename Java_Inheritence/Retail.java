class Order {
    String orderId, orderDate;
    Order(String id, String date) {
        this.orderId = id;
        this.orderDate = date;
    }
    String getOrderStatus() {
        return "Order placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(String id, String date, String tracking) {
        super(id, date);
        this.trackingNumber = tracking;
    }
    String getOrderStatus() {
        return "Order shipped, Tracking: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(String id, String date, String tracking, String deliveryDate) {
        super(id, date, tracking);
        this.deliveryDate = deliveryDate;
    }
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}

public class Retail {
    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder("O123", "2025-09-29", "TRK1001", "2025-10-01");
        System.out.println(d.getOrderStatus());
    }
}

