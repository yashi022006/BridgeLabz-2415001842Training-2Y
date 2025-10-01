class BankAccount {
    String accountNumber;
    double balance;
    BankAccount(String acc, double bal) {
        this.accountNumber = acc;
        this.balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;
    SavingsAccount(String acc, double bal, double rate) {
        super(acc, bal);
        this.interestRate = rate;
    }
    void displayAccountType() {
        System.out.println("Savings Account");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;
    CheckingAccount(String acc, double bal, double limit) {
        super(acc, bal);
        this.withdrawalLimit = limit;
    }
    void displayAccountType() {
        System.out.println("Checking Account");
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;
    FixedDepositAccount(String acc, double bal, int period) {
        super(acc, bal);
        this.maturityPeriod = period;
    }
    void displayAccountType() {
        System.out.println("Fixed Deposit Account");
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("S1001", 5000, 4.5);
        s.displayAccountType();
        CheckingAccount c = new CheckingAccount("C2001", 2000, 1000);
        c.displayAccountType();
        FixedDepositAccount f = new FixedDepositAccount("F3001", 10000, 12);
        f.displayAccountType();
    }
}

