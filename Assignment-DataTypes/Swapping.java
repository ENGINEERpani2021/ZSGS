import java.util.Scanner;

public class Swapping {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter a second number:");
        int num2 = sc.nextInt();
        System.out.println("Before Swapping: ");
        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
        num1+=num2;
        num2=num1-num2;
        num1-=num2;
        System.out.println("After Swapping: ");
        System.out.println("First number: "+num1);
        System.out.println("Second number: "+num2);
    }
}
