package domaci17;

public class Dog extends Animal {

    private boolean goodBoy;

    public Dog(){

    }

    public Dog(boolean goodBoy, String name, String nickname) {
        super(name,nickname);
        this.goodBoy = goodBoy;
    }

    public boolean isGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(boolean goodBoy) {
        this.goodBoy = goodBoy;
    }
    public String isHeGoodDog(){
        if(this.goodBoy){
            return "I am a good boy";
        } else {
            return "I am a bad boy";
        }
    }

    @Override
    public String sound(){
        return "Woof";
    }

    @Override
    public String toString() {



        return  "Pas{" +
                isHeGoodDog() + ", " +
                "sound: " +  sound() +
                "} " + super.toString();
    }
}
