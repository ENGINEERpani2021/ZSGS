package library.transactions;

import library.book.Book;
import library.members.Member;

public class Transactions {
    private Member member;
    private Book book;
    private String transactionType;

    public Transactions(Member member, Book book, String transactionType) {
        this.member = member;
        this.book = book;
        this.transactionType = transactionType;
    }

    public void processTransaction() {
        if (transactionType.equals("borrow")) {
            if (book.borrowBook() && member.borrowBook()) {
                System.out.println("Transaction Successful: " + member.getName() + " borrowed " + book.getTitle());
            } else {
                System.out.println("Transaction Failed: Book not available or member reached borrow limit.");
            }
        } else if (transactionType.equals("return")) {
            book.returnBook();
            member.returnBook();
            System.out.println("Transaction Successful: " + member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Invalid transaction type.");
        }
    }
}
