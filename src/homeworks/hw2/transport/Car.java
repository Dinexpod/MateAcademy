package homeworks.hw2.transport;

import java.util.ArrayList;
import java.util.List;

public class Car {
//    private final int dateOfProduction;
    private String engineType = "dizel";
    private double speedMax = 210;
    private double overclocingTime = 2.9;
    private int passengerCapacity = 4;
    private int currentPassCapacity;
    private int currentSpeed;

    List<CarWheel> carWheels = new ArrayList<CarWheel>();
    List<CarDoor> carDoors = new ArrayList<CarDoor>();

}
