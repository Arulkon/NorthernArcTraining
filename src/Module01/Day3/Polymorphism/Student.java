package Module01.Day3.Polymorphism;

public class Student extends Person{
    private String course;
    public Student(String fname,String lname,String course){
        super(fname,lname);
        this.course=course;
    }
    @Override
    public Student getDemo(){
        return new Student("Nikaash","TK","B.E. CSE");
    }
}
