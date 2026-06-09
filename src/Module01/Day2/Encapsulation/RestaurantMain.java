package Module01.Day2.Encapsulation;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant r=new Restaurant("Buhari","South Indian,North Indian",4.9);
        r.orderFood();
        r.getDetails();
    }
}
