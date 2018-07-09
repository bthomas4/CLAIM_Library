package library;

import java.util.ArrayList;

public class Library {
	
//Properties-------------------------------------------------------------------------------
	private int branchId;
	private int idCounter = 0;
	private String city;
	private int currentBookCount = 0;
	
	//Array of book objects within a library
	private ArrayList<Book> bookList = new ArrayList<Book>();
	
	//Array of book titles for a given library
	private ArrayList<String> libBookTitlesArray = new ArrayList<String>();
	
	//Array of book ISBNs for a given library
	private ArrayList<Integer> libBookISBNsArray = new ArrayList<Integer>();
	
	//Array of customers for a given library
	private ArrayList<Customer> cList = new ArrayList<Customer>();
	
	
//Constructors-----------------------------------------------------------------------------
	//Assigns branchID and increments the counter upon creation
	public Library(int branchId, String city) {
		this.branchId = idCounter + 1;
		this.city = city;
		idCounter++; }
	
	
//Methods----------------------------------------------------------------------------------
	//Counts total books (needs to be called by a library)
	public int countTotalBooks() {
		return currentBookCount; }
	
	//Adds a book to a library's inventory
	//Converts book title to lower case
	public void addBookToLibrary(Book b) {
		libBookTitlesArray.add(b.getTitle().toLowerCase());
		libBookISBNsArray.add(b.getIsbn());
		bookList.add(b);
		currentBookCount++; }
	
	//Adds a customer to a library's list
	public void addCustomerToLib(Customer c) {
		cList.add(c); }
	
	
//To Strings--------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "Library [branchId=" + branchId + ", city=" + city + ", bookTitleArray=" + libBookTitlesArray
				+ ", bookISBNArray=" + libBookISBNsArray + "]"; }
	
	
//Getters and Setters------------------------------------------------------------------------
	public int getBranchId() {
		return branchId;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public ArrayList<String> getLibBookTitleArray() {
		return libBookTitlesArray;
	}

	public void setLibBookTitleArray(ArrayList<String> libBookTitleArray) {
		this.libBookTitlesArray = libBookTitleArray;
	}

	public ArrayList<Integer> getLibBookISBNArray() {
		return libBookISBNsArray;
	}

	public void setLibBookISBNArray(ArrayList<Integer> libBookISBNArray) {
		this.libBookISBNsArray = libBookISBNArray;
	}
	
}
