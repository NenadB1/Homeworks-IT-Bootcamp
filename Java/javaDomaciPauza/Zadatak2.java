package javaDomaciPauza;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int prvibroj = s.nextInt();
        System.out.println("Unesite drugi broj: ");
        int drugibroj = s.nextInt();

        if(prvibroj != drugibroj){
            int max = Math.max(prvibroj,drugibroj);
        System.out.println("Od unetih brojeva veci je: " + max);
        } else{
            System.out.println("Brojevi su isti.");
        }
    }
}
