package lessons.ls8.tsk1;

public class Main {
    private static volatile int count = 0;

    public static synchronized void run() {
        while (count < 100) {
            count++;
            System.out.println("thread: " + count);
        }
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread("first");
        MyThread thread1 = new MyThread("second");

        thread.start();
        thread1.start();

    }
}

