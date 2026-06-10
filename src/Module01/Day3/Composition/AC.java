package Module01.Day3.Composition;


public class AC {
    private String brand;

    public AC(String brand) {
        this.brand = brand;
    }

    public void cool() {
        System.out.println("AC Cooling");
    }

    public String getBrand() {
        return brand;
    }
}
