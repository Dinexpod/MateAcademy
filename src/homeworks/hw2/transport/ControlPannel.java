package homeworks.hw2.transport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlPannel {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello!!! Welcome to my program 'Car'!!! \nLets try create and use our Car! ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("That to create a 'Car' push number -> 1.");
        Integer tmp = Integer.parseInt(reader.readLine());

        if (tmp == 1) {
            System.out.println("OK!");
        } else {
            System.out.println("You choose not founded command!");
            return;
        }

        Car car = new Car();

        System.out.println("Cool! You created car, but it not working yet. \n" +
                "That to see state of car push number -> 1");

        tmp = Integer.parseInt(reader.readLine());

        if (tmp == 1) {
            car.dataAboutCar();
        } else {
            System.out.println("You choose not founded command!");
            return;
        }



//        CarDoor carDoor1 = new CarDoor();
//        car.carDoors.add(carDoor1);
//        CarDoor carDoor = car.getDoorByIndex(0);
//        System.out.println(carDoor);
//        carDoor.getDoorState();
    }
}
