package Module01.Day2.Encapsulation;

public class Athlete {
    private String name;
    private String sport;
    private String team;
    public Athlete(String name, String sport, String team){
        this.name=name;
        this.sport=sport;
        this.team =team;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.sport = specialization;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public String getTeam() {
        return team;
    }
    public void train(){
        System.out.println(name+" is training");
    }
    public void compete(){
        System.out.println(name+" is competing");
    }
    public void getDetails(){
        System.out.println("Name: "+name+", Sport: "+sport+", Team: "+ team);
    }
}
