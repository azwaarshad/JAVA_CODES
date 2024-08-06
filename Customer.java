import java.util.ArrayList;
import java.util.List;

public class Customer {
	private int customerId;
    private String name;
    private List<Account> accounts;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public int getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("New account added for customer " + name + ". Account ID: " + account.getAccountId());
    }

    public void displayCustomerDetails() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("Accounts:");

        for (Account account : accounts) {
            System.out.println("  Account ID: " + account.getAccountId() + ", Balance: $" + account.getBalance());
        }
    }
}
