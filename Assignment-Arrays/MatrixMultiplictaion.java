import java.util.Scanner;

public class MatrixMultiplictaion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows for first matrix: ");
        int matrix1_Rows = sc.nextInt();
        System.out.println("Enter the no of columns for first matrix: ");
        int matrix1_Column = sc.nextInt();
        int[][] matrix1=new int[matrix1_Rows][matrix1_Column];
        for (int i = 0; i < matrix1_Rows; i++) {
            for (int j = 0; j < matrix1_Column; j++) {
                System.out.print("Enter the element of matrix1: ");
                matrix1[i][j]=sc.nextInt();
                System.out.println();
            }
        }
        System.out.println("Enter the no of rows for second matrix: ");
        int matrix2_Rows = sc.nextInt();
        System.out.println("Enter the no of columns for second matrix: ");
        int matrix2_Column = sc.nextInt();
        int[][] matrix2=new int[matrix2_Rows][matrix2_Column];
        for (int i = 0; i < matrix2_Rows; i++) {
            for (int j = 0; j < matrix2_Column; j++) {
                System.out.print("Enter the element of matrix2: ");
                matrix2[i][j]=sc.nextInt();
                System.out.println();
            }
        }
        if(matrix1_Rows==matrix2_Column && matrix1_Column==matrix2_Rows){
            for (int i = 0; i < matrix1_Rows; i++) {
                for (int j = 0; j < matrix2_Column; j++) {
                    int sum=0;
                    for(int k=0;k<matrix2_Rows;k++){
                        sum+=(matrix1[i][k]*matrix2[k][j]);
                    }
                    System.out.print(sum+" ");
                }
                System.out.println();
            }
        }
        else System.out.println("Matrix Multiplication cannot be performed for above matrices. Please check the dimensions!");
    }
}
