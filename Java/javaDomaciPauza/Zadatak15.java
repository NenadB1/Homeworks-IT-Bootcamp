package javaDomaciPauza;

import java.util.Arrays;

public class Zadatak15 {
    public static void main(String[] args) {
         int niz [] = new int[10];

         for(int i = 0; i < niz.length;i++){
             niz[i] = (int) (Math.random() * (60 - 3 + 1) + 10);
             if(i % 2 == 1){
                 System.out.println(niz[i]);
             }
         }
        System.out.println("Ovo je primaran niz:" + Arrays.toString(niz));


    }
}
