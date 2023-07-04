package domaci12;

public class Zadatak2 {
    public static void main(String[] args) {

        int array[] = {1, 3, 11, 13, 21, 33};
        int sum = 0;

        for(int i = 0; i< array.length;i++){
            sum = sum + array[i];
            }
        sum = sum * array[5];

        System.out.println("Product is: " + sum);
    }

}

