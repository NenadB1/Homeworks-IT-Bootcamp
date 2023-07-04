package domaci17;

public class Cat extends Animal {

    private double weight;

    public Cat() {

    }

    public Cat(String ime, String nadimak, double weight) {
        super(ime, nadimak);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String isSheHeavy(){
        if(this.weight <= 5 && this.weight > 0){
            return "I'm not a chonk";
        } else if(this.weight > 5){
            return "I'm a chonk";
        } else {
            return "I can't be in minus with kilos :D ";
        }
    }

    @Override
    public String sound(){
        return "Meow";
    }

    @Override
    public String toString() {
        return "Macka{" +
                "weight=" + weight + " " +
                isSheHeavy() + ", " +
                "sound: " + sound() +
                "} " + super.toString();
    }
}
