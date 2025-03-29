package lms;

public class LMS {
    String userType;
    String username;
    String password;
    boolean isLoggedIn = false;
    boolean isRegistered = false;
    public LMS(String username, String userType, String password) {
        this.username = username;
        this.userType = userType;
        this.password = password;
    }

    void login() {
        this.isLoggedIn = true;
    }

    void register() {
        this.isRegistered = true;
    }

    void logout() {
        this.isLoggedIn = false;
    }

}
