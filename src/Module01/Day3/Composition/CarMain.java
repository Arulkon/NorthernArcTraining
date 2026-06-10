package Module01.Day3.Composition;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("Honda City", 120,
                "LG", 4);

        car.displayDetails();
        car.drive();
    }
}
