package lessons.ls3.tsk2;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm move people!");
    }

    public void drive() {
        super.drive();
        System.out.println("I playing D&B");
    };
}
