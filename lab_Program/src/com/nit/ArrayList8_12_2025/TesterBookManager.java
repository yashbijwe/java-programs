package com.nit.ArrayList8_12_2025;
import java.util.List;
import java.util.Scanner;

public class TesterBookManager {
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String RESET = "\u001B[0m";
    public static final String CYAN = "\u001B[36m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RED = "\u001B[31m";
    public static final String DIM = "\u001B[2m";
    public static final String UNDERLINE = "\u001B[4m";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Book book;
        LibraryManagement management = new LibraryManagement();
        Admin admin = new Admin(management);
        User user = new User(management);

        mainLoop: while (true) {
            System.out.println(BLUE + "Library Management System" + RESET);
            System.out.println(PURPLE + "=============================" + RESET);
            System.out.println(CYAN + "1. Admin Login" + RESET);
            System.out.println(CYAN + "2. User Login" + RESET);
            System.out.println(CYAN + "3. Exit" + RESET);
            System.out.println(YELLOW + "Enter Your Choice: " + RESET);
            int choiceToLogin = Integer.parseInt(sc.nextLine());
            switch (choiceToLogin) {

            case 1: {
                System.out.println(UNDERLINE + "Enter The User Name:" + RESET);
                String adminUsername = sc.nextLine();
                System.out.println("Enter The Password: ");
                String adminPassword = sc.nextLine();

                if (Admin.USER_NAME.equalsIgnoreCase(adminUsername) && Admin.PASSWORD.equalsIgnoreCase(adminPassword)) {
                    adminMenu: while (true) {
                        System.out.println("\nWelcome To Admin DashBoard: " + Admin.USER_NAME);
                        System.out.println("=====================================================");
                        System.out.println("1.Add Book Details:");
                        System.out.println("2.Remove Book By Title");
                        System.out.println("3.Search Book By Title");
                        System.out.println("4.Search Book By ISBN");
                        System.out.println("5.Search Book By Author");
                        System.out.println("6.Search Book By Genre");
                        System.out.println("7.Update Book Title");
                        System.out.println("8.Update Book Author");
                        System.out.println("9.Update Book Quantity");
                        System.out.println("10.Update Book Genre");
                        System.out.println("11.Display Books");
                        System.out.println("12.Display Single Book Info.");
                        System.out.println("13.Returning To Main Menu");
                        System.out.println("=====================================================");

                        System.out.println("Enter Your Choice:");
                        int adminChoice = Integer.parseInt(sc.nextLine());

                        switch (adminChoice) {
                        case 1 -> {
                            System.out.println("Enter The Book Title:");
                            String title = sc.nextLine();
                            System.out.println("Enter The Book Author:");
                            String author = sc.nextLine();
                            System.out.println("Enter The Book ISBN:");
                            String ISBN = sc.nextLine();
                            System.out.println("Enter The Book Genre:");
                            String genre = sc.nextLine();
                            System.out.println("Enter The Book Quantity:");
                            int quantity = Integer.parseInt(sc.nextLine());
                            book = new Book(title, author, ISBN, genre, quantity);
                            admin.addBook(book);
                        }

                        case 2 -> {
                            System.out.println("Do You Really Want To Remove The Book Yes/No: ");
                            String option = sc.nextLine();
                            if ("yes".equalsIgnoreCase(option)) {

                                System.out.println("Enter The Book Title Which You Want To Remove:");
                                String title = sc.nextLine();
                                boolean removeBook = admin.removeBookByTitle(title);
                                if (!removeBook) {
                                    System.out.println(title + " Book Is Not Avaliable");
                                } else {
                                    System.out.println(title + " Book Is Removed Form Library By: " + Admin.USER_NAME);
                                }

                            } else {
                                System.out.println("Returning to Admin Menu...");
                                continue adminMenu; // NOT exit
                                // break;
                            }
                        }
                        case 3 -> {
                            System.out.println("Enter The Title To Search The Book:");
                            String title = sc.nextLine();

                            Book searchBookByTitle = admin.searchBookByTitle(title);
                            System.out.println(searchBookByTitle);

                        }
                        case 4 -> {
                            System.out.println("Enter The ISBN To Search The Book:");
                            String ISBN = sc.nextLine();

                            Book searchBookByTitle = admin.searchBookByISBN(ISBN);
                            System.out.println(searchBookByTitle);

                        }
                        case 5 -> {
                            System.out.println("Enter The Author To Search The Book:");
                            String author = sc.nextLine();

                            List<Book> searchBookByAuthor = admin.searchBookByAuthor(author);
                            searchBookByAuthor.forEach(System.out::println);
                        }
                        case 6 -> {
                            System.out.println("Enter The Genre To Search The Book:");
                            String genre = sc.nextLine();

                            List<Book> searchBookByGenre = admin.searchBookByGenre(genre);
                            searchBookByGenre.forEach(System.out::println);
                        }
                        case 7 -> {
                            System.out.println("Enter Book ISBN which you want to update: ");
                            String ISBN = sc.nextLine();
                            System.out.println("Enter new title: ");
                            String title = sc.nextLine();
                            admin.updateBook_Title(ISBN, title);
                        }
                        case 8 -> {
                            System.out.println("Enter Book ISBN which you want to update: ");
                            String ISBN = sc.nextLine();
                            System.out.println("Enter new author: ");
                            String author = sc.nextLine();
                            admin.updateBook_Author(ISBN, author);
                        }
                        case 9 -> {
                            System.out.println("Enter Book ISBN which you want to update: ");
                            String ISBN = sc.nextLine();
                            System.out.println("Enter new quantity: ");
                            int qty = Integer.parseInt(sc.nextLine());
                            admin.updateBook_Quantity(ISBN, qty);
                        }
                        case 10 -> {
                            System.out.println("Enter Book ISBN which you want to update: ");
                            String ISBN = sc.nextLine();
                            System.out.println("Enter new genre: ");
                            String genre = sc.nextLine();
                            admin.updateBook_Genre(ISBN, genre);
                        }

                        case 11 -> {
                            System.out.println("Displaying All Books");
                            admin.displayBooks();
                        }
                        case 12 -> {
                            System.out.println("Enter Book title which you want to view: ");
                            String title = sc.nextLine();
                            admin.displayBook(title);
                        }
                        case 13 -> {
                            System.out.println("Returning to Main Menu...");
                            continue mainLoop; // go back to login menu
                        }
                        default -> {
                            throw new InvalidInputException("Inavlid Input");
                        }

                        }

                    }
                } else {
                    System.out.println("Invalid Admin Username/Password. Try Again!");
                    continue mainLoop; // back to login menu
                }
            }

            case 2: {
                System.out.println("Enter The User Name: ");
                String userUsername = sc.nextLine();
                System.out.println("Enter The Password: ");
                String userPassword = sc.nextLine();

                if (User.USER_NAME.equalsIgnoreCase(userUsername) && User.PASSWORD.equalsIgnoreCase(userPassword)) {

                     while (true) {
                        System.out.println("\nWelocme To User DashBoard " + User.USER_NAME);
                        System.out.println("=====================================================");

                        System.out.println("1.Search Book By Title");
                        System.out.println("2.Search Book By ISBN");
                        System.out.println("3.Search Book By Author");
                        System.out.println("4.Search Book By Genre");
                        System.out.println("5.Display Books");
                        System.out.println("6.Display Single Book Info.");
                        System.out.println("7.Borrow book based on title.");
                        System.out.println("8.Returning To Main Menu");
                        System.out.println("=====================================================");

                        System.out.println("Enter Your Choice");
                        int userChoice = Integer.parseInt(sc.nextLine());

                        switch (userChoice) {

                        case 1 -> {

                            System.out.println("Enter The Title To Search The Book:");
                            String title = sc.nextLine();

                            Book searchBookByTitle = user.searchBookByTitle(title);
                            System.out.println(searchBookByTitle);
                        }
                        case 2 -> {
                            System.out.println("Enter The ISBN To Search The Book:");
                            String ISBN = sc.nextLine();

                            Book searchBookByTitle = user.searchBookByISBN(ISBN);
                            System.out.println(searchBookByTitle);

                        }
                        case 3 -> {
                            System.out.println("Enter The Author To Search The Book:");
                            String author = sc.nextLine();

                            List<Book> searchBookByAuthor = user.searchBookByAuthor(author);
                            searchBookByAuthor.forEach(System.out::println);
                        }

                        case 4 -> {
                            System.out.println("Enter The Genre To Search The Book:");
                            String genre = sc.nextLine();

                            List<Book> searchBookByGenre = user.searchBookByGenre(genre);
                            searchBookByGenre.forEach(System.out::println);
                        }
                        case 5 -> {
                            System.out.println("All The Books");
                            user.displayBooks();
                        }
                        case 6 -> {
                            System.out.println("Enter Book title which you want to view: ");
                            String title = sc.nextLine();
                            user.displayBook(title);
                        }
                        case 7 -> {
                            System.out.println("Enter Book title which you want to borrow: ");
                            String title = sc.nextLine();
                            System.out.println("Enter how many book you want to borrow: ");
                            int qty = Integer.parseInt(sc.nextLine());
                            user.borrowBook(title, qty);
                        }
                        case 8 -> {
                            System.out.println("Returning to Main Menu...");
                            continue mainLoop;// back to main loop
                        }
                        default -> {
                            throw new InvalidInputException("Inavlid Input");
                        }

                        }

                    }
                } else {
                    System.out.println("Invalid User Username/Password. Try Again!");
                    continue mainLoop; // back to login menu

                }
            }

            case 3: {
                System.out.println("Thank You For The Coming To Our Library Universe!!");
                return; //terminating main
            }
            default: {
                throw new InvalidInputException("Inavlid Input");

            }
            }

        }
    }

}