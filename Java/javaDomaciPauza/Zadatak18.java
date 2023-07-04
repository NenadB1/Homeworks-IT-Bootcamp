package javaDomaciPauza;

public class Zadatak18 {
    public static void main(String[] args) {
        double a = 4;
        double b = 3;

        System.out.println("Povrsina pravougaonika je: " + povrsina(a,b));

        double c = 1.2;
        double d = 5;

        System.out.println("Povrsina pravougaonika je: " + povrsina(c,d));

        double e = 10;
        double f = 11;

        System.out.println("Povrsina pravougaonika je: " + povrsina(e,f));

    }
    public static double povrsina(double a,double b){
        double p = a * b;
        return p;
    }
}
