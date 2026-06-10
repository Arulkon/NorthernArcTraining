package Module01.Day3.Aggregation;

public class Person {
    protected String fname;
    protected String lname;
    int age;
    Address add;
    public Person(String fname, String lname,int age){
        this.fname=fname;
        this.lname=lname;
        this.age=age;
    }
    public void setFname(String fname){
        this.fname=fname;
    }
    public void setLname(String lname){
        this.lname=lname;
    }
    public void setAgeLname(int age){
        this.age=age;
    }
    public void setAddress(Address add){
        this.add=add;
    }

    public String getFname(){
        return this.fname;
    }
    public String getLname(){
        return this.lname;
    }
    public int getAge(){
        return this.age;
    }
    public String getAddress() {
        return fname + " ," + lname + " ," + add.toString();
    }
}
