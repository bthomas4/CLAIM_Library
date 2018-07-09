package library;

import java.util.ArrayList;

public class Book {
	
//Properties-----------------------------------------------------------------------------------
	private String title;
	private String author;
	private int totalPages;
	private int isbn;
	private ArrayList<String> bookTitleList = new ArrayList<String>();
	private ArrayList<Integer> bookISBNList = new ArrayList<Integer>();

	
//Constructors----------------------------------------------------------------------------------
	public Book(String title, String author, int totalPages, int isbn) {
		this.title = title;
		this.author = author;
		this.totalPages = totalPages;
		this.isbn = isbn;
		bookTitleList.add(this.title);
		bookISBNList.add(this.isbn); }
	
	
//To String--------------------------------------------------------------------------------------
	@Override
	public String toString() {
		return "XBook [title=" + title + ", author=" + author + ", totalPages=" + totalPages + ", isbn=" + isbn + "]"; }

	
//Getters and Setters-----------------------------------------------------------------------------

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}	
	
}
