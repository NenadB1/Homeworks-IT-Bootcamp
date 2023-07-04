package domaci14;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter currency you want to exchange money: ");
        String currency = s.nextLine();
        System.out.println("Enter amount of dinars you want to exchange: ");
        double din = s.nextDouble();


converter(din,currency);


    }
    public static void converter(double din, String currency){
double usd = 0;
double gbp = 0;
double eur = 0;


       switch(currency.toUpperCase()){
           case "USD":
            usd = 106.19 * din;
               System.out.println("Amount in USD is: " + usd);
    break;
           case "EUR" :
               eur = 117.29 * din;
               System.out.println("Amount in EUR is: " + eur);
break;
           case "GBP" :
               gbp = 133.86 * din;
               System.out.println("Amount in GBP is: " + gbp);
break;
           default:
               System.out.println("You entered invalid currency.");
       }

    }




    }



