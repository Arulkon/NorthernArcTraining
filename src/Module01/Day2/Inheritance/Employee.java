package Module01.Day2.Inheritance;

public class Employee extends Person{
    private int empid;
    private String position;
    private int salary;

    public Employee(String fname,String lname,int age, String position,int salary,int empid){
        super(fname,lname,age);
        this.position=position;
        this.salary=salary;
        this.empid=empid;
    }

    public int getEmpid() {
        return empid;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
    public void eats(){
        System.out.println("Employee "+getFname()+" "+getLname()+" eats");
    }
    public void talks(){
        System.out.println("Employee "+getFname()+" "+getLname()+" talks");
    }
    public void walks(){
        System.out.println("Employee "+getFname()+" "+getLname()+" walks");
    }
    public void getDetails() {
        System.out.println(getFname()+" in position"+position+" is getting " + salary);
    }
}
