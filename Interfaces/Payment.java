package Interfaces;

// DigitalPayment.java
interface DigitalPayment {
    void pay(double amount);
}

class UPI implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditCard implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class Wallet implements DigitalPayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " from Wallet balance.");
    }
}

public class Payment {
    public static void main(String[] args) {
        DigitalPayment upi = new UPI();
        DigitalPayment card = new CreditCard();
        DigitalPayment wallet = new Wallet();

        upi.pay(500);
        card.pay(1200);
        wallet.pay(300);
    }
}

