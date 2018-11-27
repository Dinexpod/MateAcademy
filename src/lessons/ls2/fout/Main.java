package lessons.ls2.fout;

public class Main {
    public static void main(String[] args) {
//        Outer.Inner outerInner = new Outer().new Inner();
//        outerInner.setI(8);
//        System.out.println(outerInner.getI());

        Outer.StaticInner oi = new Outer.StaticInner();
        System.out.println(oi.getI());
    }
}
