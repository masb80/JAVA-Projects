package assignments;

import java.util.Collection;

//Add the missing implementation to this class

public class Library {
	String address;
	Book[] collection = {};
	public Library(String location){
	    address = location;
	}
     
	public void addBook(Book book){
		Book[] tmp = new Book[collection.length + 1];
		for (int i = 0; i < collection.length; i++){
            tmp[i] = collection[i];
        }
		tmp[collection.length] = book;
        collection = tmp;		
	}
	
	 public void printAddress(){
	        System.out.println(address);
	    }
	 public static void printOpeningHours(){
	        System.out.println("Libraries are open daily from 9am to 5pm.");
	    }
	 
	 public void borrowBook(String title){
		 boolean in_collection = false;
		 for(int i=0; i < collection.length; i++){
			 if(collection[i].getTitle() == title){
				 if(collection[i].isBorrowed()){
					 System.out.println("Sorroy!, This book is already borrowed");
					 in_collection = true;
				 }else{
					 collection[i].rented();
					 System.out.println("You syccessfully borrowed  " + title);
					 in_collection = true;
				 }	// isBorrowed			 
			 } //getTitle
		 }// collection.length
		 if(!(in_collection)){
			 System.out.println("Sorry!, This book is not in our  catalog");
		 }
		 
	 }// borrowBook
	 
	 public void printAvailableBooks(){
		 boolean empty = true;
		 for(int i=0; i < collection.length; i++){
			 if(!(collection[i].isBorrowed())){
				 System.out.println(collection[i].getTitle());
				 empty = false;
			 }
		 }//isBorrowed
		 if(empty){
			 System.out.println("Sorry!, No book in catalog");
		 } // collection.length
	 }// printAvailableBooks
	 
	public void returnBook(String title){
		boolean in_collection = false;
		for(int i=0; i < collection.length; i++){
			if(collection[i].getTitle()==title){
				if(collection[i].isBorrowed()){
				System.out.println("You syccesfully return the book " + title);
				collection[i].returned(); // return and add to the 1st library
				in_collection = true;
				}
			}				
		}
		if(!(in_collection)){
			System.out.println("Sorry!, this book is not in our catalog");
		}
	}
	
	public static void main(String[] args) {
		// Create two libraries
		
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Add four books to the first library
        
        firstLibrary.addBook(new Book("The Da Vinci Code"));
        firstLibrary.addBook(new Book("Le Petit Prince"));
        firstLibrary.addBook(new Book("A Tale of Two Cities"));
        firstLibrary.addBook(new Book("The Lord of the Rings"));

        // Print opening hours and the addresses
        
        System.out.println("Library hours:");
        printOpeningHours();
        System.out.println();

        System.out.println("Library addresses:");
        firstLibrary.printAddress();
        secondLibrary.printAddress();
        System.out.println();

        // Try to borrow The Lords of the Rings from both libraries
        
        System.out.println("Borrowing The Lord of the Rings:");
        firstLibrary.borrowBook("The Lord of the Rings");
       // firstLibrary.borrowBook("The Lord of the Rings");
        secondLibrary.borrowBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of all available books from both libraries
        
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();
        System.out.println();
        System.out.println("Books available in the second library:");
        secondLibrary.printAvailableBooks();
        System.out.println();

        // Return The Lords of the Rings to the first library
        
        System.out.println("Returning The Lord of the Rings:");
        firstLibrary.returnBook("The Lord of the Rings");
        System.out.println();

        // Print the titles of available from the first library
        
        System.out.println("Books available in the first library:");
        firstLibrary.printAvailableBooks();

	}

}
