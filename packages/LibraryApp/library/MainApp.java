package library;

import library.books.*;
import library.members.*;
import library.transactions.*;

public class MainApp {
    public static void main(String[] args) {
        Book book = new Book("Java Basics", "James Gosling");
        Member member = new Member("Aditi");
        Transaction transaction = new Transaction();

        transaction.issueBook(book, member);
    }
}