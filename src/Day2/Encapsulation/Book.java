package Day2.Encapsulation;

public class Book {
    private String title;
    private String author;
    private int pages;
    public Book (String title,String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPages(){
        return pages;
    }
    public void readBook(){
        System.out.println("The book "+title+" by "+author+" of pages "+pages+" is being read");
    }
    public void getSummary(){
        System.out.println("The summary of the book "+title+" is being given");
    }
}

