package Module01.Day3.Association;



public class Passport {
    private String passno;
    private String country;
    private String issuedate;
    private String expirydate;

    public Passport(String passno, String country, String issuedate, String expirydate) {
        this.passno = passno;
        this.country = country;
        this.issuedate = issuedate;
        this.expirydate = expirydate;
    }

    public String getPassno() {
        return passno;
    }

    public String getCountry() {
        return country;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    @Override
    public String toString() {
        return "Passport No: " + passno +
                ", Country: " + country +
                ", Issue Date: " + issuedate +
                ", Expiry Date: " + expirydate;
    }
}