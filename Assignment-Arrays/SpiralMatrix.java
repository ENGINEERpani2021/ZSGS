import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the dimension N of matrix(N x N): ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        int num=1;
        int left=0;int right=n-1;
        int top=0;int bottom=n-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                arr[top][i]=num++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                arr[i][right]=num++;
            }
            right--;
            for(int i=right;i>=left;i--){
                arr[bottom][i]=num++;
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                arr[i][left]=num++;
            }
            left++;
        }
        for(int[] i : arr){
            for(int j: i){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
