package book;

import java.io.Serializable;

public class Book implements Serializable{
    private String title;
    private String description;
    private Publisher publisher;
    private Author author;
    private final Long isbn;

    public Book(String title, String description, Publisher publisher, Author author, Long isbn) {
        this.title = title;
        this.description = description;
        this.publisher = publisher;
        this.author = author;
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

    public void setAuthor(Author author) {
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }
}
