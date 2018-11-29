package lessons.ls3.tsk2;

public abstract class Machine {
    private boolean wasStarted;
    private boolean wasWorked;

    public void start() {
        wasStarted = true;

        if (wasStarted == true) {
            System.out.println("Start");
        } else {
            System.out.println("NOT start yet");
        }
    }

    public void stop() {
        System.out.println("Stop");
    }

    public void drive() {
        System.out.println("I'm driven by someone!");
    }

    public abstract void doWork();
}
