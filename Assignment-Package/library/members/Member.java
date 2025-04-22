package library.members;

public class Member {
    private int memberId;
    private String name;
    private String email;
    private int borrowedBooks;

    public Member(int memberId, String name, String email) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.borrowedBooks = 0;
    }

    public int getMemberId() {
        return memberId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public boolean borrowBook() {
        if (borrowedBooks < 3) {
            borrowedBooks++;
            return true;
        }
        return false;
    }

    public void returnBook() {
        if (borrowedBooks > 0) {
            borrowedBooks--;
        }
    }

    @Override
    public String toString() {
        return "Member [ID: " + memberId + ", Name: " + name + ", Email: " + email + ", Borrowed Books: " + borrowedBooks + "]";
    }
}
