package homeworks.hw3;

public class Main {
    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList(4);
        customArrayList.add(8);
        customArrayList.add(87);
        customArrayList.add(8);
        customArrayList.add(8);
        customArrayList.add(87);
        customArrayList.add(8);
        customArrayList.add(8);
        customArrayList.add(87);
        customArrayList.add(8);


        System.out.println(customArrayList.size());
        System.out.println(customArrayList.capacity);


    }
}
