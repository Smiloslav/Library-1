import book.Author;
import book.Book;
import book.Publisher;

public class App {
    public static void main(String[] args) {
        Book book = new Book(9788328313361l);
        Publisher helion = new Publisher("Helion");
        book.setTitle("Java 8. Przewodnik doświadczonego programisty");
        book.setPublisher(helion);
        Author author = new Author("Cay S.", "Horstmann");
        book.addAuthor("Cay S.", "Horstmann");
        book.addAuthor(author);

        System.out.println(book.toString());
    }
}
