
public class BankAccount {
    private double balance;

    
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Current balance: $" + balance);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Current balance: $" + balance);
            return false;
        } else {
            System.out.println("Withdrawal amount must be positive.");
            return false;
        }
    }

    
    public double checkBalance() {
        return balance;
    }
}
