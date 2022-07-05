package sorting;

// Best Case- O(n^2)
// Average Case- O(n^2)
// Worst Case- O(n^2)
// In place Algorithm- Yes (Space - O(1))
// The good thing about selection sort is it never makes more than O(n) swaps.
// It can be useful when memory write is a costly operation.
// Stable Algorithm- No - The default implementation is not stable.
public class SelectionSort {
    public void selectionSort(int[] arr, int n) {

        // First Approach
        int minIndex;
        for(int i=0; i<n-1; i++){
            minIndex=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            if(minIndex != i){
                swap(arr,i,minIndex);
            }
        }

    }
    private void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
