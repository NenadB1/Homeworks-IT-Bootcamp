package javaDomaciPauza;

import java.util.Scanner;

public class Zadatak11 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj redova: ");
        int brojRedova = s.nextInt();

        String x = "x";
        String xx = "" ;

        for(int i = 0;i <= brojRedova;i++){
            xx= xx + x;
            System.out.println(xx);
        }
    }
}
