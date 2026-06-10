package Module01.Day5.Arrays;


public class Child implements Comparable<Child>{
    private String fname;
    private String lname;
    private String DOB;
    public Child(String fname, String lname, String DOB){
        this.fname=fname;
        this.lname=lname;
        this.DOB=DOB;
    }


    public void setFname(String fname){
        this.fname=fname;
    }
    public void seLname(String lname){
        this.lname=lname;
    }
    public void setDOB(int age){
        this.DOB=DOB;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String  getDOB() {
        return DOB;
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
        return fname+" "+lname+" "+DOB;
    }
    @Override
    public int compareTo(Child o) {
        String[] arr1=this.DOB.split("-");
        String[] arr2 = o.DOB.split("-");
        int day1=Integer.parseInt(arr1[0]);
        int mon1=Integer.parseInt(arr1[1]);
        int year1=Integer.parseInt(arr1[2]);
        int day2=Integer.parseInt(arr2[0]);
        int mon2=Integer.parseInt(arr2[1]);
        int year2=Integer.parseInt(arr2[2]);

        int ydiff=year1-year2;
        if(ydiff!=0){
            return ydiff;
        }
        int mdiff=mon1-mon2;
        if(mdiff!=0){
            return mdiff;
        }
        return day1-day2;

    }

}
