package Module01.Day3.Aggregation;

public class PersonAddressMain {
    public static void main(String[] args) {
        Person p1=new Person("Nikaash","TK",20);
        Person p2=new Person("Vishnu","Balaji",23);
        Address  add=new Address(14,"Sankaran Layout","Udt","TN");
        p1.setAddress(add);
        p2.setAddress(add);
        System.out.println(p1.getAddress());
        System.out.println(p2.getAddress());
    }
}
