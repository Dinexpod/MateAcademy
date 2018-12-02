package homeworks.hw2.transport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ControlPannel {
    public static void main(String[] args) throws IOException {
        System.out.println("\nHello!!! Welcome to my program 'Car'!!! \nLets try create and use our Car! ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nThat to create a 'Car' push number -> 1.");
        Integer tmp = Integer.parseInt(reader.readLine());

        if (tmp == 1) {
            System.out.println("\nOK!");
        } else {
            System.out.println("\nYou choose not founded command!");
            return;
        }

        Car car = new Car(2018);

        System.out.println("\nCool! You created car, but it not working yet. \n" +
                "That to see state of car push number -> 1");

        tmp = Integer.parseInt(reader.readLine());

        if (tmp == 1) {
            car.dataAboutCar();
        } else {
            System.out.println("\nYou choose not founded command!");
            return;
        }

        System.out.println("\nThat to create a 'Door' push number -> 1.");

        tmp = Integer.parseInt(reader.readLine());

        if (tmp == 1) {
            System.out.println("\nOK!");
        } else {
            System.out.println("\nYou choose not founded command!");
            return;
        }

        CarDoor carDoor = new CarDoor();

        System.out.println("\nCool! You created door, but it not working yet. \n" +
                "That to see state of car push number -> 1");

        tmp = Integer.parseInt(reader.readLine());

        if (tmp == 1) {
            carDoor.dataOfDoor();
        } else {
            System.out.println("\nYou choose not founded command!");
            return;
        }

//        CarDoor carDoor1 = new CarDoor();
//        car.carDoors.add(carDoor1);
//        CarDoor carDoor = car.getDoorByIndex(0);
//        System.out.println(carDoor);
//        carDoor.getDoorState();
    }
}
