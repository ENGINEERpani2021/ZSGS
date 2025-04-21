package pack;

import java.util.Arrays;
import java.util.Scanner;

public class SortingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
        System.out.println(Arrays.toString(arr));
        Sortable arrSort = new BubbleSort();
        int[] bubbleSortArray = arrSort.sort(arr);
        System.out.println("Using Bubble Sort: "+Arrays.toString(bubbleSortArray));
        arrSort = new QuickSort();
        int[] quickSortArray = arrSort.sort(arr);
        System.out.println("Using Quick Sort: "+Arrays.toString(quickSortArray));
        arrSort = new MergeSort();
        int[] mergeSortArray = arrSort.sort(arr);
        System.out.println("Using Merge Sort: "+Arrays.toString(mergeSortArray));
    }
}
