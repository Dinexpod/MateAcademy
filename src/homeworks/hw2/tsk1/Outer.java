package homeworks.hw2.tsk1;

import jdk.jshell.execution.LocalExecutionControl;

public class Outer {
    private int a = 1;

    public int getA() {
        return a;
    }


    public void tmpMethod() {
        class LocalClass extends Outer {

        }
    }

    Runnable anonym = new Runnable() {

        @Override
        public void run() {
            System.out.println("In anonym class!");
        }
    };

}
