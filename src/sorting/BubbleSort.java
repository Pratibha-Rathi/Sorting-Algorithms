package sorting;

// Best Case- O(n)   The best case occurs when an array is already sorted.
// Average Case- O(n^2)
// Worst Case- O(n^2)  The worst case occurs when an array is reverse sorted.
// In place Algorithm- Yes (Space - O(1))
// Stable Algorithm-  Yes- Stable sorting algorithms preserve the relative order of equal elements.
public class BubbleSort {
    public void bubbleSort(int[] arr, int n) {

        // First Approach-----------
        boolean swapped;
        for(int i=0; i<n-1; i++){
            swapped = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }


        // Second Approach-----------
         /*int count;
         for(int i=n-1; i>0; i--){
             count = 0;
             for(int j=0; j<i; j++){
                 if(arr[j]>arr[j+1]){
                     swap(arr,j,j+1);
                     count++;
                 }
             }
             if(count==0){
                     break;
             }
         }*/


        // Third Approach- (Recursive) -------------
        /*if(n==1){
            return;
        }
        int count = 0;
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                swap(arr, i, i+1);
                count++;
            }
        }
        bubbleSort(arr, n-1);*/

    }

    private void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
