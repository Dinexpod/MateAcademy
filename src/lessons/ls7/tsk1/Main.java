package lessons.ls7.tsk1;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        try {
            Field field = user.getClass().getDeclaredField("age");
            field.setAccessible(true);
            int newAge = (int) field.get(user);
            System.out.println(newAge);
            Class<?> declaringClass = field.getType();
            System.out.println(declaringClass);

            field.set(user, 40);
            System.out.println((int) field.get(user));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class User {
    private int age = 20;

    public void setAge(int age) {
        this.age = age;
    }
}
