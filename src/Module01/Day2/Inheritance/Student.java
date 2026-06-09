package Module01.Day2.Inheritance;

public class Student extends Person{
    private String school;
    public Student(String fname,String lname,int age,String school)
    {
        super(fname,lname,age);
        this.school=school;
    }
    public String getSchool(){
        return school;
    }
    public void eats(){
        System.out.println("Student "+getFname()+" "+getLname()+" eats");
    }
    public void talks(){
        System.out.println("Student "+getFname()+" "+getLname()+" talks");
    }
    public void walks(){
        System.out.println("Student "+getFname()+" "+getLname()+" walks");
    }
}
