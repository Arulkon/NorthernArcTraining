package Module01.Day3.Polymorphism;

public class LOCMain {
    public static void main(String[] args) {
        Student s1 = new Student("Vikaash", "TK","CSE");
        Person p2 = s1.getDemo();
        p2.getName();
    }
}
