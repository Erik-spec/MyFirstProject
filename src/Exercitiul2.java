public class Exercitiul2 {
    public static void main(String[] args) {
        int[] numbers = new int[] {8 , 6 , 5, 9 , 1} ;
        int max = numbers[0] ;
        for (int i = 0 ; i <numbers.length ; i++) {
            if (numbers[i] > max) {
                max = numbers[i] ;
            }
        }
        System.out.println(max);
    }
}
