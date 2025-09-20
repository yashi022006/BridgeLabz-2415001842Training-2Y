class LibraryBook {
    String title, author;
    double price;
    boolean availability;

    LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = true;
    }

    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println(title + " borrowed successfully.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    public static void main(String[] args) {
        LibraryBook b1 = new LibraryBook("Java Basics", "Herbert Schildt", 600);
        b1.borrowBook();
        b1.borrowBook();
    }
}

