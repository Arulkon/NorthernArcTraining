package Module02.Day1.Collections;

import java.util.*;

public class PersonPQueueSortMain {
    public static void main(String[] args) {
        Queue<Person> q = new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFname().compareTo(o2.getFname());
            }
        });
        q.add(new Person("Nikaash", "TK", 20));
        q.add(new Person("Harsh", "B", 23));
        q.add(new Person("Approov", "Andhra", 20));
        q.add(new Person("Kalyaan", "Samileni", 19));
        List<Person> list = new ArrayList<>(q);
        Scanner sc = new Scanner(System.in);
        System.out.println(list);
        System.out.println("Enter 1-Fname ascending sort,2-Lname ascending sort,3-Age ascending sort,4-Fname descending sort,5-Lname descending sort,6-Age descending sort");
        int opt = sc.nextInt();
        switch (opt) {
            case 1:
                Collections.sort(list, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getFname().compareTo(o2.getFname());
                    }
                });
                System.out.println(list);
                break;
            case 2:
                Collections.sort(list, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getLname().compareTo(o2.getLname());
                    }
                });
                System.out.println(list);
                break;
            case 3:
                Collections.sort(list, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getAge() - o2.getAge();
                    }
                });
                System.out.println(list);
                break;
            case 4:
                Collections.sort(list, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getFname().compareTo(o1.getFname());
                    }
                });
                System.out.println(list);
                break;
            case 5:
                Collections.sort(list, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getLname().compareTo(o2.getLname());
                    }
                });
                System.out.println(list);
                break;
            case 6:
                Collections.sort(list, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getAge() - o1.getAge();
                    }
                });
                System.out.println(list);
                break;
            default:
                Collections.sort(list, new Comparator<Person>() {
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o1.getFname().compareTo(o2.getFname());
                    }
                });
                System.out.println(list);
        }
        q = new LinkedList<>(list);
    }
}
