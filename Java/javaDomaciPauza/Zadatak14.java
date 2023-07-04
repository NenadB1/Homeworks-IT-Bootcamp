package javaDomaciPauza;

import java.util.Scanner;

public class Zadatak14 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Unesite neki broj: ");
        int broj = s.nextInt();

        for(int i = 1; i <= 17;i++){
            if(i % broj != 0){
                System.out.println(i);
            }
        }
    }
}
