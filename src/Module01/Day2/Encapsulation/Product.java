package Module01.Day2.Encapsulation;

public class Product {
    private String name;
    private double price;
    private String category;
    public Product(String name, double price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
    public void applyDiscount(double dis){
        System.out.println("The price before: "+getPrice());
        setPrice(getPrice()-getPrice()*dis/100);
        System.out.println("The price after: "+getPrice());
    }
    public void getDetails(){
        System.out.println("Name: "+name+", Price: "+price+", Category: "+category);
    }
}
