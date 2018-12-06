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
        customArrayList.add(3);
        customArrayList.add(47);
        customArrayList.add(5);
        customArrayList.add(6);
        customArrayList.add(7);
        customArrayList.add(null);

        System.out.println(customArrayList.toString());
        System.out.println(customArrayList.get(2));
        System.out.println(customArrayList.toString());
        System.out.println(customArrayList.get(9));
        System.out.println(customArrayList.toString());

        customArrayList.add(0, 111);

        System.out.println(customArrayList.toString());
        System.out.println(customArrayList.get(9));
        System.out.println(customArrayList.toString());
        System.out.println(customArrayList.get(10));
        System.out.println(customArrayList.toString());
        System.out.println(customArrayList.isEmpty());
        System.out.println(customArrayList.toString());
        System.out.println("CONTAINS  " + customArrayList.contains(null));
        System.out.println(customArrayList.toString());
        System.out.println("CONTAINS -- " + customArrayList.contains(48));
        System.out.println(customArrayList.toString());

        customArrayList.remove(5);

        System.out.println(customArrayList.toString());
        System.out.println(customArrayList.get(5));
        System.out.println(customArrayList.toString());

        customArrayList.clear();

        System.out.println(customArrayList.toString());
        System.out.println(customArrayList.isEmpty());
        System.out.println(customArrayList.toString());
    }
}
