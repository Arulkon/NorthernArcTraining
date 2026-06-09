package Module01.Day2.Encapsulation;

public class Light {
    private String brand;
    private int watts;
    public Light(String brand,int watts){
        this.brand=brand;
        this.watts=watts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public String getBrand() {
        return brand;
    }

    public int getWatts() {
        return watts;
    }
    public void turnOn(){
        System.out.println("Light is turning on.....");
    }
    public void turnOff(){
        System.out.println("Light is turning off......");
    }
    public void getDetails(){
        System.out.println("Brand: "+brand+", Watts: "+watts);
    }
}
