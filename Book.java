import java.util.ArrayList;
import java.util.List;
public class Book {
    String title;
     String author;
    private List<Rental> rentals;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.rentals = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}
