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
}
