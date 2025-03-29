package lms;

public class Librarian extends LMS{
    int id;
    String name;
    String password;
    String SearchString;
    Librarian(String username, int id, String password) {
        super(username, "librarian", password);
        this.id = id;
    }
    public boolean verify_librarian(){
        return this.isLoggedIn && this.isRegistered;
    }
    public String search_book(String searchString, LibraryDatabase database){
        return database.search(searchString);
    }
}
