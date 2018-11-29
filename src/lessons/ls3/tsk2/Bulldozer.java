package lessons.ls3.tsk2;

public class Bulldozer extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm copaiu!");
    }

    public void drive() {
        super.drive();
        System.out.println("I playing DubStep");
    };
}
