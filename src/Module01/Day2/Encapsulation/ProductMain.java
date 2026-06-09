package Module01.Day2.Encapsulation;

public class ProductMain {
    public static void main(String[] args) {
        Product p=new Product("Fan",2000,"Electric");
        p.getDetails();
        p.applyDiscount(10);
    }
}
