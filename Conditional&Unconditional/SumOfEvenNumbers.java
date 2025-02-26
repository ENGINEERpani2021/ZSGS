import java.util.Scanner;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        int sum=0;
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        for(int i:arr){
            if(i%2!=0)continue;
            sum+=i;
        }
        System.out.println("Sum of Even numbers: "+sum);
    }
}
