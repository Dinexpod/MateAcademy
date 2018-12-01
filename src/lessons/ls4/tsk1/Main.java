package lessons.ls4.tsk1;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Oleg", 12, "Poleva");
        User user2 = new User("Oleg", 12, "Poleva");

        System.out.println(user1.equals(user2));
        System.out.println(user2.equals(user1));
        System.out.println(user1.equals(user1));


    }
}
