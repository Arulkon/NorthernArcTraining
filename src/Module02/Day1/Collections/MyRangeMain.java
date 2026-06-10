package Module02.Day1.Collections;

import java.util.Iterator;

public class MyRangeMain {
    public static void main(String[] args) {
        MyRange list=new MyRange(10,20);

        System.out.println("The iterable is: ");
        for(var s:list){
            System.out.println(s);
        }
        Iterator<MyRange> itr=list.iterator();
        System.out.println(itr.getClass().getName());
        System.out.println();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
