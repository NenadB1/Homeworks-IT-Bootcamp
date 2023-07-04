package javaDomaciPauza;

import java.util.Scanner;

public class Zadatak13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite broj: ");
        int n = s.nextInt();
        int i = 1;
        int a = 1;

        while(n >= i){
            a = (int)Math.pow(i,2);
            System.out.println(a);
            i++;
        }

    }
}
