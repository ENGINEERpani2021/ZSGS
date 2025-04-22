package library.book;

public class Book {
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private int availableCopies;

    public Book(int bookId, String title, String author, String genre, int availableCopies) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availableCopies = availableCopies;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public boolean borrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        }
        return false;
    }

    public void returnBook() {
        availableCopies++;
    }

    @Override
    public String toString() {
        return "Book [ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Available Copies: " + availableCopies + "]";
    }
}
