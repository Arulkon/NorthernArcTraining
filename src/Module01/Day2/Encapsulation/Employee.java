package Module01.Day2.Encapsulation;

public class Employee {
    private String name;
    private String position;
    private int salary;
    public Employee(String name,String position,int salary){
        this.name= name;
        this.position=position;
        this.salary=salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName(){
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }
    public void work(){
        System.out.println(name+" is working");
    }
    public void getDetails(){
        System.out.println("Name: "+name+", Position: "+position+", Salary: "+salary);
    }
}
