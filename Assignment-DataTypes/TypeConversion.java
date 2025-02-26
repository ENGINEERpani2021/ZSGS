import java.util.Scanner;

public class TypeConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Double: ");
        double d = sc.nextDouble();
        float f = (float)d;
        System.out.println("Value of "+d+" in float: "+f);
        int in = (int)f;
        System.out.println("Value of "+f+" in int: "+in);
        short s = (short)in;
        System.out.println("Value of "+f+" in short: "+s);
        byte b = (byte)s;
        System.out.println("Value of "+f+" in bytes: "+b);
    }
}
