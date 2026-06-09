package Module01.Day2.Encapsulation;

public class FlightMain {
    public static void main(String[] args) {
        Flight f=new Flight("Indigo","6E7089","Coimbatore","Chennai","31/05/2026.11:35","31/05/2026.13.00");
        f.getStatus();
        f.showDetails();
    }
}
