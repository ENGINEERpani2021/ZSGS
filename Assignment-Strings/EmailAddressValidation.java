import java.util.Scanner;

public class EmailAddressValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an email address: ");
        String email=sc.nextLine();
        if(email.endsWith("@gmail.com")) System.out.println("Email is in Correct format");
        else System.out.println("Incorrect format of email address. It must contain \"@\" followed by \"gmail.com\"");
    }
}
