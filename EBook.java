
public class EBook extends Book {
	private String format;

    public EBook(String title, String author, String format) {
        super(title, author);
        this.format = format;
    }
    
    public String getFormat() {
    	return format;
    }
    
    public void setFormat() {
    	this.format = format;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Format: " + format);
    }

    public void readEBook() {
        System.out.println("Book is reading in " + format + " format");
    }
}
