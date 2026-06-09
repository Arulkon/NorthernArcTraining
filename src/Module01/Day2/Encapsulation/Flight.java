package Module01.Day2.Encapsulation;

public class Flight {
    private String airline;
    private String flightNumber;
    private String source;
    private String destination;
    private String departureDateTime;
    private String arrivalDateTime;
    public Flight(String airline,String flightNumber,String source,String destination,String departureDateTime,String arrivalDateTime){
        this.airline=airline;
        this.flightNumber=flightNumber;
        this.source=source;
        this.destination=destination;
        this.departureDateTime=departureDateTime;
        this.arrivalDateTime=arrivalDateTime;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getAirline() {
        return airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }
    public void getStatus(){
        System.out.println("The status of the flight "+flightNumber+" is being given");
    }
    public void showDetails(){
        System.out.println("Airline: "+airline+", Flight no: "+flightNumber+", Source: "+source+", Destination: "+destination+", Departure: "+departureDateTime+", Arrival: "+arrivalDateTime);
    }
}
