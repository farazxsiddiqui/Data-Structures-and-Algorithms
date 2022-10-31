public class BinarySearchRecursive {
    public static int BinarySearch(int[] arr, int low, int high, int target){
        //Calculation the middle position index
        int mid = low+(high-low)/2;
        //Checking if the middle element is the target element
        if(arr[mid] == target)
        {
            return mid;
        }
        //If the target is in the first half and not equal to mid
        //So we return the function BinarySearch with high as mid-1
        if(arr[mid]>target){
            return BinarySearch(arr, low,mid-1,target);
        }
        //If the target is in the second half and not equal to mid
        //So we return the function BinarySearch with low as mid+1
        if(arr[mid]<target){
            return BinarySearch(arr,mid+1, high,target);
        }
        //Return -1 if element does not exist in the array
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = BinarySearch(arr,0,8,7);
        System.out.println("Element found at position: "+n);
    }
}
