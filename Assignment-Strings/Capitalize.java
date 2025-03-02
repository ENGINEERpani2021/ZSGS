import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input=sc.nextLine();
        String[] words = input.split(" ");
        for(int i=0;i<words.length;i++){
            words[i]=words[i].toUpperCase().substring(0,1)+words[i].substring(1);
        }
        System.out.println("Capitalized words of the above sentence: ");
        for(String s:words){
            System.out.print(s+" ");
        }
    }
}
