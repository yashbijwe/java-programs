package com.nit.ArrayList8_12_2025;


import java.util.ArrayList;
import java.util.List;
public class LibraryManagement {
    private List<Book> books;

    public LibraryManagement() {
        super();
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully......");
    }

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getName().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public Book searchBookByISBN(String iSBN) {
        for (Book book : books) {
            if (book.getISBN().equals(iSBN)) {
                return book;
            }
        }
        return null;
    }

    public List<Book> searchBookByAuthor(String author) {
        List<Book> authorList = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                authorList.add(book);
            }
        }
        return authorList;
    }

    public List<Book> searchBookByGenre(String genre) {
        List<Book> genreList = new ArrayList<Book>();
        for (Book book : books) {
            if (book.getGenre().equals(genre)) {
                genreList.add(book);
            }
        }
        return genreList;
    }

    public void updateBook_Title(String ISBN, String newTitle) {
        Book book = searchBookByISBN(ISBN);
        if (book != null) {
            System.out.println("Book is updated .");
            System.out.println("Old title : " + book.getName());
            book.setName(newTitle);
            System.out.println("New title: " + book.getName());
        } else {
            System.out.println("Book not found!..");
        }
    }

    public void updateBook_Author(String ISBN, String newAuthor) {
        Book book = searchBookByISBN(ISBN);
        if (book != null) {
            System.out.println("Book is updated .");
            System.out.println("Old author : " + book.getAuthor());
            book.setAuthor(newAuthor);
            System.out.println("New author: " + book.getAuthor());
        } else {
            System.out.println("Book not found!..");
        }
    }

    public void updateBook_Quantity(String ISBN, int qty) {
        Book book = searchBookByISBN(ISBN);
        if (book != null) {
            System.out.println("Book is updated .");
            System.out.println("Old quantity : " + book.getQuantity());
            book.setQuantity(qty);
            System.out.println("New quantity: " + book.getQuantity());
        } else {
            System.out.println("Book not found!..");
        }
    }

    public void updateBook_Genre(String ISBN, String newGenre) {
        Book book = searchBookByISBN(ISBN);
        if (book != null) {
            System.out.println("Book is updated .");
            System.out.println("Old genre : " + book.getGenre());
            book.setGenre(newGenre);
            System.out.println("New genre: " + book.getGenre());
        } else {
            System.out.println("Book not found!..");
        }
    }

    public boolean removeBookByTitle(String title) {
        return books.removeIf(b -> b.getName().equals(title));
    }

    public boolean removeBookByISBN(String ISBN) {
        return books.removeIf(b -> b.getISBN().equals(ISBN));
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books are available..");
        } else {
            books.forEach(System.out::println);
        }
    }

    public void displayBook(String title) {
        Book book = searchBookByTitle(title);
        System.out.println(book == null ? "Book not found!" : book);
    }

}