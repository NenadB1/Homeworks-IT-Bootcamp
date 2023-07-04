package domaci17;

import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(4, 8, 512, 27, Keyboard.INTERNATIONAL);
        Laptop laptop2 = new Laptop(8, 16, 1024, 32, Keyboard.US);

        Mobile mobile1 = new Mobile(4, 8, 256, 32, Network._5G);
        Mobile mobile2 = new Mobile(4, 16, 512, 64, Network._5G);

        ArrayList<Computer> devices = new ArrayList<>();
        devices.add(laptop1);
        devices.add(laptop2);
        devices.add(mobile1);
        devices.add(mobile2);

        for (int i = 0; i < devices.size(); i++) {
            Computer computer = devices.get(i);
            if(computer instanceof Laptop){
                System.out.println(devices.get(i) + " is Laptop.") ;
            } else if(computer instanceof Mobile){
                System.out.println(devices.get(i) + " is Mobile phone.");
            }
        }
    }

}

