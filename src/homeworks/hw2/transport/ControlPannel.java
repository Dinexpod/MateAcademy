package homeworks.hw2.transport;

public class ControlPannel {
    public static void main(String[] args) {
        Car car = new Car();
        CarDoor carDoor1 = new CarDoor();
        car.carDoors.add(carDoor1);
        CarDoor carDoor = car.getDoorByIndex(0);
        System.out.println(carDoor);
        carDoor.getDoorState();
    }
}
