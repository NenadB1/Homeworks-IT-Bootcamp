package javaDomaciPauza;

import java.util.Scanner;

public class Zadatak19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        int a = s.nextInt();
        System.out.println("Unesite drugi broj: ");
        int b = s.nextInt();

        pronalazenjeMin(a,b);
    }

    public static void pronalazenjeMin(int a, int b){

       int c = 0;
        if(a<b){
            c = a;
        } else if(b<a){
            c = b;
        } else{
            System.out.println("Brojevi su isti.");
        }
        System.out.println(c + " je manji broj.");
    }
}
