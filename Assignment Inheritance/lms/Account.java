package lms;

public class Account {
    int no_borrowed_books;
    int no_reserved_books;
    int no_returned_books;
    int no_lost_books;
    float fine_amount;

    public Account() {
        this.no_borrowed_books = 0;
        this.no_reserved_books = 0;
        this.no_returned_books = 0;
        this.no_lost_books = 0;
        this.fine_amount = 0.0f;
    }

    public float calculateFine(){
        return fine_amount;
    }
    public void displayAccountInfo() {
        System.out.println("Borrowed Books: " + no_borrowed_books);
        System.out.println("Reserved Books: " + no_reserved_books);
        System.out.println("Returned Books: " + no_returned_books);
        System.out.println("Lost Books: " + no_lost_books);
        System.out.println("Fine Amount: " + fine_amount);
    }
}
