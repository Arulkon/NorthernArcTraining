package Module01.Day5.Arrays;

import java.util.Arrays;

public class ArrayReverseMain {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println("Before reversing: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("After reversing: ");
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
        System.out.println(Arrays.toString(arr));

    }
}
