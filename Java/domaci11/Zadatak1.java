package domaci11;

//1.	Napisati for petlju koja ide od 0 do 1000 i prikazuje sve brojeve deljive sa 3

public class Zadatak1 {
    public static void main(String[] args) {

   int sum = 0;

    for(int i = 0;i<=1000;i++){
        if(i%3==0){
          sum = sum +1;
        }
    }

        System.out.println(sum + " are numbers that are divisible by 3, from 0 to 1000 .");


    }
}
