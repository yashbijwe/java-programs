package com.nit.ArrayList8_12_2025;


import java.util.List;
public class Admin  {
	   public static final String USER_NAME = "LocalAdmin";
	   public static final String PASSWORD = "Admin@9090";

	   private LibraryManagement library;

	   public Admin(LibraryManagement library) {
	       super();
	       this.library = library;
	   }

	   public void addBook(Book book) {
	       library.addBook(book);
	   }

	   public boolean removeBookByTitle(String title) {
	       return library.removeBookByTitle(title);
	   }

	   public Book searchBookByTitle(String title) {
	       return library.searchBookByTitle(title);
	   }

	   public Book searchBookByISBN(String iSBN) {
	       return library.searchBookByISBN(iSBN);

	   }

	   public List<Book> searchBookByAuthor(String author) {
	       return library.searchBookByAuthor(author);

	   }

	   public List<Book> searchBookByGenre(String genre) {
	       return library.searchBookByGenre(genre);
	   }

	   public void updateBook_Title(String ISBN, String newTitle) {
	       library.updateBook_Title(ISBN, newTitle);
	   }

	   public void updateBook_Author(String ISBN, String newAuthor) {
	       library.updateBook_Author(ISBN, newAuthor);
	   }

	   public void updateBook_Quantity(String ISBN, int qty) {
	       library.updateBook_Quantity(ISBN, qty);
	   }

	   public void updateBook_Genre(String ISBN, String newGenre) {
	       library.updateBook_Genre(ISBN, newGenre);
	   }

	   public void displayBooks() {
	       library.displayBooks();
	   }
	   
	   public void displayBook(String title) {
	       library.displayBook(title);
	   }

	}