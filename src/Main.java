import sorting.BubbleSort;
import sorting.SelectionSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 100, 22, 389, 45, 5 };

//        For taking custom Input ---------------
//        Sample Input -------------
//        5
//        100 22 389 45 5

//        Scanner scan = new Scanner(System.in);
//        int n = scan.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = scan.nextInt();
//        }
//        scan.close();


//      Print Input Array
        System.out.print("Input Array :- ");
        print(arr);
        int len = arr.length;

//      Bubble Sort
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.bubbleSort(arr, len);

//      Selection Sort
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.selectionSort(arr, len);

//      Print Sorted Array
        System.out.print("Sorted Array :- ");
        print(arr);
    }

    public static void print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
