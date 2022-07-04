package sorting;

public class BubbleSort {
    public void bubbleSort(int[] arr) {
        int n = arr.length;
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
    }

    private void swap(int[] arr, int j, int i) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
