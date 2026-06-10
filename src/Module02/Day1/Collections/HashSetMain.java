package Module02.Day1.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetMain {
    public static void main(String[] args) {

        // Integer
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(2);
        s1.add(22);

        Set<String> s2 = new HashSet<>();
        s2.add("Nikaash");
        s2.add("Arulkon");
        s2.add("is");

        Set<Person> s3 = new HashSet<>();
        s3.add(new Person("Nikaash", "T K", 20));
        s3.add(new Person("Arulkon", "K", 22));
        s3.add(new Person("Harsh", "B", 21));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}