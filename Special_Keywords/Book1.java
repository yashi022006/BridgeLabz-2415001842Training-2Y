class Book {
    private static String libraryName = "Central Library";
    private String title;
    private String author;
    private final String isbn; // final

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBook() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        }
    }

    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
}

public class Book1 {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "James Gosling", "ISBN12345");
        b1.displayBook();
        Book.displayLibraryName();
    }
}

