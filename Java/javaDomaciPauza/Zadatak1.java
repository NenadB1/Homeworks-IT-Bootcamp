package javaDomaciPauza;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int broj = s.nextInt();

        int aps = Math.abs(broj);
        System.out.println("Apsolutna vrednost broja " + broj+ " je " + aps);
    }
}
