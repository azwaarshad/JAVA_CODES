
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Binding and Coupling is used
		Book book1 = new EBook("Java Programming", "John Doe", "PDF");
        book1.displayInfo(); // Dynamic binding is used, Calls displayInfo of EBook at runtime

        //Casting is used
        if (book1 instanceof EBook) {
            EBook eBook = (EBook) book1; //Downcasting is used
            eBook.readEBook(); //Accessing EBook-specific method after casting
        }
	}

}
