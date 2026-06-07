package Day2.Encapsulation;

public class SuperVillain {
    private String name;
    private String crime;
    public SuperVillain(String name,String crime){
        this.name=name;
        this.crime =crime;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCrime(String crime) {
        this.crime = crime;
    }
    public String getName(){
        return name;
    }
    public String getCrime(){
        return crime;
    }
    public void doCrime(){
        System.out.println(name+" does the crime of "+ crime);
    }
    public void destroyTheWorld(){
        System.out.println(name+" tries to destroy the world");
    }
}
