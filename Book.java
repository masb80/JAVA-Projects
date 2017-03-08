package assignments;

public class Book {

	
		String title;
		boolean borrowed;
		// Creates a new Book
		public Book(String bookTitle){
		// Implement this method
			title = bookTitle;
			borrowed = false;
		}
		// Marks the book as rented
		public void borrowed() {
		// Implement this method
			borrowed = true;
		}
		
		public void rented() {
			// Implement this method
				borrowed = true;
			}
		
		
		// Marks the book as not rented
		public void returned() {
		// Implement this method
			borrowed = false;
		}
		// Returns true if the book is rented, false otherwise
		public boolean isBorrowed() {
		// Implement this method
			return borrowed ;
			
		}
		// Returns the title of the book
		public String getTitle() {
			return title;
					
		// implement this method
		}
		public static void main(String[] args) {
		// Small test of the Book class
		Book example = new Book("The Da Vinci Code");
		//System.out.println("Title (should be The Da Vinci Code): " + example;
		System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
		
		System.out.println("Rented? (should be false): " + example.isBorrowed());
		
		example.rented();
		
		System.out.println("Rented? (should be true): " + example.isBorrowed());
		
		example.returned();
		
		System.out.println("Rented? (should be false): " + example.isBorrowed());
		
	}

}
