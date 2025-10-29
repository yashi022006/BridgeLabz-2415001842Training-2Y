package library.books;

public class Book {
    public String title, author;

    public Book(String t, String a) {
        title = t;
        author = a;
    }

    public String toString() {
        return "Book: " + title + " by " + author;
    }
}
