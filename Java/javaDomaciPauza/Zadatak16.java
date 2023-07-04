package javaDomaciPauza;

import java.util.Arrays;

public class Zadatak16 {
    public static void main(String[] args) {

        int niz [] = new int[11];

        for(int i = 0;i< niz.length;i++){
            niz[i] = (int)(Math.random() * (150 - 10 + 1) + 10);
        }
        System.out.println(Arrays.toString(niz));

//        StringBuilder niz1 = new StringBuilder();
//        niz1.append("majica").reverse();
//        System.out.println(niz1);
        for(int i = niz.length -1; i>=0;i--){
            System.out.print(niz[i] + " ");
        }

    }
}
