package com.Faraz;

public class BubbleSortAC {
    //Function to print the array
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 4, 2, 6, 3, 9, 7};
        //Bubble sort
        //Time Complexity = O(n^2)
        //Outer loop runs for n-1(worst case) times and the inner loop runs for n-1(worst case),n-2,n-3,....,0(best case) times
        //O(n-1)*O(n-1)
        //O(n)*O(n)
        //O(n^2)
        //Comparing two adjacent elements and swapping them if the element on the left is greater.
        //For the 1st iteration we will check for all the elements.
        //After that we will only check for the unsorted elements, hence "j<arr.length-i-1".
        //Since the last i elements are sorted.
        //The largest element in each iteration moves to the last of that sub-array
        for (int i = 0; i < arr.length - 1; i++) {
            //"i" is the counter i.e. the number of times we run the loop.
            /*We don't run it for the last element(which is supposed to be the smallest element)
            since it would already be in its desired index, as all the other elements are in their desired index
            and there is only one index left unassigned(which is the 0th index).*/
            //After each iteration we reduce the number of iterations by 1 since that 1 element is at its desired index already.
            for (int j = 0; j < arr.length - i - 1; j++) {
                //"j" is the index of the elements of arr
                if (arr[j] > arr[j + 1]) {
                    //Swap
                    //Assign either element to a temporary variable.
                    //Here we assign arr[j] to temp.
                    int temp = arr[j];
                    //Now that we have the data of arr[j] safely stored in temp, we can alter arr[j].
                    //Assigning arr[j+1] to arr[j], now both variables have same data stored in them that is arr[j];
                    arr[j] = arr[j + 1];
                    //We are half-way through the swap, we have assigned the value of arr[j+1] to arr[j];
                    //Now we want to assign the initial value of arr[j] i.e. temp to arr[j+1].
                    arr[j + 1] = temp;
                    //swap complete;
                }
            }
        }
        //Printing array through a function.
        printArray(arr);
    }
}
