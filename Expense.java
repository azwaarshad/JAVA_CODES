
public class Expense extends Transaction{
	 public Expense(String description, double amount) {
	        super(description, amount);
	    }

	    @Override
	    public String getType() {
	        return "Expense";
	    }
}