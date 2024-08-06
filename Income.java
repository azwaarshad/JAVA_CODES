
public class Income extends Transaction{
	 public Income(String description, double amount) {
	        super(description, amount);
	    }

	    @Override
	    public String getType() {
	        return "Income";
	    }
}
