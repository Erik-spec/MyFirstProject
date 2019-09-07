public class Exercitiul1 {
    public static void main(String[] args) {
        int numar1 = 5 , numar2 = 105 , num = 0 ;
        if (numar1 < numar2) {
            for (int i = numar1; i <= numar2; i++) {
                int number = 0 ;
                for (int j = 2 ; j < i ; j++) {
                    if (i % j != 0) {
                        number = number + 1 ;
                    }
                }
                if (number == i - 2) {
                    System.out.println(i);
                    num = num + 1 ;
                }
            }
            System.out.println(num);
        } else if (numar2 < numar1) {
            for (int i = numar2; i <= numar1; i++) {
            int number = 0 ;
            for (int j = 2 ; j < i ; j++) {
                if (i % j != 0) {
                    number = number + 1 ;
                }
            }
            if (number == i - 2) {
                System.out.println(i);
                num = num + 1 ;
            }
        }
            System.out.println(num);
        } else {
            System.out.println("Numerele sunt egale!");
        }
    }
}
