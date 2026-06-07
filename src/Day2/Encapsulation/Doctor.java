package Day2.Encapsulation;

public class Doctor {
    private String name;
    private String specialization;
    private int experience;
    public Doctor(String name, String specialization,int experience){
        this.name=name;
        this.specialization=specialization;
        this.experience=experience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public int getExperience() {
        return experience;
    }
    public void diagnose(){
        System.out.println("Dr."+name+" is diagnosing");
    }
    public void treat(){
        System.out.println("Dr."+name+" is treating");
    }
    public void getDetails(){
        System.out.println("Name: Dr."+name+", Speciality: "+specialization+", Experience: "+experience);
    }
}
