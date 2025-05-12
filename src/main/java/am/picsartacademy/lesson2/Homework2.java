package am.picsartacademy.lesson2;

public class Homework2 {
    public static void main(String[] args) {
        /* Task 4
        Create an array and fill it. Print all elements which can be divided by 5 */
        byte[] arrayOfTask4 = {110, 107, 95, 83, 70, 55, 41, 0, -5, -11, -35};
        System.out.println("Output of the Task 4:");
        for(byte i = 0; i < arrayOfTask4.length; i++) {
            if ((arrayOfTask4[i] % 5) == 0)
                System.out.println(arrayOfTask4[i]);
        }

        /* Task 5
        Create an array and fill it. Print all elements which are between 24.12 and 467.23 */
        float[] arrayOfTask5 = {111.1f, 200.09f, 45.2f, 24.1f, 24.12f, -25.4f, -460.2f, 467.23f, 467.233f, 467.3f, 500.2f};
        System.out.println("Output of the Task 5:");
        for(byte i = 0; i < arrayOfTask5.length; i++){
            if((arrayOfTask5[i] >= 24.12) && (arrayOfTask5[i] <= 467.23))
                System.out.println(arrayOfTask5[i]);
        }

        /* Task 6
        Create an array and fill it. Print count of elements which can be divided by 2 */
        short[] arrayOfTask6 = {23, 54, 67, 1123, 942, -98, 9800, 19000, 789, 876, -222, 912, 945, 1232, 999, 44, 478};
        byte countOfNumbers = 0;
        for(byte i = 0; i < arrayOfTask6.length; i++){
            if(arrayOfTask6[i] % 2 == 0)
                countOfNumbers++;}
        System.out.println("Output of the Task 6:");
        System.out.println(countOfNumbers);
    }
}