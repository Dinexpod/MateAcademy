package lessons.ls2.three;

public class Tmp {
    int age;
    int weight;
    String name;
    int newValue;

    {
        int age = 40;
        this.age = 60;
        this.weight = 4000;
        newValue = 50;

    }

    public Tmp(int age) {
        this.age = age;
    }

    public Tmp() {

    }
    public static void main(String[] args) {
        Tmp tmp = new Tmp();

        System.out.println(tmp.age);
        System.out.println(tmp.weight);
        System.out.println(tmp.name);
        System.out.println(tmp.newValue);
    }
}
