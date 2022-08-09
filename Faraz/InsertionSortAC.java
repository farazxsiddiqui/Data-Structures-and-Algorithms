package com.Faraz;

public class InsertionSortAC {
    //Function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 4, 2, 6, 3, 9, 7};
        //Insertion sort
        //Worst Case - Time Complexity = O(n^2)
        //Outer loop runs for n-1(worst case) times and the inner loop runs for n-1(worst case),n-2,n-3,....,0(best case) times
        //O(n-1)*O(n-1)
        //O(n)*O(n)
        //O(n^2)
        for (int i = 1; i < arr.length; i++) {
            //We assign the element that needs to be placed to "current"
            int current = arr[i];
            //Last index of sorted part is "j"
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                //We will create a space for placing our element.
                /*If the current element is smaller that the last element(we compare it with the element on its left)
                of the sorted sub-array we move that last element of the sorted part forward by one space and create a space on its left
                until current is not less than the element on its left, or until we have reached the start of the array which means
                current is the smallest element in the sorted sub-array.*/
                arr[j + 1] = arr[j];
                j--;
            }
            //Placement
            //Now we have a space(arr[j+1]) on the right side of the element(arr[j]) that is smaller than "current";
            /*In case the element is the smallest in the sub-array, j=-1
            (when the while loop runs for j==0, it gets depreciated by 1 in the end, hence j=-1).
            So now, j+1 = 0 and the current element is placed at the beginning, which was the space we created
            by moving all the elements forward by one space.*/
            arr[j + 1] = current;
        }
        printArray(arr);
    }
}
