package Module01.Day2.Inheritance;

public class Person {
    private String fname;
    private String lname;
    private int age;
    public Person(String fname,String lname, int age){
        this.fname= fname;
        this.lname= lname;
        this.age=age;
    }
    public void setFname(){
        this.fname=fname;
    }
    public void setLname(){
        this.lname=lname;
    }
    public void setAge(){
        this.age=age;
    }
    public String getFname(){
        return fname;
    }
    public String getLname(){
        return lname;
    }
    public int getAge(){
        return age;
    }
    public void eats(){
        System.out.println(fname+" "+lname+" eats");
    }
    public void talks(){
        System.out.println(fname+ " "+lname+" talks");
    }
    public void walks(){
        System.out.println(fname+ " "+lname+" walks");
    }

}
