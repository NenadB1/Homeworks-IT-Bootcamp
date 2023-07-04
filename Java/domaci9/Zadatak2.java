package domaci9;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner (System.in);

        System.out.println("Enter temperature in degree Celsius: ");
        int tempC = s.nextInt();

        double tempF = tempC * 1.8 + 32;

        System.out.printf(tempC + "C = " + String.format("%.1f",tempF) + "F");
    }
}
