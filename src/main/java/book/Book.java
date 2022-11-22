package book;

public class Book {
    //title
    //price
    //yearOfRelease
    //ISBN
    public String title;
    public float price;
    public int yearOfRelease;
    public int ISBN;

    //Constructors: is a method that runs when an object is initialized
    public Book(String title, float price, int yearOfRelease, int ISBN){
        this.title = title;
        this.price = price;
        this.yearOfRelease = yearOfRelease;
        this.ISBN = ISBN;
    }
}
