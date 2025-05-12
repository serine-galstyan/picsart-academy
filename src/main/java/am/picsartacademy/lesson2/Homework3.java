package am.picsartacademy.lesson2;

public class Homework3 {
    public static void main(String[] args) {
        /* Task 7
        Given an integer, 0 < N < 21 , print its first 10 multiples.
        Each multiple  N x i (where 0<i<11) should be printed on a new line in the form: N x i = result */
        byte inputN = 5;
        System.out.println("Output of the Task 7:");
        if ((inputN > 0) && (inputN < 21))
            for (byte i = 1; i <= 10; i++) {
//                short multiplyResult = inputN * i;
                int multiplyResult = inputN * i;
                System.out.println(inputN + " x " + i + " = " + multiplyResult);
            }
        else
            System.out.println("Input N is out of the given range.");
    }
}
