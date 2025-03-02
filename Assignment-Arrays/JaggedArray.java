import java.util.Scanner;

public class JaggedArray {
    static int [][] arr = {};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your choice: /n1.Enter your weights. /n2.Find minimum weight. /3.exit");
            int choice = sc.nextInt();
            switch (choice){
                case 1: {
                    System.out.println("Enter the no of weights to be added ("+(arr.length+1)+" person): ");
                    int n = sc.nextInt();
                    int[] nums = new int[n];
                    System.out.println("Enter each weight: ");
                    for(int i=0;i<n;i++){
                        nums[i]=sc.nextInt();
                    }
                    arr=addWeight(nums);
                    break;
                }
                case 2: {
                    System.out.println("Enter the person number whose minimum weight is needed: ");
                    int n = sc.nextInt();
                    minWeight(n);break;
                }
                case 3:System.exit(0);
            }
        }
    }
    private static int[][] addWeight(int[] nums) {
        int[][] arr1=new int[arr.length+1][];
        for (int i=0;i< arr.length;i++) {
          arr1[i]=arr[i];
        }
        arr1[arr.length]=nums;
        return arr1;
    }
    private static void minWeight(int n) {
        int min=Integer.MAX_VALUE;
        for (int i:arr[n-1]) {
            if(i<min)min=i;
        }
        System.out.println("Minimum weight: "+min);
    }
}
