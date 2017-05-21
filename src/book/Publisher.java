package book;

import java.io.Serializable;

public class Publisher implements Serializable {
    private String name;
    private String description;

    public Publisher(String name, String description){
        setName(name);
        setDescription(description);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Publisher: " + "name: " + getName() + ", description: " + getDescription();
    }
}