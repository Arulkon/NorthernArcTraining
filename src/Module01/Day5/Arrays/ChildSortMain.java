package Module01.Day5.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ChildSortMain {
    public static void main(String[] args) {
        Child[] parr={new Child("Nikaash","TK","31-03-2005"),
                new Child("Nikaash","Arulkon","31-03-2005"),
                new Child("Harsh","B","23-01-2003"),
                new Child("Approov","Andhra","30-07-2004"),
                new Child("Kalyaan","Samileni","10-04-2005")};

        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(parr));
        System.out.println("Before sorting: ");
        System.out.println(Arrays.toString(parr));
        Arrays.sort(parr);
        System.out.println("After sorting: ");
        System.out.println(Arrays.toString(parr));
    }
}
