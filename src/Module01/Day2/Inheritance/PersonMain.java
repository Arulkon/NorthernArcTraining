package Module01.Day2.Inheritance;

import java.util.Scanner;

public class PersonMain {
    public static void main(String[] args) {
        Person p1=new Employee("Nikaash","T K",21,"SDE",10000,1);
        Employee e2=new Manager("Arulkon","T K",23,"SDE2",100000,2,"Tech");
        Student s3=new Student("Harsh","Bharti",14,"IIT");
        Person p2=e2;
        Person p3=s3;
        p1.eats();
        p2.eats();
        e2.eats();
        s3.walks();
        p3.walks();
        ((Employee)p1).getDetails();
        ((Employee)p2).getDetails();
        ((Manager)p2).getManagerDetails();

    }
}
