package lessons.ls8.tsk1;

public class MyThread extends Thread {
    public void run() {
        Main.run();
    }

    public MyThread(String name) {
        super(name);
    }


}
