package Day2.Encapsulation;

public class Student {
    private String name;
    private char grade;
    private String school;
    public Student(String name,char grade,String school){
        this.name=name;
        this.grade=grade;
        this.school=school;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public String getSchool() {
        return school;
    }
    public void study(){
        System.out.println(name+" is studying in "+school+" school");
    }
    public void getReportCard(){
        System.out.println(name+" got the overall grade of "+grade);
    }
}
