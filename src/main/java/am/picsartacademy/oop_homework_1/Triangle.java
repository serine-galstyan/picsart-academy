package am.picsartacademy.oop_homework_1;

import static java.lang.Math.sqrt;

public class Triangle extends Shapes{
    public double thirdSide;

    public double area(double firstSide, double secondSide, double thirdSide) {
        double semiPerimeter = (firstSide + secondSide + thirdSide) / 2;
        double area = sqrt(semiPerimeter * (semiPerimeter - firstSide) * (semiPerimeter - secondSide) * (semiPerimeter - thirdSide));
        System.out.print("Area of the triangle with given sides is ");
        return area;
    }
}
