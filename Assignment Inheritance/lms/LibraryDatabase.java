package lms;

import java.util.ArrayList;
import java.util.List;

public class LibraryDatabase {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void deleteBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public String search(String searchString) {
        for (Book book : books) {
            if (book.title.contains(searchString) || book.author.contains(searchString)) {
                return book.toString();
            }
        }
        return "Book not found.";
    }
}
