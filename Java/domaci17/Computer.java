package domaci17;

public class Computer {

    private int numberOfCores;
    private int amountOfRAM;
    private int amountOfMemory;

    public Computer(){

    }

    public Computer(int numberOfCores, int amountOfRAM, int amountOfMemory) {
        this.numberOfCores = numberOfCores;
        this.amountOfRAM = amountOfRAM;
        this.amountOfMemory = amountOfMemory;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public int getAmountOfRAM() {
        return amountOfRAM;
    }

    public void setAmountOfRAM(int amountOfRAM) {
        this.amountOfRAM = amountOfRAM;
    }

    public int getAmountOfMemory() {
        return amountOfMemory;
    }

    public void setAmountOfMemory(int amountOfMemory) {
        this.amountOfMemory = amountOfMemory;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "numberOfCores: " + numberOfCores +
                ", ram: " + amountOfRAM + "GB" +
                ", memory: =" + amountOfMemory + "GB, "
                ;
    }
}
