package Module01.Day5.Arrays;


public class Person implements Comparable<Person>{
    private String fname;
    private String lname;
    private int age;
    public Person(String fname,String lname,int age){
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
    public void setAge(int age){
        this.age=age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public void eat(){
        System.out.println(fname+" "+lname+" eats");
    }
    public void talk(){
        System.out.println(fname+" "+lname+" talks");
    }
    public void walk(){
        System.out.println(fname+" "+lname+" walks");
    }

    @Override
    public String toString() {
        return fname+" "+lname+" "+age;
    }
    @Override
    public int compareTo(Person o) {
        int adiff=this.age-o.age;
        if(adiff!=0){
            return adiff;
        }
        int fdiff=this.fname.compareTo(o.fname);
        if(fdiff!=0){
            return fdiff;
        }
        return this.lname.compareTo(o.lname);

    }

}
