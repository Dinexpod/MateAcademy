package lessons.ls7.tsk3;

public class MyThread extends Thread {
    long sleepMillis;
    String name;

    public MyThread(long sleepMillis, String name) {
        super(name);
        this.sleepMillis = sleepMillis;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + " thread run started");
        try {
            Thread.sleep(sleepMillis);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException eass occurred in " + name);
        }

        System.out.println(name + " thread finished");
    }
}
