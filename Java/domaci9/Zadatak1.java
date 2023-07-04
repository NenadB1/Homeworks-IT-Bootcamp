package domaci9;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = s.nextLine();

        System.out.println("Enter lastname: ");
        String lastname = s.nextLine();

        System.out.println("Enter your age: ");
        int years = s.nextInt();

        System.out.println("Your full name is " + name + " " + lastname + " and you have " + years + " years.");
    }
}
