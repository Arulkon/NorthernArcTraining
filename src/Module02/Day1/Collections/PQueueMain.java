package Module02.Day1.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>();
        queue.add(10);
        queue.add(2);
        queue.add(22);
        queue.add(17);
        queue.add(20);
        System.out.println(queue);
        System.out.println("Removing: "+ queue.remove());
        System.out.println("Removing: "+ queue.remove());
        System.out.println("Removing: "+ queue.remove());
        System.out.println("Peeking: "+ queue.peek());
        System.out.println("Peeking: "+ queue.peek());


        Queue<String> queue2=new PriorityQueue<>();
        queue2.add("Nikaash");
        queue2.add("Arulkon");
        queue2.add("is");
        queue2.add("my");
        queue2.add("name");
        System.out.println(queue2);
        System.out.println("Removing: "+ queue2.remove());
        System.out.println("Removing: "+ queue2.remove());
        System.out.println("Removing: "+ queue2.remove());
        System.out.println("Peeking: "+ queue2.peek());
        System.out.println("Peeking: "+ queue2.peek());

        Queue<Person> queue3=new PriorityQueue<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFname().compareTo(o2.getFname());
            }
        });
        queue3.add(new Person("Nikaash","T K",20));
        queue3.add(new Person("Arulkon","K",22));
        queue3.add(new Person("Aproov","Andra",19));
        queue3.add(new Person("Kalyan","Samileni",23));
        queue3.add(new Person("Harsh","B",20));
        System.out.println(queue3);
        System.out.println("Removing: "+ queue3.remove());
        System.out.println("Removing: "+ queue3.remove());
        System.out.println("Removing: "+ queue3.remove());
        System.out.println("Peeking: "+ queue3.peek());
        System.out.println("Peeking: "+ queue3.peek());

    }
}
