package Module01.Day3.Composition;

public class Car {
    private String model;
    private Engine engine;
    private AC ac;
    private MusicSystem musicSystem;

    public Car(String model, int horsepower,
               String acBrand, int speakers) {
        this.model = model;
        this.engine = new Engine(horsepower);
        this.ac = new AC(acBrand);
        this.musicSystem = new MusicSystem(speakers);
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Horsepower: " + engine.getHorsepower());
        System.out.println("AC Brand: " + ac.getBrand());
        System.out.println("Speakers: " + musicSystem.getSpeakers());
    }

    public void drive() {
        engine.start();
        ac.cool();
        musicSystem.play();
        System.out.println("Car is Moving");
    }
}
