import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=2;i<=30;i++) {
            int count=0;
            for (int j = 2; j < i/2; j++) {
                if (i % j == 0){
                    count++;
                    break;
                }
            }
            if(count==0)System.out.println(i);
        }
    }
}
