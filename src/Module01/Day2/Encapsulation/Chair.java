package Module01.Day2.Encapsulation;

public class Chair {
    private String material;
    private String color;
    private double kg;
    public Chair(String material, String color,double kg){
        this.material=material;
        this.color=color;
        this.kg=kg;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getKg() {
        return kg;
    }
    public void adjustHeight(){
        System.out.println("The height of the chair is being adjusted");
    }
    public void getDetails(){
        System.out.println("Material: "+material+", Color: "+color+", Weight: "+kg+" kgs");
    }
}
