package homeworks.hw2.transport;

public class CarDoor {
    private String doorState;
    private String windowState;

    public CarDoor() {
        if ((doorState == null) && (windowState == null)) {
            doorState = "Door closed";
            windowState = "Window closed";
        }
    }

    public String getDoorState() {
        return doorState;
    }

    public String getWindowState() {
        return windowState;
    }

    public CarDoor(String doorState, String windowState) {
        this.doorState = doorState;
        this.windowState = windowState;
    }

    public void openDoor() {
        doorState = "Door opened";
    }

    public void closeDoor() {
        doorState = "Door closed";
    }

    public void OpenCloseDoor() {
        if (doorState == "Door opened") {
            this.closeDoor();
        } else {
            this.openDoor();
        }
    }

    public void openWindow() {
        doorState = "Window opened";
    }

    public void closeWindow() {
        doorState = "Window closed";
    }

    public void OpenCloseWindow() {
        if (doorState == "Window opened") {
            this.closeWindow();
        } else {
            this.openWindow();
        }
    }

    public String dataOfDoor() {
        return "Data of the door: " +
                "door state = " + doorState + ", " +
                "window state = " + windowState + ".";
    }
}
