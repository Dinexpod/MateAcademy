package homeworks.hw2.transport;

public class CarDoor {
    private String doorState;
    private String windowState;

    public void setDorAndWindowStateIfEmpty() {
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

    public void setDorAndWindowState(String doorState, String windowState) {
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
        } else if (doorState == "Door closed") {
            this.openDoor();
        } else {
            this.setDorAndWindowStateIfEmpty();
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
        } else if (doorState == "Window closed") {
            this.openWindow();
        } else {
            this.setDorAndWindowStateIfEmpty();
        }
    }

    public String dataOfDoor() {
        return "Data of the door: " +
                "door state = " + doorState + ", " +
                "window state = " + windowState + ".";
    }
}
