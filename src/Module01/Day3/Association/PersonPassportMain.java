package Module01.Day3.Association;

public class PersonPassportMain {
    public static void main(String[] args) {
        Person p = new Person("Nikaash", 21);
        Passport pass = new Passport(
                "IN123456",
                "India",
                "01-01-2024",
                "01-01-2034"
        );
        p.showDetails(pass);
    }
}
