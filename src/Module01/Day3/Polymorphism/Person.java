package Module01.Day3.Polymorphism;

public class Person {
    private String fname;
    private String lname;
    public Person(String fname,String lname){
        this.fname=fname;
        this.lname=lname;
    }

    public void getName() {
        System.out.println(fname+" "+lname);
    }

    public Person getDemo(){
        return new Person("Nikaash","TK");
    }



}
