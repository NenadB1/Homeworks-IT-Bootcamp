package domaci16;

import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(-2);
        arrayList.add(4);
        arrayList.add(15);
        arrayList.add(26);
        arrayList.add(32);
        arrayList.add(11);
        arrayList.add(1);
        arrayList.add(4);
        arrayList.add(26);

        System.out.println("Smallest number is: " + min(arrayList));
        System.out.println("Biggest number is: " + max(arrayList));
        System.out.println("Sum of numbers is: " + sum(arrayList));
        System.out.println("Average of numbers: " +avg(arrayList));
        System.out.println("Array without duplicates: " + distinct(arrayList));

    }

    public static int min(ArrayList<Integer> arraylist) {
        int min = arraylist.get(0);
        for (int i = 0; i < arraylist.size(); i++) {
            if (min > arraylist.get(i)) {
                min = arraylist.get(i);
            }
        }
        return min;
    }

    public static int max(ArrayList<Integer> arraylist) {
        int max = arraylist.get(0);
        for (int i = 0; i < arraylist.size(); i++) {
            if (max < arraylist.get(i)) {
                max = arraylist.get(i);
            }
        }
        return max;
    }

    public static int sum(ArrayList<Integer> arrayList){
        int sum = 0;
        for(int i = 0; i< arrayList.size();i++){
            sum += arrayList.get(i);
        }
        return sum;
    }

    public static double avg(ArrayList<Integer> arrayList){
        double sum = 0;
        for(int i = 0; i< arrayList.size();i++){
            sum += arrayList.get(i);
        }

        return sum/ arrayList.size();
    }

    public static ArrayList<Integer> distinct(ArrayList<Integer> arrayList){
        ArrayList<Integer> uniqueNumber = new ArrayList<>();

        for(int i = 0; i< arrayList.size();i++){
            if(!uniqueNumber.contains(arrayList.get(i))){
                uniqueNumber.add(arrayList.get(i));
            }
        }
        return uniqueNumber;
    }
}
