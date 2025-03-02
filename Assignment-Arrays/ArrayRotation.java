import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the rotation count: ");
        int r = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr1[(i+r)%n]=arr[i];
        }
        System.out.println("Rotated Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i]+" ");
        }
    }
}
