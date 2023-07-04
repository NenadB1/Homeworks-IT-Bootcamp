package javaDomaciPauza;

public class Zadatak20 {
    public static void main(String[] args) {
        double a = 4;
        double b = 5;
        double c = 2 * mnozenje(a,b);

        System.out.println("Proizvod dva broja koji je dupliran je: " + c);
    }
    public static double mnozenje(double a,double b){

        return a * b;
    }
}
