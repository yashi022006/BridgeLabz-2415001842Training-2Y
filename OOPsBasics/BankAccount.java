class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String holder, int number, double bal) {
        accountHolder = holder;
        accountNumber = number;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else System.out.println("Insufficient Balance");
    }

    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Arjun", 12345, 1000);
        acc.deposit(500);
        acc.withdraw(300);
        acc.displayBalance();
    }
}

