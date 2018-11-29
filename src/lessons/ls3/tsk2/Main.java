package lessons.ls3.tsk2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Machine buldozer = new Bulldozer();
        Machine excavator = new Excavator();
        Machine bussTrain = new Bulldozer();

        List<Machine> machines = new ArrayList<>();

        machines.add(buldozer);
        machines.add(excavator);
        machines.add(bussTrain);

        for (Machine machine : machines) {
            machine.start();
            machine.doWork();
        }

//        buldozer.start();
//        excavator.start();
//        bussTrain.start();
//
//        buldozer.doWork();
//        excavator.doWork();
//        bussTrain.doWork();
    }
}
