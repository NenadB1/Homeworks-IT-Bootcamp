package domaci14;

import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int array[] = new int[5];
        for(int i = 0;i < array.length;i++) {
            System.out.print("Enter " + i + ". number of array : ");
            int number =s.nextInt();
            array[i]= number;
        }
        arraySwitch(array);
        System.out.println(Arrays.toString(array));

    }
    public static String arraySwitch(int [] array){
        Arrays.sort(array);
        int lastElement = array[array.length -1];
        Arrays.fill(array,lastElement);
        return Arrays.toString(array);
    }
}
