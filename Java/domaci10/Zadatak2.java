package domaci10;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        String username = "NenadB";
        String password = "123456789";

       Scanner s = new Scanner(System.in);

        System.out.println("Enter username:");
        String username1 = s.nextLine();

        System.out.println("Enter password:");
        String password1 = s.nextLine();

        if(username.equals(username1) && password.equals(password1)){
            System.out.println("You have logged in successfully!");
        } else {
            System.out.println("Invalid username or password");
        }
        s.close();
    }
}
