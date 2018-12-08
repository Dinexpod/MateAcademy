package lessons.ls7.tsk2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;

public class ExceptionTask {
    public static void print() throws NullPointerException {
        throw new NullPointerException();
    }

    public static void getFile() throws MyException {
        String fileName = "file.txt";
       try {
           FileReader fileReader = new FileReader("Not exist file");
       } catch (FileNotFoundException e) {
           throw new MyException("Cannot open file " + fileName, e);
       }
    }
}
