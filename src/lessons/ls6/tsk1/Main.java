package lessons.ls6.tsk1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Addres addres = new Addres();
        addres.setSity("Kyiv");

        User user1 = new User();
        user1.setName("Tony");
        user1.setLastvizit(new Date());
        user1.setBooks(new HashSet<>(Arrays.asList("book1", "kobzar")));
        user1.setAge(16);
        user1.setAddres(addres);

        User user2 = new User();
        user2.setName("Jeck");
        user2.setLastvizit(new Date());
        user2.setBooks(new HashSet<>(Arrays.asList("Garry Potter", "World of war")));
        user2.setAge(18);
        user2.setAddres(addres);

        User user3 = new User();
        user3.setName("Tadrus");
        user3.setLastvizit(new Date());
        user3.setBooks(new HashSet<>(Arrays.asList("book", "Cool book")));
        user3.setAge(25);
        user3.setAddres(addres);

        users.add(user1);
        users.add(user2);
        users.add(user3);

//        users.stream()
//                .filter((u) -> u.getAge() < 18)
//                .flatMap(u -> u.getBooks().stream())
//                        .forEach(System.out::println);

//        boolean kobzarExist = users.stream()
//                .filter((u) -> u.getAge() < 18)
//                .flatMap(u -> u.getBooks().stream())
//                .anyMatch("kobzar"::equals);
//
//        System.out.println(kobzarExist);

        List<String> cityList = users.stream()
                .filter((u) -> u.getAge() < 18)
                .filter(Objects::nonNull)
                .filter(u -> u.getAddres() != null)
                .map(user -> user.getAddres().getSity())
               .collect(Collectors.toList());

        System.out.println(cityList);



    }
}
