package am.picsartacademy.oop_homework_1;
import static java.lang.Math.pow;

public class RightTriangle extends Triangle {
    @Override
    public double area(double firstSide, double secondSide, double thirdSide) {
        //keeping triangle sides in an area to find out which side is the altitude, and which ones are the small sides
        double[] array = {firstSide, secondSide, thirdSide};
        double[] smallSides = new double[2]; //creating an array to add there small sides

        //getting and keeping the altitude in 'longest' variable and small sides in 'smallSides[]' array
        double longest = array[0];
        int i=0;
        for (int side = 1; side < array.length; side++) {
            if (longest < array[side]) {
                smallSides[i] = longest;
                i++;
                longest = array[side];
            } else {
                smallSides[i] = array[side];
                i++;
            }
        }

        //checking if the triangle is right-angled calculating the area with updated formula
        //else printing that the triangle was not right-angled
        if ((pow(longest, 2) == (pow(smallSides[0], 2) + pow(smallSides[1], 2)))) {
            System.out.print("Area of the right-angled triangle with given sides is ");
            area = 0.5 * (smallSides[0] * smallSides[1]);
            return area;
        }
         else {
            System.out.println("Triangle isn't right-angled");
            return 0.0;
        }
    }
}