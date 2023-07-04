package javaDomaciPauza;

import java.util.Scanner;

public class Zadatak12 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        int broj = 0;
        String brojevi = "";

        while (broj != 25){
            System.out.println("Unesite broj od 1 do 25: ");
            broj = s.nextInt();

            if (broj % 2 == 0) {
                brojevi += broj + " ";
            }
        };
        System.out.println("Parni brojevi su: " + brojevi);

    }
}
