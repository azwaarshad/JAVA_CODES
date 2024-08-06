
public class Account {
	private int accountId;
    private double balance;

    public Account(int accountId) {
        this.accountId = accountId;
        this.balance = 0.0;
    }

    public int getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " to Account ID " + accountId + " processed. New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " from Account ID " + accountId + " processed. New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds in Account ID " + accountId);
        }
    }
}
