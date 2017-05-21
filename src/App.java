import book.Publisher;

public class App {
    public static void main(String[] args) {
        Publisher publisher = new Publisher("Helion", "Ponad 2900 wydanych tytułów. To publikacje podążające za dynamicznie rozwijającymi się technologiami, kierowane do wszystkich użytkowników komputerów, bez względu na stopień zaawansowania.");
        System.out.println(publisher.toString());
    }
}
