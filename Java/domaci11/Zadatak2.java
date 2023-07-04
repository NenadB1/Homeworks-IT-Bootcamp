package domaci11;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = s.nextInt();
        int sum = 0;

        while(number !=0){
           sum = sum + number;
            System.out.println("Enter number: ");
            number = s.nextInt();
        }

        System.out.println("The total sum of the numbers is: " + sum);
    }
}
