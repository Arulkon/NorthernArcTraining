package Day2.Encapsulation;

public class Person {
    private String fName;
    private String lName;
    private int age;
    public Person(String fName,String lName, int age){
        this.fName= fName;
        this.lName= lName;
        this.age=age;
    }
    public void setfName(){
        this.fName=fName;
    }
    public void setlName(){
        this.lName=lName;
    }
    public void setAge(){
        this.age=age;
    }
    public String getfName(){
        return fName;
    }
    public String getlName(){
        return lName;
    }
    public int getAge(){
        return age;
    }
    public void eats(){
        System.out.println(fName+" "+lName+" eats");
    }
    public void talks(){
        System.out.println(fName+ " "+lName+" talks");
    }
    public void walks(){
        System.out.println(fName+ " "+lName+" walks");
    }
}
