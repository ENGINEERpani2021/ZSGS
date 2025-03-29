package lms;

import java.util.List;

public class User extends LMS{
    String name;
    Account account;
    List<Book> lendedBooks;
    int id;
    public User (String username, String name, int id, String password) {
        super(username, "user", password);
        this.name = name;
        this.id = id;
        this.account = new Account();
    }
    public boolean verify(){
        return this.isLoggedIn;
    }
    public void checkAccount(){
        System.out.println("Account Details:");
        account.displayAccountInfo();
    }
    public String get_book_info(Book book){
        return book.toString();
    }
}
class Staff extends User{
    public Staff(String username, String name, int id, String password, String department) {
        super(username, name, id, password);
        this.department = department;
    }
    String department;
}
class Student extends User{
    public Student(String username, String name, int id, String password, String Class) {
        super(username, name, id, password);
        this.Class = Class;
    }
    String Class;
}