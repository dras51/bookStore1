import book.Book;
import book.BookStore;

import java.util.Scanner;

//Book class: to hold the information about the book
//Bookstore class: to store books and perform certain tasks like adding books, removing books and listing books etc.

public class Main {
    public static void main(String[] args) {
        //Build a bookstore application on the command line, you app should be able to perform certain tasks
        //Add a book
        //List all books
        //Remove a book
        //find a book by its ISBN
        //find the most expensive book

        //Create a menu for the bookstore application.
        System.out.println("Welcome to the bookstore, what would you like to do today!");
        Scanner scanner = new Scanner(System.in);
        BookStore bookStore = new BookStore();

        String input = "";

//        Book book = new Book("Eat that frog", 5.99f, 1990, 123);


        do {
            System.out.println("""
                    
                    1. Add Book
                    2. List all books
                    3. Remove a book by ISBN
                    4. Find a book by ISBN
                    5. Find the most expensive book
                    """);

            //Receive input from user and perform task based on that input
            input = scanner.nextLine();

            switch (input) {
                case "quit":
                    System.out.println("Exiting Application!");
                    break;
                case "1":
                    bookStore.addBook();
                    break;
                case "2":
                    bookStore.listBooks();
                    break;
                case "3":
                    bookStore.removeBook();
                    break;
                case "4":
                    bookStore.findBook();
                    break;
                case "5":
                    bookStore.viewMostExpensiveBook();
                    break;
                default:
                    System.out.println("Please select a valid option!");
                    break;
            }
        } while (!input.equals("quit"));
    }
}
