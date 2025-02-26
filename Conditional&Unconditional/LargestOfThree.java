import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int one = sc.nextInt();
        System.out.println("Enter second number: ");
        int two = sc.nextInt();
        System.out.println("Enter third number: ");
        int three = sc.nextInt();
        int largest;
        if (one>two && one>three ) largest=one;
        else if(two>one && two>three) largest = two;
        else largest = three;
        System.out.println("Largest: "+largest);
    }
}
