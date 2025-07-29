// BankAccount.java - This class encapsulates account details
class BankAccount {
    // 1. Data (account balance) is private, meaning it's hidden
    private double balance;
    private String accountNumber;

    // Constructor to set initial values
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        // You can add validation here, e.g., initialBalance should not be negative
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    // 2. Public methods (getter) to read the balance
    public double getBalance() {
        return balance;
    }

    // 3. Public methods (setter-like) to modify the balance safely
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + this.balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + this.balance);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Getter for account number (no setter as it shouldn't change)
    public String getAccountNumber() {
        return accountNumber;
    }
}

// Main.java - To test our BankAccount
public class BankAccountInfo {
    public static void main(String[] args) {
        // Create a bank account
        BankAccount myAccount = new BankAccount("123456789", 1000.0);

        // Try to access balance directly (NOT ALLOWED, compiler error!)
        // myAccount.balance = 5000.0; // This line would cause an error!

        // Access balance safely using the getter method
        System.out.println("Current Balance: " + myAccount.getBalance());

        // Modify balance safely using deposit and withdraw methods
        myAccount.deposit(200.0);
        myAccount.withdraw(150.0);
        myAccount.withdraw(2000.0); // This will fail due to insufficient balance
        myAccount.deposit(-50.0);   // This will fail due to negative amount

        System.out.println("Final Balance: " + myAccount.getBalance());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
    }
}