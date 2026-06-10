package Module02.Day1.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("Nikaash");
        list.add("T");
        list.add("K");
        list.add("Arulkon");
        System.out.println("The iterable is: ");
        for(String s:list){
            System.out.println(s);
        }
        Iterator<String> itr=list.iterator();
        System.out.println(itr.getClass().getName()   );
        System.out.println();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


        List<Person> list2=new ArrayList<Person>();
        list2.add(new Person("Nikaash","T K",20));
        list2.add(new Person("Arulkon","K",22));
        list2.add(new Person("Aproov","Andra",19));
        list2.add(new Person("Kalyan","Samileni",23));
        list2.add(new Person("Harsh","B",20));
        System.out.println("The iterable is: ");
        for(Person s:list2){
            System.out.println(s);
        }
        Iterator<Person> itr2=list2.iterator();
        System.out.println(itr2.getClass().getName()   );
        System.out.println();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }

}
