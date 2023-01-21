import java.util.Objects;

public class Book {
    private final String title;
    private final Author author;
    private int yearPublishing;

    public Book (String title, Author author, int yearPublishing) {
        this.title = title;
        this.author = author;
        this.yearPublishing = yearPublishing;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public String toString() {
        return "Автор: " + author + " Название: " + title + " Год публикации: " + yearPublishing;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title) && Objects.equals(author, book.author) && yearPublishing == book.yearPublishing;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, yearPublishing);}

}