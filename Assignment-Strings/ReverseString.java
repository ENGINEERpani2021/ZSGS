import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        for(int i=input.length()-1;i>=0;i--){
            sb.append(input.charAt(i));
        }
        System.out.println("Reversed string: "+sb.toString());
    }
}
