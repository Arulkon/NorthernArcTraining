package Day2.Encapsulation;

public class Movie {
    private String title;
    private String director;
    private int releaseYear;
    public Movie (String title, String director, int releaseYear) {
        this.title = title;
        this.director = director;
        this.releaseYear = releaseYear;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public String getTitle(){
        return title;
    }
    public String getDirector(){
        return director;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    public void play(){
        System.out.println("The movie "+title+" by "+ director +" of release year "+ releaseYear +" is being played");
    }
    public void getRating(){
        System.out.println("The rating of the movie "+title+" is being given");
    }
}

