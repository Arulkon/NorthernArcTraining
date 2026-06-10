package Module01.Day3.Association;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails(Passport passport) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

        if (passport != null) {
            System.out.println(passport);
        } else {
            System.out.println("No Passport Assigned");
        }
    }
}