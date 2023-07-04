package domaci17;

public class Laptop extends Computer {
    private double screenSize;
    private Keyboard keyboard;
    public Laptop(){

    }

    public Laptop(int numberOfCores, int amountOfRAM, int amountOfMemory, double screenSize, Keyboard keyboard) {
        super(numberOfCores, amountOfRAM, amountOfMemory);
        this.screenSize = screenSize;
        this.keyboard = keyboard;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop{" + super.toString() +
                "screenSize=" + screenSize + "\"" +
                ", keyboard=" + keyboard +
                "} ";
    }
}
