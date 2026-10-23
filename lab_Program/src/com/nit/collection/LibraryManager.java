package com.nit.collection;

import java.util.ArrayList;
import java.util.Collections;

class LibraryManager {

	private ArrayList<String> bookTitles = new ArrayList<>();

	public void addBook(String title) {
		bookTitles.add(title);
	}

	public boolean containsBook(String title) {
		return bookTitles.contains(title);
	}

	public void clearBooks() {
		bookTitles.clear();
		System.out.println("List Cleared.");
	}

	public void sortBooks() {
		Collections.sort(bookTitles);
	}

	public void displayBooks() {
		System.out.println(bookTitles);
	}

	public static void main(String[] args) {

		LibraryManager manager = new LibraryManager();

		manager.addBook("The Great Gatsby");
		manager.addBook("Java SE8");

		if (manager.containsBook("Java SE8")) {
			System.out.println("Book Found: Java SE8");
		}

		manager.sortBooks();
		System.out.print("Sorted Titles: ");
		manager.displayBooks();

		manager.clearBooks();
	}
}
