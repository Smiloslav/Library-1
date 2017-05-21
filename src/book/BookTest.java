package book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book(9788328313361l);
        Publisher helion = new Publisher("Helion");
        book.setTitle("Java 8. Przewodnik doświadczonego programisty");
        book.setPublisher(helion);
        book.addAuthor("Cay S.", "Horstmann");
        System.out.println(book.toString());
    }
}
