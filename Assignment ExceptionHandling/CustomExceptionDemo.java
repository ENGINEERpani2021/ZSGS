import java.util.Scanner;

class NegativeAgeException extends Exception{

    public NegativeAgeException(String msg){
        super(msg);

    }
}
class NotEligibleException extends Exception{
    int difference;
    public NotEligibleException(String msg,int difference){
        super(msg);
        this.difference=difference;
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        try{
            if(age<0)throw new NegativeAgeException("Invalid age");
            else if(age<18)throw new NotEligibleException("Not eligible",18-age);
            System.out.println("You're on the voter's list...");
        }
        catch (Exception ae){
            if(ae instanceof NegativeAgeException)System.out.println("Invalid. Age cannot be negative");
            if(ae instanceof NotEligibleException)System.out.println("You're not eligible to vote. Try again after "+((NotEligibleException) ae).difference+" years!");
        }
    }
}
