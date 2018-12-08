package lessons.ls7.tsk2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
//        ExceptionTask.print();

        try {
            ExceptionTask.getFile();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
