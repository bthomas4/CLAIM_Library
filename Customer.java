package library;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	
//Properties-----------------------------------------------------------------------------
	private String firstName;
	private String lastName;
	private int customerId;
	private int customerCounter = 0;
	private Address address;
	
	//List of all customer IDs (added when new customer is created)
	private ArrayList<Integer> idList = new ArrayList<Integer>();
	
	//List of books checked out by a customer
	private ArrayList<String> booksCheckedOut = new ArrayList<String>();
	
	
//Constructors--------------------------------------------------------------------------
	//Assigns customerID and adds customer id to idList
	//Increments customersCounter
	Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerId = customerCounter + 1;
		idList.add(customerId);
		customerCounter++; }
	
	
//Methods--------------------------------------------------------------------------------
	//Adds the given book title to booksCheckedOut for the customer
	public void checkOutBook(Book b) {
		booksCheckedOut.add(b.getTitle()); } //will need to change
	
	//Prints out customer name and booksCheckedOut
	public String printCustomerInfo() {
		return toString(); }
	
	//Creates new Address and stores information for the customer
	public void createAddress() {
		Scanner in1 = new Scanner(System.in);
		Scanner in2 = new Scanner(System.in);
		
		System.out.println("Enter the street name:");
		String street = in1.nextLine();
		
		System.out.println("Enter the city name:");
		String city = in1.nextLine();
		
		System.out.println("Enter the 2 digit state:");
		String  state = in1.nextLine();
		
		System.out.println("Enter the 5 digit zip code:");
		String zip = in2.nextLine();

		Address address = new Address(street, city, state, zip);
		System.out.println("Address has been set successfully.\n"); }
	
	
//To String-------------------------------------------------------------------------------
	public String toString() {
		return "" + firstName + " " + lastName + ":\n" + booksCheckedOut
				+ ""; }


//Getters and Setters---------------------------------------------------------------------
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public ArrayList<String> getBooksCheckedOut() {
		return booksCheckedOut;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}	
	
}
