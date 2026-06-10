package Module01.Day3.Composition;

public class Engine {
    private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public void start() {
        System.out.println("Engine Started");
    }

    public int getHorsepower() {
        return horsepower;
    }
}
