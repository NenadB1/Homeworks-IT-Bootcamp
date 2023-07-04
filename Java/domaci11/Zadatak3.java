package domaci11;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = s.nextInt();
        int sum = 0;

        do{
            sum = sum + number;
            System.out.println("Enter number: ");
            number = s.nextInt();
        } while(number > 0);

        System.out.println("The total sum of the numbers is: " + sum);

    }
}
