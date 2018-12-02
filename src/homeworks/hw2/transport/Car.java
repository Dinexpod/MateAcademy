package homeworks.hw2.transport;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private final int dateOfProduction;
    private EngineType engineType;
    private double speedMax;
    private double overclocingTime;
    private int passengerCapacity;
    private int currentNumberPassengers = 0;
    private int currentSpeed;

    List<CarWheel> carWheels = new ArrayList<>();
    List<CarDoor> carDoors = new ArrayList<>(4);

    public Car(int dateOfProduction) {
        this.dateOfProduction = dateOfProduction;
    }

    public Car(int dateOfProduction,
               EngineType engineType,
               double speedMax,
               double overclocingTime,
               int passengerCapacity,
               int currentNumberPassengers,
               int currentSpeed) {
        this.dateOfProduction = dateOfProduction;
        this.engineType = engineType;
        this.speedMax = speedMax;
        this.overclocingTime = overclocingTime;
        this.passengerCapacity = passengerCapacity;
        this.currentNumberPassengers = currentNumberPassengers;
        this.currentSpeed = currentSpeed;
    }

    public void changeCurrentSpeed(int newSpeed) {
        if ((newSpeed > 0) && (newSpeed < getCurrentMaxSpeed())) {
            this.currentSpeed = newSpeed;
        } else {
            System.out.println("You can't set this speed if you love your Car!!! ");
        }
    }

    public void putOnePassenger() {
        if ((currentNumberPassengers < 0) || (currentNumberPassengers > passengerCapacity)) {
            System.out.println("There are no places for new passengers!!!");
        } else if (currentNumberPassengers < passengerCapacity) {
            currentNumberPassengers++;
            System.out.println("One passenger set in the car!");
        }
    }

    public void landOnePassenger() {
        if ((currentNumberPassengers < 0) || (currentNumberPassengers > passengerCapacity)) {
            System.out.println("There are no passengers to land!!!");
        } else if (currentNumberPassengers > 0) {
            currentNumberPassengers--;
            System.out.println("One passenger landed!");
        }
    }

    public void landAllPassengers() {
        for (int i = 0; i < currentNumberPassengers; i++) {
            this.currentNumberPassengers--;
            System.out.println("One passenger landed!");
        }
        System.out.println("All passengers landed!");
    }

    public double getCurrentMaxSpeed() {
        if (currentNumberPassengers < 0) {
            return 0;
        }

        double eraseDegree = 0;
        double currentMaxSpeed = speedMax * eraseDegree;

        for (CarWheel wheel : carWheels) {
            if (wheel.getTireState() > eraseDegree) {
                eraseDegree = wheel.getTireState();
            }
        }
        return currentMaxSpeed;
    }

    public CarDoor getDoorByIndex(int index) {
        if ((index >= 0) && (index < carDoors.size())) {
            return carDoors.get(index);
        }

        System.out.println("This index don't found!!!");
        return null;
    }

    public CarWheel getWheelByIndex(int index) {
        if ((index >= 0) && (index < carWheels.size())) {
            return carWheels.get(index);
        }

        System.out.println("This index don't found!");
        return null;
    }

    public void takeOffAllWheel() {
        for (CarWheel wheel : carWheels) {
            carWheels.remove(wheel);
        }
    }

    public void setNewWheel(int numberOfWheel) {
        for (int i = 0; i < numberOfWheel; i++) {
            carWheels.add(new CarWheel());
        }
    }

    public void dataAboutCar() {
        System.out.println("Data about car: \n" +
                "date of production = " + dateOfProduction +
                ", \nengine type = " + engineType +
                ", \nspeed max = " + speedMax +
                ", \noverclocing time = " + overclocingTime +
                ", \npassenger capacity = " + passengerCapacity +
                ", \ncurrent number passengers = " + currentNumberPassengers +
                ", \ncurrent speed = " + currentSpeed +
                ", \ncurrent MAX speed = " + getCurrentMaxSpeed() + ".");
    }
}
