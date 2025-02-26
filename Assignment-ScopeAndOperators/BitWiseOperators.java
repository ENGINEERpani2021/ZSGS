import java.util.Scanner;

public class BitWiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int x = -8;
        System.out.println("Enter second number:");
        int y = 9;
        System.out.println("Bitwise OR of "+x+" and "+y+": "+(x|y));
        System.out.println("Bitwise XOR of "+x+" and "+y+": "+(x^y));
        System.out.println("Bitwise AND of "+x+" and "+y+": "+(x&y));
        System.out.println("Bitwise Left Shift of "+x+" by 2 bits: "+(x<<2));
        System.out.println("Bitwise Right Shift of "+y+" by 3 bits: "+(y>>3));
        System.out.println("Bitwise Right Shift of "+y+" by 3 bits: "+(y>>>3));
        //System.out.println("Bitwise NOT of "+x+": "+(~x));
    }
}
