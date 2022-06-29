package com.Faraz;

public class SelectionSortAC {
    //Function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 5, 4, 2, 6, 3, 1, 7};
        //Selection sort
        //Time Complexity = O(n^2)
        //Outer loop runs for n-1(worst case) times and the inner loop runs for n-1(worst case),n-2,n-3,....,0(best case) times
        //O(n-1)*O(n-1)
        //O(n)*O(n)
        //O(n^2)
        //Finding out the index of the smallest number and then swapping the smallest element with the first element of that array.
        /*After the first index has be allocated the desired element i.e. the smallest element,
        we ignore that element and treat the remaining sub-array as an individual array , hence "j=i+1"
        and perform the same operation on that array.*/
        /*In simple terms, we find the smallest element of that sub-array
        and then swap the smallest element with the first element of that sub-array.*/
        //The sub-array get smaller each time the loop runs
        for (int i = 0; i < arr.length-1; i++) {
            //"i" is the counter i.e. the number of times we run the loop.
            /*We don't run it for the last element(which is supposed to be the greatest element)
            since it would already be in its desired index, as all the other elements are in their desired index
            and there is only one index left unassigned(which is the arr.length-1th index).*/
            //We assume index i as the index of the smallest element, since it is the index of the first element of that particular sub-array.
            //For every "i" there is a new "smallest" hence it is declared inside the outer for-loop.
            int smallest = i;
            for (int j = i+1; j < arr.length; j++) {
                //This will compare all the elements with arr[smallest].
                if (arr[j] < arr[smallest]) {
                    //Storing the index of the smallest number in "smallest".
                    smallest = j;
                }
            }
            //Swapping the first element with the smallest element of the array/sub-array.
            //For detailed explanation of the swapping code, check BubbleSortAC.java.
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }
        //Printing the array using a function
        printArray(arr);
    }
}
