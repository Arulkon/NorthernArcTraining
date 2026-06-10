package Module01.Day3.Polymorphism;

public class Teacher extends Person{
    private String subject;
    public Teacher(String fname,String lname,String subject){
        super(fname,lname);
        this.subject= subject;
    }
    @Override
    public Teacher getDemo(){
        return new Teacher("Nikaash","TK","Maths");
    }

}
