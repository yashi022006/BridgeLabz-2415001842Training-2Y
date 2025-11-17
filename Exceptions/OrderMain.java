import java.util.Random;

class OutOfStockException extends Exception {
    public OutOfStockException(String msg) {
        super(msg);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String msg) {
        super(msg);
    }
}

class OrderSystem {
    public void placeOrder() throws OutOfStockException, PaymentFailedException {
        Random r = new Random();
        int event = r.nextInt(3); // 0,1,2

        if (event == 0) {
            throw new OutOfStockException("Product is out of stock!");
        } else if (event == 1) {
            throw new PaymentFailedException("Payment could not be completed!");
        } else {
            System.out.println("Order placed successfully!");
        }
    }
}

public class OrderMain {
    public static void main(String[] args) {
        OrderSystem os = new OrderSystem();

        try {
            os.placeOrder();
        } catch (OutOfStockException e) {
            System.out.println("Order Failed: " + e.getMessage());
        } catch (PaymentFailedException e) {
            System.out.println("Order Failed: " + e.getMessage());
        }
    }
}
