package Module01.Day2.Encapsulation;

public class SuperHero {
    private String name;
    private String power;
    public SuperHero(String name,String power){
        this.name=name;
        this.power=power;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPower(String power) {
        this.power = power;
    }
    public String getName(){
        return name;
    }
    public String getPower(){
        return power;
    }
    public void usePower(){
        System.out.println(name+" uses superpower "+power);
    }
    public void saveTheWorld(){
        System.out.println(name+" saves the world");
    }
}
