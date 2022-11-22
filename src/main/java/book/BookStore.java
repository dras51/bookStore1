package book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookStore {
    //Add a book to the store
    //List all the books
    //view a single book
    //remove a book
    //find the most expensive book in the store
    ArrayList<Book> books = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);

    public void addBook() {
        System.out.println("Adding a book to the store!");

        System.out.println("Please enter the book title: ");
        String title = scanner.nextLine();

        System.out.println("Please enter the price of book: ");
        float price = intScanner.nextFloat();

        System.out.println("Please enter the year of release: ");
        int yearOfRelease = intScanner.nextInt();

        System.out.println("Please enter the ISBN");
        int ISBN = intScanner.nextInt();

        Book book = new Book(title, price, yearOfRelease, ISBN);

        //ArrayList.add(item): method for adding item to arraylist
        books.add(book);

        System.out.println(title + " added successfully");
    }

    public void listBooks() {
        System.out.println("Listing all books in the store! \n");

        for (Book book: books){
            System.out.println("Title: " + book.title + ", Price: £" + book.price);
        }
    }

    public void findBook() {
        System.out.println("Please enter the ISBN of the book to find: ");

        int ISBN = intScanner.nextInt();

        for(Book book: books) {
            if(book.ISBN == ISBN) {
                System.out.println("Title: " + book.title + ", Price: " + book.price);
                return;
            }
        }

        System.out.println("Book not found!");
    }

    public void removeBook() {
        System.out.println("Please enter the ISBN of the book to remove: ");

        int ISBN = intScanner.nextInt();

        for(Book book: books) {
            if (book.ISBN == ISBN) {
                //ArrayList.indexOf(item): returns the index of the item that is passed into it
                //ArrayList.remove(index): removes the item in the index
                int index = books.indexOf(book);
                books.remove(index);

                //New way to remove book by removal by object
//                books.remove(book);

//                books.remove(books.indexOf(book));

                System.out.println("Book removed successfully");
            }
        }
    }

    public void viewMostExpensiveBook() {
        //Loop through all the books in the store, and compare each of the books for which one has the highest price
        Book mostExpensive = books.get(0);

        //array.length
        //the length of an arraylist is: arrayList.size()

        //Loop through all the books in the array
        for (int i = 1; i < books.size(); i++ ) {

            //Assign the current book in the loop to variable currentBook
            Book currentBook = books.get(i);
            //Check if the price of current book is greater than the mostExpensive book
            if (currentBook.price > mostExpensive.price) {
                //Assigning the currentBook to be the mostExpensive if this is true
                mostExpensive = currentBook;
            }
        }

        System.out.println("The most expensive book is: " + mostExpensive.title + ", Price: " + mostExpensive.price);
    }

}
