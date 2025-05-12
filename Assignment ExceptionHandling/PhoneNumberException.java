import java.util.Scanner;
class PhoneNumberLengthMismatchException extends Exception{

    public PhoneNumberLengthMismatchException(String msg){
        super(msg);
    }
}
class InputMismatchException extends Exception{
    public InputMismatchException(String msg){
        super(msg);
    }
}
public class PhoneNumberException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Phone Number: ");
        String phoneNumber = sc.next();
        sc.close();
        try{
            if(phoneNumber.length()!=10)throw new PhoneNumberLengthMismatchException("Invalid length");
            for(char c: phoneNumber.toCharArray()){
                if(!Character.isDigit(c))throw new InputMismatchException("Invalid Character");
            }
        }
        catch (Exception ae){
            if(ae instanceof PhoneNumberLengthMismatchException)System.out.println("Invalid Phone Number. Length must be equal to 10");
            if(ae instanceof InputMismatchException)System.out.println("Phone numbers must contain only digits in range 0-9");
        }
    }
}
