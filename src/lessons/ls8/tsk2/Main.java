package lessons.ls8.tsk2;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName() + " start");
                Thread.sleep(4000);
                System.out.println(Thread.currentThread().getName() + " finish");
                return "Hello from Callable";
            }
        };

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + " start");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " finish");
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.submit(runnable);

        Future<String> future = executorService.submit(callable);

        System.out.println(future.get());
        executorService.shutdown();
        System.out.println("Executor finish");
    }
}
