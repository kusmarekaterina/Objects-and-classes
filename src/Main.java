public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Александр", "Солженицын");
        Book book1 = new Book("В круге первом", author1, 2010);
        System.out.println(book1);
        Author author2 = new Author("Василий", "Гроссман");
        Book book2 = new Book("Жизнь и судьба", author2, 2005);
        book2.setYearPublishing(2007);
        System.out.println(book2);

    }
}