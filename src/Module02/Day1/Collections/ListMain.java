package Module02.Day1.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<Integer>();
        list.add(100);
        list.add(12);
        list.add(3);
        list.add(41);
        list.add(50);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        list.set(0,5);
        list.remove(4);
        list.remove(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


        List<String> list2=new ArrayList<String>();
        list2.add("Hi");
        list2.add("I'm");
        list2.add("Nikaash");
        list2.add("Arulkon");
        list2.add("T K");
        System.out.println(list2);
        System.out.println(list2.get(0));
        System.out.println(list2.get(1));
        System.out.println(list2.get(2));
        list2.set(0,"Hi");
        list2.remove(4);
        list2.remove(3);
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);


        List<Double> list3=new ArrayList<Double>();
        list3.add(100.00);
        list3.add(12.00);
        list3.add(3.00);
        list3.add(41.00);
        list3.add(50.00);
        System.out.println(list3);
        System.out.println(list3.get(0));
        System.out.println(list3.get(1));
        System.out.println(list3.get(2));
        list3.set(0,5.00);
        list3.remove(4);
        list3.remove(3);
        System.out.println(list3);
        Collections.sort(list3);
        System.out.println(list3);

        List<Person> list4=new ArrayList<Person>();
        list4.add(new Person("Nikaash","T K",20));
        list4.add(new Person("Arulkon","K",22));
        list4.add(new Person("Aproov","Andra",19));
        list4.add(new Person("Kalyan","Samileni",23));
        list4.add(new Person("Harsh","B",20));
        System.out.println(list4);
        System.out.println(list4.get(0));
        System.out.println(list4.get(1));
        System.out.println(list4.get(2));
        list4.set(0,new Person("Harish","B",20));
        list4.remove(4);
        list4.remove(3);
        System.out.println(list4);
        Collections.sort(list4, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFname().compareTo(o2.getFname());
            }
        });
        System.out.println(list4);


    }
}
