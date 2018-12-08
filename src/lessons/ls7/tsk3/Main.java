package lessons.ls7.tsk3;

public class Main {
    public static void main(String[] args) {
        MyThread thread = new MyThread(3000, "Thread");
        MyThread thread1 = new MyThread(5000, "Thread1");

        thread.start();
        thread1.start();

        System.out.println("Main method finished");
    }
}
