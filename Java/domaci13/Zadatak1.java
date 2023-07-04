package domaci13;

public class Zadatak1 {
    public static void main(String[] args) {
        boolean row = order(16,17);
        System.out.println(row);
        boolean row1 = order(16,18);
        System.out.println(row1);
        boolean row2 = order(26,27);
        System.out.println(row2);
        boolean row3 = order(4,1);
        System.out.println(row3);
        boolean row4 = order(11,12);
        System.out.println(row4);

    }

    public static boolean order(int a, int b){
        if(a + 1 == b){
            return true;
        }
        return false;
    }
}
