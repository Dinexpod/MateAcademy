package homeworks.hw2.transport;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Car {
    private final String dateOfProduction;
    private String engineType;
    private double speedMax;
    private double overclocingTime;
    private int passengerCapacity;
    private int currentPassCapacity;
    private int currentSpeed;

    List<CarWheel> carWheels = new ArrayList<CarWheel>();
    List<CarDoor> carDoors = new ArrayList<CarDoor>();

    Date date = new Date();

    public Car() {
        this.dateOfProduction = date.toString();
    }

    public Car(String dateOfProduction,
               String engineType,
               double speedMax,
               double overclocingTime,
               int passengerCapacity,
               int currentPassCapacity,
               int currentSpeed) {
        this.dateOfProduction = dateOfProduction;
        this.engineType = engineType;
        this.speedMax = speedMax;
        this.overclocingTime = overclocingTime;
        this.passengerCapacity = passengerCapacity;
        this.currentPassCapacity = currentPassCapacity;
        this.currentSpeed = currentSpeed;
    }
}
