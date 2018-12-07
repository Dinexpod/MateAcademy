package homeworks.hw3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> customArrayList = new CustomArrayList(4);
        System.out.println(customArrayList.toString());

        customArrayList.add(0);
        customArrayList.add(1);
        customArrayList.add(1);
        customArrayList.add(2);

        System.out.println(customArrayList.toString());

        customArrayList.add(4, 48);

        System.out.println(customArrayList.toString());
        System.out.println("Is EMPTY " + customArrayList.isEmpty());
        System.out.println(customArrayList.toString());
        System.out.println("CONTAINS  " + customArrayList.contains(null));
        System.out.println(customArrayList.toString());
        System.out.println("CONTAINS -- " + customArrayList.contains(48));
        System.out.println(customArrayList.toString());

        customArrayList.remove(5);

        System.out.println(customArrayList.toString());

        customArrayList.clear();

        System.out.println(customArrayList.toString());
        System.out.println(customArrayList.isEmpty());
    }
}
