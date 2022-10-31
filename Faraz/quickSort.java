import java.util.Arrays;

public class quickSort {
    public static void main(String[] args) {
        int[] arr = {35, 50, 15, 25, 80, 20, 90, 45};
        quickSortt(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSortt(int[] arr, int low, int high){
        if(low>=high){
            return;
        }

        int s = low;
        int e = high;
        //Selecting pivot
        int m = low + (high - low) / 2;
        int pivot = arr[m];

        while(s<=e){
            //Move forward from the start to an index where there is a misplaced element greater than pivot
            while(arr[s]<pivot){
                s++;
            }
            //Move backward from the end to an index where there is a misplaced element smaller than pivot
            while(arr[e]>pivot){
                e--;
            }
            //Now s is an index where element in the array is greater than the pivot element
            //And e is at an index where element in the array is smaller than the pivot element
            //Now we swap the elements so that they are in the correct part of the array
            //We will only swap if s<=e
            if(s<=e){
                //Swap
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        //Now the as the above while loop is terminated
        //The array is in the format - low, x, x, x, e, p, s, x, x, x, high
        //s>e
        //Now perform the sort on the other two halves leaving out the current pivot element
        quickSortt(arr, low, e);
        quickSortt(arr, s , high);
    }
}
