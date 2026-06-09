package Module01.Day2.Encapsulation;

public class DoctorMain {
    public static void main(String[] args) {
        Doctor d=new Doctor("Nikaash","Cardilogist",10);
        d.diagnose();
        d.treat();
        d.getDetails();
    }
}
