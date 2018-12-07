package lessons.ls6.tsk1;

import java.util.Date;
import java.util.Set;

public class User {
    private String name;
    private Date lastvizit;
    private Set<String> books;
    private int age;
    private Addres addres;

    public Addres getAddres() {
        return addres;
    }

    public void setAddres(Addres addres) {
        this.addres = addres;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getLastvizit() {
        return lastvizit;
    }

    public void setLastvizit(Date lastvizit) {
        this.lastvizit = lastvizit;
    }

    public Set<String> getBooks() {
        return books;
    }

    public void setBooks(Set<String> books) {
        this.books = books;
    }
}
