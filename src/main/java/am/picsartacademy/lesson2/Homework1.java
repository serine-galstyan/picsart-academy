package am.picsartacademy.lesson2;

public class Homework1 {
    public static void main(String[] args) {
        /* Task 1
        Create an array and fill it with 2 numbers */
        byte[] arrayOfTask1 = {12, 17};

        /* Task 2
        Create an array and fill it with numbers from 1:1000 */
        int[] arrayOfTask2 = new int[1000];
        for (int i = 0; i < arrayOfTask2.length; i++) {
            arrayOfTask2[i] = i + 1;
//            System.out.println(arrayOfTask2[i]);
        }

        /* Task 3
        Create an array and fill it with odd numbers from -20:20 */
        byte[] arrayOfTask3 = new byte[20];
        byte arrayIndex = 0;
        for (byte i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                arrayOfTask3[arrayIndex] = i;
//                System.out.println(arrayOfTask3[arrayIndex]);
                arrayIndex++;
            }
        }
















}
}
