import java.util.Arrays;

public class mergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSortt(arr)));
        //Finding max and min
        arr = mergeSortt(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.println("Min = "+min+" Max = "+max);
    }
    static int[] mergeSortt(int[] arr){
        //Base condition
        if(arr.length==1){
            return arr;
        }
        //Calculating the middle index
        int mid = arr.length/2;
        //Keep on dividing the array into two halves until the size of array is 1(base condition)
        int[] first = mergeSortt(Arrays.copyOfRange(arr, 0, mid));
        int[] second = mergeSortt(Arrays.copyOfRange(arr,mid,arr.length));
        //Merge the elements of the 2 arrays
        return merge(first, second);
    }

    static int[] merge(int[] first, int[] second){
        int[] aux = new int[first.length+second.length];
        int a = 0;
        int b = 0;
        int idx = 0;
        //Adding smaller element in the auxiliary array
        while(a< first.length && b< second.length){

            if (first[a]<second[b]){
                aux[idx] = first[a];
                idx++;
                a++;
            }
            else if (first[a]>second[b]){
                aux[idx] = second[b];
                idx++;
                b++;
            }
        }
        //It may be possible that one array is finished but the other is remaining
        while(a< first.length){
            aux[idx] = first[a];
            a++;
            idx++;
        }
        while(b< second.length){
            aux[idx] = second[b];
            b++;
            idx++;
        }
        return aux;
    }
}
