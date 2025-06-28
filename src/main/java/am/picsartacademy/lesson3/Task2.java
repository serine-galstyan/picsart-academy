package am.picsartacademy.lesson3;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the size");
        int size  = Integer.parseInt(scanner.next());

        String[] array = new String[size+size-1];
        int arrayCentre = (array.length)/2;
        for (int i = 0; i <= size-1; i++) {
            for (int j = 0; j <= i ; j++) {
                array[arrayCentre] = "*";
                for(int k = 0; k<=j; k++){
                    array[arrayCentre+1] = "*";
                    array[arrayCentre-1] = "*";
                }
            }
            for (String num : array){
                System.out.print(num);
            }
            System.out.println();
        }
        System.out.println();
    }
}
