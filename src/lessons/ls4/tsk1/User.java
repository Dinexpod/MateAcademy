package lessons.ls4.tsk1;

import java.util.Objects;

public class User {
    public String name;
    public int age;
    String street;

    public User(String name, int age, String street) {
        this.name = name;
        this.age = age;
        this.street = street;
    }
/*
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

        if (this.age != user.age) {
            return false;
        }
        if ((this.street != null) ? (!this.street.equals(user.street)) : (user.street != null))
            return false;

        if ((this.name != null) ? (!this.name.equals(user.name)) : (user.name != null))
            return false;

        return true;
    } */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name) &&
                Objects.equals(street, user.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, street);
    }
}

