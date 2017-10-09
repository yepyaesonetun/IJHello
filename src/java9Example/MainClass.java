package java9Example;

public class MainClass implements Calculator {

    public static void main(String[] args) {
        Calculator demo = new MainClass();
        int sumOdEvens = demo.addEvenNummbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOdEvens);

        int sumOfOdds = demo.addOddNumbers(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println(sumOfOdds);
    }
}
