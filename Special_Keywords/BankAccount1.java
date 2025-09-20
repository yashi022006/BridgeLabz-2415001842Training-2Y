class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber;
    private double balance;

    
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber; // final variable
        this.balance = balance;
        totalAccounts++;
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) { // instanceof check
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}

public class BankAccount1{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Amit", 101, 5000);
        BankAccount acc2 = new BankAccount("Sita", 102, 8000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        BankAccount.getTotalAccounts();
    }
}
