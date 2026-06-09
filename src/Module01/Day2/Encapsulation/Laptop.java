package Module01.Day2.Encapsulation;

public class Laptop {
    private String brand;
    private String model;
    private String processor;
    private int RAM;
    private int storage;
    public Laptop(String brand,String model,String proccessor,int RAM,int storage){
        this.brand=brand;
        this.model=model;
        this.processor=proccessor;
        this.RAM=RAM;
        this.storage=storage;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRAM() {
        return RAM;
    }

    public int getStorage() {
        return storage;
    }
    public void turnOn(){
        System.out.println(brand+" "+model+" turns on...");
    }
    public void turnOff(){
        System.out.println(brand+" "+model+" turns off...");
    }
    public void getDetails(){
        System.out.println("Brand: "+brand+", Model: "+model+", Processor: "+processor+", RAM: "+RAM+", Storage: "+storage);
    }

}
