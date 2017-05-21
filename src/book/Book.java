package book;

import java.io.Serializable;
import java.util.ArrayList;

public class Book implements Serializable{
    private String title;
    private String description;
    private Publisher publisher;
    private ArrayList<Author> authorsList;
    private final Long isbn;

    public Book(Long isbn) {
        this.isbn = isbn;
        title = "";
        description = "";
        publisher = null;
        authorsList = new ArrayList<>();
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
        if(!authorsList.contains(author))
            this.authorsList.add(author);
        else
            throw new RuntimeException("This author is already added.");
    }

    public void addAuthor(String name, String surname){
        Author author = new Author(name,surname);
        addAuthor(author);
    }

    public void removeAuthor(int index){
        try{
            this.authorsList.remove(index);
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

    public String getAuthorList(){
        if (authorsList.isEmpty()){
            return "Author list is empty, please add authorsList.";
        }

        String tempAuthor = "";
        for (Author author: authorsList) {
            tempAuthor += author.toString() + " ";
        }
        return tempAuthor;
    }

    @Override
    public String toString() {
        String toString = "Title: " + getTitle() + "\n";
        toString += "Description: " + getDescription() + "\n";
        toString += "Publisher: " + getPublisher().getName() + "\n";
        toString += "Author list: " + getAuthorList() + "\n";
        toString += "ISBN: " + isbn;
        return toString;
    }
}
