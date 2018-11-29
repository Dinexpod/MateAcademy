package lessons.ls3.tsk2;

public class BussTrain extends Machine {
    @Override
    public void doWork() {
        System.out.println("I'm !");
    }

    public void drive() {
        super.drive();
        System.out.println("I playing Trance");
    };
}
