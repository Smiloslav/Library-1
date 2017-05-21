package book;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable{
    private String title;
    private String description;
    private Publisher publisher;
    private ArrayList<Author> author;
    private final Long isbn;

    public Book(String title, String description, Publisher publisher, Author author, Long isbn) {
        super();
        this.isbn = isbn;
    }

    // setter

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void addAuthor(Author author) {
        this.author.add(author);
    }

    public void addAuthor(String name, String surname){
        this.author.add(new Author(name,surname));
    }

    public void removeAuthor(int index){
        try{
            this.author.remove(index);
        }catch (IndexOutOfBoundsException ex){
            ex.getMessage();
        }
    }

    // getter


    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public 
}
