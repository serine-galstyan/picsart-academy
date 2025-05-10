package am.picsartacademy.lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//      System.out.println(myArray[4]);
        //version 1 array create
        int[] bigArray1;
        bigArray1 = new int[10];
        bigArray1[0] = 10;
        bigArray1[1] = 20;
        bigArray1[2] = 30;
        bigArray1[3] = 40;
        bigArray1[4] = 50;
        bigArray1[5] = 60;
        bigArray1[6] = 70;
        bigArray1[7] = 80;
        bigArray1[8] = 90;
        bigArray1[9] = 100;

        //version 2 of array create
        int[] bigArray = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int i1;
        for (i1 = 0; i1 < 10; i1++) {
//            System.out.println(bigArray[i1]);
        }


        //version 3 of array create
        int[] array3 = new int[100];
        for (int i = 0; i < array3.length; i++) {
//            System.out.println("setting value for index " + i +" where value is " + (i+1));
            array3[i] = i + 1;
        }


        //5 1-10
        int[] array10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evens;
        String string1 = "these are evens: ";
        String string2 = "these are odds: ";

        for (int i = 0; i < array10.length; i++) {
            if (array10[i] % 2 == 0) {
//                System.out.println(array10[i]);
                string1 = string1 + array10[i] + " ";
            } else {
                string2 = string2 + array10[i] + " ";

//                System.out.println(array10[i] + "not even");
            }
        }
        System.out.println(string1);
        System.out.println(string2);


    }


}
