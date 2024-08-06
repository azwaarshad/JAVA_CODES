import java.util.ArrayList;
public class FinanceApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Transaction> transactions = new ArrayList<>();

        // Adding transactions to the list
        transactions.add(new Income("Salary", 3000.0));
        transactions.add(new Expense("Groceries", 150.0));
        transactions.add(new Income("Freelance Work", 500.0));
        transactions.add(new Expense("Utilities", 100.0));
        transactions.add(new Income("Owner", 200.00));
        transactions.add(new Expense("Wardrobe", 50.0));

        // Displaying all transactions
        System.out.println("All Transactions:");
        displayTransactions(transactions);

        // Displaying only expenses
        System.out.println("\nExpenses Only:");
        displayExpenses(transactions);
    }

    // Display all transactions using polymorphism
    private static void displayTransactions(ArrayList<Transaction> transactions) {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }
    }

    // Display only expenses using polymorphism
    private static void displayExpenses(ArrayList<Transaction> transactions) {
        for (Transaction transaction : transactions) {
            if (transaction instanceof Expense) {
                System.out.println(transaction);
            }
        }
 
	}

}
