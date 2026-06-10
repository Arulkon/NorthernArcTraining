package Module01.Day3.Polymorphism;

public class GreetingMain {
    public static void main(String[] args) {
        Greeting g=new Greeting();
        Student s=new Student("Kalyan","Samileni","Btech CS");
        Teacher t=new Teacher("Arulkon","TK","History");
        Person p=new Person("Harsh","Barti");
        g.greet();
        g.greet(s);
        g.greet(p);
        g.greet(t);
    }
}
