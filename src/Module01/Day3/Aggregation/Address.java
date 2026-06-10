package Module01.Day3.Aggregation;

public class Address {
    private int houseno;
    private String street;
    private String city;
    private String state;
    public Address(int houseno, String street,String city,String state){
        this.houseno=houseno;
        this.street=street;
        this.city=city;
        this.state=state;
    }

    public int getHouseno() {
        return houseno;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }
    @Override
    public String toString() {
        return houseno + "," +street + ", " + city + ", " + state;
    }
}
