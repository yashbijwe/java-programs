package com.nit.ArrayList8_12_2025;


public class Book {
   private String name;
   private String author;
   private String ISBN;
   private String genre;
   private int quantity;

   public Book(String name, String author, String iSBN, String genre, int quantity) {
       super();
       this.name = name;
       this.author = author;
       ISBN = iSBN;
       this.genre = genre;
       this.quantity = quantity;
   }

   public Book() {
   }
   public String getName() {return name;}
   public void setName(String name) {this.name = name;}
   
   public String getAuthor() {return author;}
   public void setAuthor(String author) {this.author = author;}
   
   public String getISBN() {return ISBN;}
   public void setISBN(String iSBN) {ISBN = iSBN;}
   
   public String getGenre() {return genre;}
   public void setGenre(String genre) {this.genre = genre;}
   
   public int getQuantity() {return quantity;}
   public void setQuantity(int quantity) {this.quantity = quantity;}

   @Override
   public String toString() {
       return "Book [name=" + name + ", author=" + author + ", ISBN=" + ISBN + ", genre=" + genre + ", quantity="
               + quantity + "]";
   }
   
   
   
   

}