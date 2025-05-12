import java.util.Scanner;
import java.lang.Exception.*;
public class ExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dividend: ");
        int number_1 = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int number_2 = sc.nextInt();
        int result;
        try{
            result=number_1/number_2;
            System.out.println(number_1+"/"+number_2+" = "+result);
        }
        catch (ArithmeticException ae){
            System.out.println("ArithmeticException --> / by zero!!! Divisor cannot be zero.");
        }
    }
}
