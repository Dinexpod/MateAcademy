package lessons.ls4.tsk1;

public class User {
    public String name;
    public int age;
    String street;

    public User(String name, int age, String street) {
        this.name = name;
        this.age = age;
        this.street = street;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if (this == o) {
            return true;
        }
        if (getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;

//         if (name !)

        return false;
    }
}
