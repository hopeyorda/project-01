import java.util.Date;

public class Rental {
    private String date;
    private Book book;
    private Person person;

    public Rental(Book book, Person person) {
        this.book = book;
        this.person = person;
    }

    public Rental(Date date, Book book, Person person) {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Book getBook() {
        return book;
    }

    public Person getPerson() {
        return person;
    }

}
