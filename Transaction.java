import java.util.ArrayList;
public class Transaction {
	 private String description;
	    private double amount;

	    public Transaction(String description, double amount) {
	        this.description = description;
	        this.amount = amount;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public double getAmount() {
	        return amount;
	    }

	    public String getType() {
	        return "Transaction";
	    }

	    @Override
	    public String toString() {
	        return getType() + ": " + description + " - $" + amount;
	    }
}
