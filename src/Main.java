import sorting.BubbleSort;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int arr [] = { 100, 22, 389, 45, 5 };
//        Sample Input -------------
//        5
//        100 22 389 45 5

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.print("Input Array :- ");
        print(arr);
        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr);
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
