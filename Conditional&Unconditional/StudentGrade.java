import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt();
        if(mark>=90) System.out.println("O");
        else if(mark>=80) System.out.println("A");
        else if(mark>=70) System.out.println("B");
        else if(mark>=60) System.out.println("C");
        else if(mark>=50) System.out.println("D");
        else System.out.println("Fail");
    }
}
