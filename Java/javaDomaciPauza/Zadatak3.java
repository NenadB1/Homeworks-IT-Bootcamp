package javaDomaciPauza;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite ocenu: ");
        int ocena = s.nextInt();

        switch(ocena){
            case 1:
                System.out.println("Vasa ocena je nedovoljan!");
                break;
            case 2:
                System.out.println("Vasa ocena je dovoljan!");
                break;
            case 3:
                System.out.println("Vasa ocena je dobar!");
                break;
            case 4:
                System.out.println("Vasa ocena je vrlo dobar!");
                break;
            case 5:
                System.out.println("Vasa ocena je odlican!");
                break;
            default:
                System.out.println("Uneli ste nevalidnu ocenu!");
         }
    }
}
