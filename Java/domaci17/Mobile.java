package domaci17;

public class Mobile extends Computer {
    private int cameraVolume;
    private Network network;

    public Mobile(int numberOfCores, int amountOfRAM, int amountOfMemory, int cameraVolume, Network network) {
        super(numberOfCores, amountOfRAM, amountOfMemory);
        this.cameraVolume = cameraVolume;
        this.network = network;
    }

    public int getCameraVolume() {
        return cameraVolume;
    }

    public void setCameraVolume(int cameraVolume) {
        this.cameraVolume = cameraVolume;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    @Override
    public String toString() {
        return "Mobile{" + super.toString() +
                "cameraVolume=" + cameraVolume + "Megapixels" +
                ", network=" + network.toString().replaceAll("_","") +
                "} " ;
    }
}
