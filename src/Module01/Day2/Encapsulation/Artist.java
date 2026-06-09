package Module01.Day2.Encapsulation;

public class Artist {
    private String name;
    private String style;
    private String medium;
    public Artist(String name, String style,String medium){
        this.name=name;
        this.style=style;
        this.medium=medium;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public String getName() {
        return name;
    }

    public String getStyle() {
        return style;
    }

    public String getMedium() {
        return medium;
    }
    public void create(){
        System.out.println(name+" is doing art");
    }

    public void getDetails(){
        System.out.println("Name: "+name+", Style: "+style+", Medium: "+medium);
    }
}
