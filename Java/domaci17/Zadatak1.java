package domaci17;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        Dog dog1 = new Dog(true,"Dzeki","Dzeki");
        Dog dog2 = new Dog(false,"Rex","Rex");

        Cat cat1 = new Cat("Kleopatra","Kleo",5);
        Cat cat2 = new Cat("Kaisa","Kai",6);


        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog1);
        animals.add(dog2);
        animals.add(cat1);
        animals.add(cat2);

        System.out.println(animals);

        for(int i = 0; i< animals.size();i++){
           Animal animal = animals.get(i);
            if(animal instanceof Dog){
                System.out.println("Dog: " + animal);
            } else if(animal instanceof Cat){
                System.out.println("Cat: " + animal);
            }
        }

    }

}
