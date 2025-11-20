package interfaces;

interface PaymentProcessor {
    void processPayment(double amount);

    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated (default).");
    }
}

class RazorPay implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processed ₹" + amount + " via RazorPay.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        PaymentProcessor pay = new RazorPay();
        pay.processPayment(1000);
        pay.refund(1000);
    }
}

