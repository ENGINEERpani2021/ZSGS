package lms;

public class Book {
    String title;
    String author;
    String ISBN;
    String publication;
    public Book(String title, String author, String ISBN, String publication) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publication = publication;
    }

    public String show_due_dt(){
        return "Due date: 10 days from issue.";
    }
    public String reservationStatus(){
        return "Available";
    }
    public void feedBack(){}
    public void book_request(){}
    public void renew_info(){}
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", ISBN: " + ISBN + ", Publication: " + publication;
    }
}
