package com.nit.ArrayList8_12_2025;

import java.util.List;
public class User{
	   public static final String USER_NAME = "LocalUser";
	   public static final String PASSWORD = "User@9090";

	   private LibraryManagement library;

	   public User(LibraryManagement library) {
	       super();
	       this.library = library;
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

	   public void displayBooks() {
	       library.displayBooks();
	   }

	   public void displayBook(String title) {
	       library.displayBook(title);
	   }

	   public void borrowBook(String title, int qty) {
	       Book book = searchBookByTitle(title);
	       if (book != null) {
	           int quantity = book.getQuantity();
	           System.out.println(title + " book current stock : " + quantity);
	           if (book.getQuantity() >= qty) {
	               System.out.println(qty + " numbers of book borrowed by " + USER_NAME);
	               System.out.println("Remainning stock : " + (quantity - qty));
	               book.setQuantity(quantity - qty);
	               try {
	                   Thread.sleep(3000);
	               } catch (InterruptedException e) {
	                   e.printStackTrace();
	               }
	               System.out.println("Returing book....");
	               returnBook(book, qty);
	           } else {
	               System.out.println("Sorry!! Stock is not available");
	           }
	       } else {
	           System.out.println("Book not found!!!");
	       }
	   }

	   public void returnBook(Book book, int qty) {
	       int quantity = book.getQuantity();
	       System.out.println(book.getName() + " book current stock : " + quantity);

	       System.out.println(qty + " numbers of book are return by " + USER_NAME);
	       System.out.println("Updated stock : " + (quantity + qty));
	       book.setQuantity(quantity + qty);

	   }

	}