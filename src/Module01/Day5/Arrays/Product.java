package Module01.Day5.Arrays;

public class Product {
    private int id;
    private String name;
    private String category;
    private String brand;
    private double price;
    private double discount;
    private double rating;
    public Product(int id,String name,String category,String brand,double price,double discount,double rating){
        this.id=id;
        this.name=name;
        this.category=category;
        this.brand=brand;
        this.price=price;
        this.discount=discount;
        this.rating=rating;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public double getDiscount() {
        return discount;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString(){
        return name+" "+category+" "+brand+" Rs."+price+" -discount of "+discount*100+"% "+" "+rating+"rating";
    }

}
