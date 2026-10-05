class BankAccount {

    private String accountNumber;
    private String customerName;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String customerName,
                       double balance) {

        this.accountNumber = accountNumber;
        this.customerName = customerName;

        if (balance >= 0) {
            this.balance = balance;
        } else {
            this.balance = 0;
        }
    }

    // Get balance
    public double getBalance() {
        return balance;
    }

    // Update balance
    public void setBalance(double balance) {

        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Display account information
    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Balance: $" + balance);
    }
}


public class question2 {

    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("ACC2001", "ladan", 300);

        BankAccount account2 =
                new BankAccount("ACC2002", "abdulahi", 750);

        account1.displayAccount();

        System.out.println();

        account2.displayAccount();

        System.out.println();

        // Reading the balance
        System.out.println("Account 1 Balance: $"
                + account1.getBalance());

        // Updating the balance
        account1.setBalance(650);

        System.out.println("Updated Balance: $"
                + account1.getBalance());
    }
}