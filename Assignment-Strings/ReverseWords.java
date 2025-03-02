import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        String[] words = input.split(" ");
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        System.out.println("Reversed words in the above sentence: "+sb.toString());
    }
}
