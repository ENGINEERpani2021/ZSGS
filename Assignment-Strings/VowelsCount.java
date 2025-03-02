import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0;
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        for(char c:input.toLowerCase().toCharArray()){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')count++;
        }
        System.out.println("Count of vowels in the above string: "+count);
    }
}
