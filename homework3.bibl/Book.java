package homework3.biblioteka;

public class Book {
    String autor;
    String title;
    int pagesNum;
    int quantity;

    protected Book(String autor, String title, int pagesNum, int quantity){
        this.autor = autor;
        this.title = title;
        this.pagesNum = pagesNum;
        this.quantity = quantity;
    }
}
