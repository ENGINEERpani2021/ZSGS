package lms;

public class Main {
    public static void main(String[] args) {
        LibraryDatabase database = new LibraryDatabase();
        Book book1 = new Book("Java Programming", "James Gosling", "123456", "Sun Publications");
        Book book2 = new Book("Python Basics", "Guido van Rossum", "789101", "Python Org");
        database.addBook(book1);
        database.addBook(book2);

        User user = new User("johnDoe", "John Doe",2001 , "password123");
        Librarian librarian = new Librarian("librarian01", 1001, "libpass");

        user.login();
        System.out.println("User Logged In: " + user.verify());
        System.out.println("Book Info: " + user.get_book_info(book1));

        System.out.println("Librarian Searching for 'Java'");
        System.out.println("Result: " + librarian.search_book("Java", database));
    }
}
