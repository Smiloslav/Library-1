package book;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        setName(name);
        setSurname(surname);
    }

    //getter

    public String getName() {
        return name;
    }

    public String getSurname() {

        return surname;
    }

    //setter

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Author: name: " + getName() + " surname: " + getSurname();
    }
}
