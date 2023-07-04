package domaci10;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter your birth date: ");
        int day = s.nextInt();

        System.out.println("Enter the ordinal number of the month of birth: ");
        int month = s.nextInt();

        if((day >= 21 && day <= 31 && month ==3) || (day >= 1 && day <=20 && month == 4)){
            System.out.println("Your zodiac sign is Aries!");
        } else if((day >= 21 && day <= 30 && month == 4) || (day >= 1 && day <=21 && month == 5)){
            System.out.println("Your zodiac sign is Taurus! ");
        }else if((day >= 21 && day <= 31 && month == 5) || (day >= 1 && day <=21 && month == 6)){
            System.out.println("Your zodiac sign is Gemini! ");
        }else if((day >= 22 && day <= 30 && month == 6) || (day >= 1 && day <=22 && month == 7)){
            System.out.println("Your zodiac sign is Cancer! ");
        }else if((day >= 23 && day <= 31 && month == 7) || (day >= 1 && day <=23 && month == 8)){
            System.out.println("Your zodiac sign is Leo ");
        }else if((day >= 24 && day <= 31 && month == 8) || (day >= 1 && day <=23 && month == 9)){
            System.out.println("Your zodiac sign is Virgo! ");
        }else if((day >= 24 && day <= 30 && month == 9) || (day >= 1 && day <=23 && month == 10)){
            System.out.println("Your zodiac sign is Libra! ");
        }else if((day >= 24 && day <= 31 && month == 10) || (day >= 1 && day <=22 && month == 11)){
            System.out.println("Your zodiac sign is Scorpius! ");
        }else if((day >= 23 && day <= 30 && month == 11) || (day >= 1 && day <=21 && month == 12)){
            System.out.println("Your zodiac sign is Sagittarius! ");
        }else if((day >= 22 && day <= 31 && month == 12) || (day >= 1 && day <=20 && month == 1)){
            System.out.println("Your zodiac sign is Capricornus! ");
        }else if((day >= 21 && day <= 31 && month == 1)|| (day >= 1 && day <=19 && month == 2)){
            System.out.println("Your zodiac sign is Aquarius! ");
        }else if((day >= 20 && day <= 30 && month == 2) || (day >= 1 && day <=20 && month == 3)){
            System.out.println("Your zodiac sign is Pisces! ");
        } else {
            System.out.println("You entered invalid data, try again!");
        }

        s.close();
    }
}

