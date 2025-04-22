package library;
import library.book.Book;
import library.members.Member;
import library.transactions.Transactions;

public class LibraryDemo {
    public static void main(String[] args) {

        Book book1 = new Book(1, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 5);
        Book book2 = new Book(2, "1984", "George Orwell", "Dystopian", 2);

        Member member1 = new Member(1, "Alice", "alice@example.com");
        Member member2 = new Member(2, "Bob", "bob@example.com");

        Transactions transaction1 = new Transactions(member1, book1, "borrow");
        transaction1.processTransaction();

        Transactions transaction2 = new Transactions(member2, book1, "borrow");
        transaction2.processTransaction();

        Transactions transaction3 = new Transactions(member1, book1, "return");
        transaction3.processTransaction();
    }
}
