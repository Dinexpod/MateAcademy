package lessons.ls3.tsk1;

public class AB implements A, B {
    @Override
    public void print() {
        A.super.print();
    }
}
