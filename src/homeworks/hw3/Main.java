package homeworks.hw3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> customArrayList = new CustomArrayList(4);
        System.out.println("size " + customArrayList.size());

        customArrayList.add(0);
        customArrayList.add(1);
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add(3);
        customArrayList.add(47);
        customArrayList.add(5);
        customArrayList.add(6);
        customArrayList.add(7);
        customArrayList.add(8);

        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.size());
        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.get(2));
        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.get(9));
        System.out.println("size " + customArrayList.size());

        customArrayList.add(9, 9);

        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.get(9));
        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.get(10));
        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.get(11));
        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.isEmpty());
        System.out.println("size " + customArrayList.size());
        System.out.println("CONTAINS  " + customArrayList.contains(47));
        System.out.println("size " + customArrayList.size());
        System.out.println("CONTAINS -- " + customArrayList.contains(48));
        System.out.println("size " + customArrayList.size());

        customArrayList.remove(5);

        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.get(5));
        System.out.println("size " + customArrayList.size());

        customArrayList.clear();

        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.isEmpty());
        System.out.println("size " + customArrayList.size());
        System.out.println(customArrayList.get(2));
    }
}