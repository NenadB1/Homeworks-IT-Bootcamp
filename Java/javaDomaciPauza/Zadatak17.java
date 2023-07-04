package javaDomaciPauza;

public class Zadatak17 {
    public static void main(String[] args) {

        int niz [] = {1,2,3,412,5,7,8,9,0,-1,51,1};

        int max = 0;

        for(int i = 0; i< niz.length;i++){
            if(niz[i] > max){
                max = niz[i];
            }
        }
        System.out.println("Najveci broj je: " + max);
    }
}
