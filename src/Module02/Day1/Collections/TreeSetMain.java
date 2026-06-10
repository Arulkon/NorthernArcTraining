package Module02.Day1.Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {

        Set<Integer> s1 = new TreeSet<>();
        s1.add(10);
        s1.add(2);
        s1.add(22);


        Set<String> s2 = new TreeSet<>();
        s2.add("Nikaash");
        s2.add("Arulkon");
        s2.add("is");

        Set<Person> s3 = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return p1.getAge() - p2.getAge();
            }
        });

        s3.add(new Person("Nikaash", "T K", 20));
        s3.add(new Person("Arulkon", "K", 22));
        s3.add(new Person("Harsh", "B", 21));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}