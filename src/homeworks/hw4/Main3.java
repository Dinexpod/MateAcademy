package homeworks.hw4;

public class Main3 {
    public static void main(String[] args) {
        MyThread thread = new MyThread(5000, "Thread");
        MyThread thread1 = new MyThread(3000, "Thread1");

        thread.setDaemon(true);
        thread1.setDaemon(true);

        thread.start();

        try {
            thread.join(5000);
            System.out.println(thread.name + " join exist.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.start();

        System.out.println("Main method finished!!");
    }
}
