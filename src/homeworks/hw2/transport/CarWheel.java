package homeworks.hw2.transport;

public class CarWheel {
    private double tireState;

    public double getTireState() {
        return tireState;
    }

    public void ifNoTire() {
        if(tireState == 0) {
            tireState = 1;
        }
    }

    public void setTireState(double tireState) {
        this.tireState = tireState;
    }

    public void setNewTire() {
        tireState = 1;
    }

    public void eraseTire(double persentOfErase) {
        if((tireState <= 1) && (tireState >= 0)) {
            tireState -= ((tireState * persentOfErase) / 100);
            if (tireState <= 0) {
                System.out.println("Tire is erased!!!");
                tireState = 0;
            }
        }
    }

    public String dataOfWheel() {
        return "Degree of the wheel erase: " +
                "wheel erase = " + tireState + ".";
    }
}
