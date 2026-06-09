package Module01.WeeklyAssignment;

public class FuelTracker {
    private double fuelCapacity;
    private double currentFuel;
    private double mileage;
    public void setFuelCapacity(double fuelCapacity){
        this.fuelCapacity=fuelCapacity;
    }
    public void setCurrentFuel(double currentFuel){
        this.currentFuel=currentFuel;
    }
    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    public double getMileage() {
        return mileage;
    }
    public double getCurrentFuel() {
        return currentFuel;
    }
    public double getFuelCapacity() {
        return fuelCapacity;
    }
}
