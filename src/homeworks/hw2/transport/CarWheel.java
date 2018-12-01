package homeworks.hw2.transport;

public class CarWheel {
    private double tireState;

    public double getTireState() {
        return tireState;
    }

    public CarWheel() {
        if (tireState == 0) {
            tireState = 1;
        }
    }

    public CarWheel(double tireState) {
        this.tireState = tireState;
    }

    public void setNewTire() {
        tireState = 1;
    }

    public void eraseTire(double persentOfErase) {
        if ((tireState <= 1) && (tireState >= 0)) {
            tireState -= ((tireState * persentOfErase) / 100);
            if (tireState <= 0) {
                System.out.println("Tire is erased!!!");
                tireState = 0;
            }
        }
    }

    public void dataOfWheel() {
        System.out.println("Degree of the wheel erase: " +
                "wheel erase = " + tireState + ".");
    }
}
