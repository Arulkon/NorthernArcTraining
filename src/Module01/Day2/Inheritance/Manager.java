package Module01.Day2.Inheritance;

public class Manager extends Employee{
    private String team;
    public Manager(String fname,String lname,int age,String position,int salary,int empid,String team)
    {
        super(fname,lname,age,position,salary,empid);
        this.team=team;
    }
    public String getTeam(){
        return team;
    }
    public void eats(){
        System.out.println("Manager "+getFname()+" "+getLname()+" eats");
    }
    public void talks(){
        System.out.println("Manager "+getFname()+" "+getLname()+" talks");
    }
    public void walks(){
        System.out.println("Manager "+getFname()+" "+getLname()+" walks");
    }
    public void getManagerDetails(){
        getDetails();
        System.out.println(getTeam()+" team");
    }

}
