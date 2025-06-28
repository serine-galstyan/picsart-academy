package am.picsartacademy.lesson2;

public class BubbleSORT {
    public static void main(String[] args) {
        int[] array = {8, 1, 6, 4, 9, 2};
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("Running for i=" + i);
            for (int j = 0; j < array.length - 1 - i; j++) {
                System.out.println("Running for j=" + j);

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    for (int num : array) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                } else {
                    System.out.println("Nothing was swapped");
                }

            }
        }


//        int temp = array[0];
//        array[0] = array[1];
//        array[1] = temp;
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        temp = array[5];
//        array[5] = array[4];
//        array[4] = temp;
//
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
    }
}