import java.util.Random;

class NegativeAmountException extends Exception {
    public NegativeAmountException(String msg) {
        super(msg);
    }
}

class InsufficientFundsException2 extends Exception {
    public InsufficientFundsException2(String msg) {
        super(msg);
    }
}

class NetworkFailureException extends Exception {
    public NetworkFailureException(String msg) {
        super(msg);
    }
}

class Transaction {
    private int balance = 5000;

    public void process(int amount) throws NegativeAmountException,
            InsufficientFundsException2, NetworkFailureException {

        Random r = new Random();
        int event = r.nextInt(3);

        if (amount < 0) {
            throw new NegativeAmountException("Amount cannot be negative!");
        }

        if (event == 0) {
            throw new InsufficientFundsException2("Not enough balance!");
        } else if (event == 1) {
            throw new NetworkFailureException("Network error! Try again.");
        } else {
            System.out.println("Transaction successful!");
        }
    }
}

public class TransactionMain{
    public static void main(String[] args) {
        Transaction t = new Transaction();

        try {
            t.process(2000);
        } catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException2 e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NetworkFailureException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
