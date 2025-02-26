import java.util.Scanner;

public class SecondOccurenceOfANumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the number to count: ");
        int num=sc.nextInt();
        int count=0;
        int index=-1;
        for(int i=0;i<length;i++){
            if(arr[i]==num) {
                if (count < 2) count++;
                if (count == 2) {
                    index = i;
                    break;
                }
            }
        }
        System.out.println(index);
    }
}
