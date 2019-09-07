import java.util.Scanner;
import java.util.Random ;

public class Exercitiul3 {

    public static void main(String[] args) {

        Scanner myInput = new Scanner( System.in );
        Random ran = new Random();
        int x = ran.nextInt(10);
        for (int i = 1 ; i <= 3 ; i++) {
            System.out.print( "Enter integer: " );
            int a = myInput.nextInt();
            if (a == x) {
                System.out.println("Ai castigat!");
                break;
            }else if (a > x) {
                System.out.println("Numarul e prea mare!");
            }else {
                System.out.println("Numarul e prea mic!");
            }
        }
    }
}
