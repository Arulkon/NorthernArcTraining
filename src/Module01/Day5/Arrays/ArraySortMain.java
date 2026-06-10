package Module01.Day5.Arrays;

import java.util.Arrays;

public class ArraySortMain {
    public static void main(String[] args) {
        Integer[] arr={10,90,23,89,64,51};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr));
        String[] arr2={"Nikaash","Aproov","Harsh","Kalyaan"};
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(arr2));
        Arrays.sort(arr2);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(arr2));
    }
}
