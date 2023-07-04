package domaci10;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter any year: ");
        int year = s.nextInt();

        if(year % 4 == 0){
            System.out.println("Entered year is leap!");
        } else {
            System.out.println("Entered year is not leap!");
        }
        s.close();
    }
}
