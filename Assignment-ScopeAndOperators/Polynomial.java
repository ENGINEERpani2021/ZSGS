import java.util.Scanner;

public class Polynomial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the coefficient of x2: ");
        int a = sc.nextInt();
        System.out.println("Enter the coefficient of x: ");
        int b = sc.nextInt();
        System.out.println("Enter the costant: ");
        int c = sc.nextInt();
        int d= b*b-4*a*c;
        if(d>0){
            int r1=(int)(-b+Math.sqrt(d))/(2*a);
            int r2=(int)(-b-Math.sqrt(d))/(2*a);
            System.out.println("The roots are: "+r1+" and "+r2);
        }
        else if(d==0){
            int r=(-b)/(2*a);
            System.out.println("The root is: "+r);
        }
        else{
            int r1=(-b/(2*a));
            int r2=(int)(Math.sqrt(-d))/(2*a);
            System.out.println("The roots are: "+r1+"+"+r2+"i and "+r1+"-"+r2+"i ");
        }
    }
}
