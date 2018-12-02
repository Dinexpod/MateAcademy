package homeworks.hw2.transport;

public class CarDoor {
    private States doorState;
    private States windowState;

    public CarDoor() {
        if ((doorState == null) && (windowState == null)) {
            doorState = doorState.CLOSED;
            windowState = windowState.CLOSED;
        }
    }

    public States getDoorState() {
        return doorState;
    }

    public States getWindowState() {
        return windowState;
    }

    public CarDoor(States doorState, States windowState) {
        this.doorState = doorState;
        this.windowState = windowState;
    }

    public void openDoor() {
        doorState = doorState.OPEN;
    }

    public void closeDoor() {
            doorState = doorState.CLOSED;
    }

    public void OpenCloseDoor() {
        if (doorState == doorState.OPEN) {
            this.closeDoor();
        } else {
            this.openDoor();
        }
    }

    public void openWindow() {
        doorState = windowState.OPEN;
    }

    public void closeWindow() {
        doorState = windowState.CLOSED;
    }

    public void OpenCloseWindow() {
        if (doorState == windowState.OPEN) {
            this.closeWindow();
        } else {
            this.openWindow();
        }
    }

    public void dataOfDoor() {
        System.out.println("Data of the door: " +
                "door state = " + doorState + ", " +
                "window state = " + windowState + ".");
    }
}
