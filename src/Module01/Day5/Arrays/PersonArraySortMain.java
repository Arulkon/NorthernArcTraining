package Module01.Day5.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PersonArraySortMain {
    public static void main(String[] args) {
        Person[] parr={new Person("Nikaash","TK",20),
                        new Person("Nikaash","Arulkon",20),
                        new Person("Harsh","B",23),
                        new Person("Approov","Andhra",20),
                        new Person("Kalyaan","Samileni",19)};

        Scanner sc=new Scanner(System.in);
        System.out.println(Arrays.toString(parr));
        System.out.println("Enter 1-Fname ascending sort,2-Lname ascending sort,3-Age ascending sort,4-Fname descending sort,5-Lname descending sort,6-Age descending sort");
        int opt= sc.nextInt();
        switch(opt){
            case 1:
                Arrays.sort(parr,new FnameComparator());
                System.out.println(Arrays.toString(parr));
                break;
            case 2:
                Arrays.sort(parr,new LnameComparator());
                System.out.println(Arrays.toString(parr));
                break;
            case 3:
                Arrays.sort(parr,new AgeComparator());
                System.out.println(Arrays.toString(parr));
                break;
            case 4:
                Arrays.sort(parr, new Comparator<Person>() { //local anonymous class
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getFname().compareTo(o1.getFname());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 5:
                Arrays.sort(parr, new Comparator<Person>() { //local anonymous class
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getLname().compareTo(o1.getLname());
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            case 6:
                Arrays.sort(parr, new Comparator<Person>() { //local anonymous class
                    @Override
                    public int compare(Person o1, Person o2) {
                        return o2.getAge()-o1.getAge();
                    }
                });
                System.out.println(Arrays.toString(parr));
                break;
            default:
                System.out.println("As the option is invalid the array is compared based on the Fname:");
                Arrays.sort(parr, new Comparator<Person>(){ //local anonymous class
                    @Override
                    public int compare(Person o1,Person o2){
                        return o1.getFname().compareTo(o2.getFname());
                    }
                });
                System.out.println(Arrays.toString(parr));
        }

    }
}
