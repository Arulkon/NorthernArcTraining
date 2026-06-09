package Module01.Day2.Encapsulation;

public class BookMain {
    public static void main(String[] args) {
        Book b=new Book("Harry Potter","JK Rowling",1000);
        b.readBook();
        b.getSummary();
    }
}
