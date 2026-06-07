package Day2.Encapsulation;

public class AthleteMain {
    public static void main(String[] args) {
        Athlete a=new Athlete("Dhoni","Cricket","CSK");
        a.train();
        a.compete();
        a.getDetails();
    }
}
