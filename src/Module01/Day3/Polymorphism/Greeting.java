package Module01.Day3.Polymorphism;

public class Greeting {
    public void greet(){
        System.out.println("Greeting....");
    }
    public void greet(Person p){
        System.out.println("Greeting the person");
    }
    public void greet(Student p){
        System.out.println("Greeting the student");
    }
    public void greet(Teacher t){
        System.out.println("Greeting the teacher");
    }
}
