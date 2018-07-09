package library;

import java.util.Scanner;

public class MainWork {

	public static void main(String[] args) {
		
		//Creating instances to work with-----------------------------------------------------------------------------------
		//Add books to libraries
		//Check out books to customers
		Book b1 = new Book("Pennies To Nickels", "James Madison", 300, 93947);
		Book b2 = new Book("Being the First President", "George Washington", 398, 39574);
		Book b3 = new Book("Amused Are You Not?", "Yoda", 129, 39575);
		Book b4 = new Book("Guitar Licks", "Jimmy Hendrix", 548, 92013);
		Book b5 = new Book("Where's Waldo", "Waldo Himself", 297, 66847);
		Book b6 = new Book("Hacking 101", "Fancy Bear", 893, 39475);
		
		Customer c1 = new Customer("Abe", "Lincoln");
		Customer c2 = new Customer("Sigmund", "Freud");
		Customer c3 = new Customer("Bill", "Gates");
				
		Library l1 = new Library(1, "Columbia");
		Library l2 = new Library(2, "Ballwin");
		
		l1.addBookToLibrary(b1);
		l1.addBookToLibrary(b6);
		l1.addBookToLibrary(b5);
		l1.addBookToLibrary(b4);
		l2.addBookToLibrary(b2);
		l2.addBookToLibrary(b3);
		
		c1.checkOutBook(b1);
		c1.checkOutBook(b4);
		c2.checkOutBook(b1);
		c2.checkOutBook(b6);
		c2.checkOutBook(b5);
		c3.checkOutBook(b2);
		c3.checkOutBook(b3);
		c3.checkOutBook(b1);		
	
		
		//Running Main Menu----------------------------------------------------------------------------------------------------
		boolean inTheZone = true;
		System.out.println("Welcome to Library Tracker!\n");
		
		while (inTheZone == true) {
			System.out.println("What would you like to do?\n"
					+ "1: Count the books in a library\n"
					+ "2: Add an address to a customer\n"
					+ "3: Find out which library a book is in\n"
					+ "4: Add a customer to a library\n"
					+ "5: Find out which books a customer checked out\n"
					+ "0: Exit Library Tracker"); 
		
			Scanner mainMenu = new Scanner(System.in);
			int mainMenuIn = mainMenu.nextInt();
			
			switch (mainMenuIn) {
			
			//Count the total number of books in a library----------------------------------------------------------------------
			case 1: 
					//Determine which library to query
					System.out.println("There are 2 libraries near you: " + l1.getCity() + " and " + l2.getCity());		
					Scanner inLibLoc = new Scanner(System.in);
					System.out.println("Enter the location of the library you would like to search:");				
					String libLocation = inLibLoc.nextLine().toLowerCase(); //Handling String case errors
				
					//Compare user input (libLocation) to possible (library) city names
					if (libLocation.equals(l1.getCity().toLowerCase())) {
						System.out.println("The " + l1.getCity() + " library has " + (countBooks(l1)) + " books.\n"); }
					else if (libLocation.equals(l2.getCity().toLowerCase())) {
						System.out.println("The " + l2.getCity() + " library has " + (countBooks(l2)) + " books.\n"); }
					else {
						System.out.println("Error: Not a valid input."); } 
					break;
				
					
			//Add addresses to customers----------------------------------------------------------------------------------------
			case 2:
					System.out.println("Which customer would you like to set the address for?\n"
					+ "1: Customer 1\n"
					+ "2: Customer 2\n"
					+ "3: Customer 3\n"
					+ "0: All customers");		
					
					boolean deciding2 = true;
					while (deciding2 == true) {
						Scanner inChoice2 = new Scanner(System.in);
						int userChoice2 = inChoice2.nextInt();
				
						switch (userChoice2) {
						case 0: c1.createAddress(); c2.createAddress(); c3.createAddress(); deciding2 = false;
							break;
						case 1: c1.createAddress(); deciding2 = false;
							break;
						case 2: c2.createAddress(); deciding2 = false;
							break;
						case 3: c3.createAddress(); deciding2 = false;
							break;
						default: System.out.println("Error: Not a valid input.\n"); }}
					break;
			
					
			//Find out which library a book is in (by title or ISBN)-----------------------------------------------------------
			case 3: 
					//Determine is search is for title or ISBN
					boolean deciding3 = true;
					while (deciding3 == true) {
						Scanner inChoice3 = new Scanner(System.in);
						System.out.println("How would you like to search for the book? (title/isbn)");
						String userChoice3 = inChoice3.nextLine().toLowerCase(); //Handling String case errors
				
						//Search is by title
						if (userChoice3.equals("title")) {
							Scanner inSubA = new Scanner(System.in);
							System.out.println("Enter the title of the book:");
							String subA = inSubA.nextLine().toLowerCase(); //Handling String case errors
								
							//Scan l1 and l2 book title arrays for user input
							if (l1.getLibBookTitleArray().contains(subA)) {
								System.out.println("Your book is at the " + l1.getCity() + " library.\n");
								deciding3 = false; }
							else if (l2.getLibBookTitleArray().contains(subA)) {
								System.out.println("Your book is at the " + l2.getCity() + " library.\n");
								deciding3 = false; }
							else { System.out.println("Sorry, that book is not in stock.\n");
								deciding3 = false; }}
				
						//Search is by ISBN
						else if (userChoice3.equals("isbn")) {
							Scanner inSubB = new Scanner(System.in);
							System.out.println("Enter the isbn of the book:");
							int subB = inSubB.nextInt();
					
							//Scan l1 and l2 book ISBN arrays for user input
							if (l1.getLibBookISBNArray().contains(subB)) {
								System.out.println("Your book is at the " + l1.getCity() + " library.");
								deciding3 = false; }
							else if (l2.getLibBookISBNArray().contains(subB)) {
								System.out.println("Your book is at the " + l2.getCity() + " library.");
								deciding3 = false; }
							else { System.out.println("Sorry, that book is not in stock.");
								deciding3 = false; }}
				
						//Error in user input
						else {
							System.out.println("Error: Not a valid option.\n"); }}
						break; 
				
						
			//Add a customer to a library---------------------------------------------------------------------------------------		
			case 4:
					boolean deciding4Lib = true;
					while (deciding4Lib == true) {
						System.out.println("Which library would you like to select?\n"
								+ "1: " + l1.getCity() + "\n"
								+ "2: " + l2.getCity() + "\n"
								+ "0: Exit customer adding");
						
						Scanner inChoice4a = new Scanner(System.in);
						int userChoice4 = inChoice4a.nextInt();
							
						if (userChoice4 == 1) {
							boolean deciding4a = true;
							while (deciding4a == true) {
								System.out.println("Which customer would you like to add?\n"
										+ "1: " + c1.getFirstName() + " " + c1.getLastName() + "\n"
										+ "2: " + c2.getFirstName() + " " + c2.getLastName() + "\n"
										+ "3: " + c3.getFirstName() + " " + c3.getLastName() + "\n"
										+ "4: Add all customers.");
								
								Scanner inChoice4b =new Scanner(System.in);
								int userChoice4b = inChoice4b.nextInt();
									
								switch (userChoice4b) {
								case 1: l1.addCustomerToLib(c1);
										deciding4a = false;
										System.out.println(c1.getFirstName() + " was added to the " + l1.getCity() + " library.\n");
										break;
											
								case 2: l1.addCustomerToLib(c2);
										deciding4a = false;
										System.out.println(c2.getFirstName() + " was added to the " + l1.getCity() + " library.\n");
										break;
											
								case 3: l1.addCustomerToLib(c3);
										deciding4a = false;
										System.out.println(c3.getFirstName() + " was added to the " + l1.getCity() + " library.\n");
										break;
											
								case 4: l1.addCustomerToLib(c1);
										l1.addCustomerToLib(c2);
										l1.addCustomerToLib(c3);
										deciding4a = false;
										System.out.println(c1.getFirstName() + ", " + c2.getFirstName() + ", and " + c3.getFirstName() + " were added to the " + l1.getCity() + " library.\n");
										break;
										
								default: System.out.println("Error: Not a valid input."); }}
							}//if close
							
							
						else if (userChoice4 == 2) {
							boolean deciding4b = true;
							while (deciding4b == true) {
								System.out.println("Which customer would you like to add?\n"
										+ "1: " + c1.getFirstName() + " " + c1.getLastName() + "\n"
										+ "2: " + c2.getFirstName() + " " + c2.getLastName() + "\n"
										+ "3: " + c3.getFirstName() + " " + c3.getLastName() + "\n"
										+ "4: Add all customers.\n");
								
								Scanner inChoice4b =new Scanner(System.in);
								int userChoice4b = inChoice4b.nextInt();
									
								switch (userChoice4b) {
								case 1: l2.addCustomerToLib(c1);
										deciding4b = false;
										System.out.println(c1.getFirstName() + " was added to the " + l2.getCity() + " library.");
										break;
											
								case 2: l2.addCustomerToLib(c2);
										deciding4b = false;
										System.out.println(c2.getFirstName() + " was added to the " + l2.getCity() + " library.");
										break;
											
								case 3: l2.addCustomerToLib(c3);
										deciding4b = false;
										System.out.println(c3.getFirstName() + " was added to the " + l2.getCity() + " library.");
										break;
											
								case 4: l2.addCustomerToLib(c1);
										l2.addCustomerToLib(c2);
										l2.addCustomerToLib(c3);
										deciding4b = false;
										System.out.println(c1.getFirstName() + ", " + c2.getFirstName() + ", and " + c3.getFirstName() + " were added to the " + l2.getCity() + " library.\n");
										break;
										
								default: System.out.println("Error: Not a valid input."); }}}//else if close
							
							
						else if (userChoice4 == 0) {
							deciding4Lib = false; }
							
							
						else { System.out.println("Error: Not a valid input."); }}//while close
						break;
					
			//Print a customer's name and all books they checked out------------------------------------------------------------
			case 5: 
					boolean deciding5 = true;
					while (deciding5 == true) {
						System.out.println("Which customer would you like to search?\n"
								+ "1: " + c1.getFirstName() + " " + c1.getLastName() + "\n"
								+ "2: " + c2.getFirstName() + " " + c2.getLastName() + "\n"
								+ "3: " + c3.getFirstName() + " " + c3.getLastName() + "\n"
								+ "4: Search all customers.\n"
								+ "0: Exit customer book search.");
						
						Scanner inChoice5 = new Scanner(System.in);
						int userChoice5 = inChoice5.nextInt();
						
						switch (userChoice5) {
						case 1: System.out.println("Books checked out by " + c1.printCustomerInfo() + "\n");
								break;
							
						case 2: System.out.println("Books checked out by " + c2.printCustomerInfo() + "\n");
								break;
								
						case 3: System.out.println("Books checked out by " + c3.printCustomerInfo() + "\n");
								break;
						
						case 4: System.out.println("Books checked out by " + c1.printCustomerInfo() + "\n");
								System.out.println("Books checked out by " + c2.printCustomerInfo() + "\n");
								System.out.println("Books checked out by " + c3.printCustomerInfo() + "\n");
								break;
						
						case 0: deciding5 = false;
								break;
								
						default: System.out.println("Error: Not a valid input."); }}
						break;
				
					
			//Exit the Main Menu------------------------------------------------------------------------------------------------
			case 0: 
					inTheZone = false;
					break;
			
					
			//Handling input error----------------------------------------------------------------------------------------------
			default: System.out.println("Error: Not a valid input. Please re-enter a number:"); }}
		
		
	//Exiting statement after main while loop closes
	System.out.println("Exiting Library Tracker. Have a nice day!");
	}
		
	
	//Counts total books within the given library
	public static int countBooks(Library l) {
		return l.countTotalBooks();
	}
	
}
