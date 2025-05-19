package am.picsartacademy.oop_homework_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Is created Shapes superClass. Rectangle and Triangle are subClasses of the Shapes.
        //RightTriangle is a subClass of the Triangle.

        Scanner scanner = new Scanner(System.in);

        //creating rectangle instance
        Rectangle rectangle = new Rectangle();
        System.out.println("To calculate an area of a rectangle ");
        System.out.println("Enter first side: ");
        rectangle.firstSide = scanner.nextDouble();
        System.out.println("Enter second side: ");
        rectangle.secondSide = scanner.nextDouble();

        //calculating and printing rectangle area by rectangleArea() method of Rectangle class
        rectangle.rectangleArea(rectangle.firstSide, rectangle.secondSide);


        //creating triangle instance
        Triangle randomTriangle = new Triangle();
        System.out.println("\nTo calculate an area of a random triangle ");
        System.out.println("Enter triangle first side: ");
        randomTriangle.firstSide = scanner.nextDouble();

        System.out.println("Enter triangle second side: ");
        randomTriangle.secondSide = scanner.nextDouble();

        System.out.println("Enter triangle third side: ");
        randomTriangle.thirdSide = scanner.nextDouble();

        //calculating triangle area by new area() method for the Triangle
        System.out.println(randomTriangle.area(randomTriangle.firstSide, randomTriangle.secondSide, randomTriangle.thirdSide) + ".");

        //creating right-angled triangle instance
        System.out.println("\nTo calculate an area of right-angled triangle ");
        RightTriangle rightAngledT = new RightTriangle();
        System.out.println("Enter triangle first side: ");
        rightAngledT.firstSide = scanner.nextDouble();

        System.out.println("Enter triangle second side: ");
        rightAngledT.secondSide = scanner.nextDouble();

        System.out.println("Enter triangle third side: ");
        rightAngledT.thirdSide = scanner.nextDouble();

//        System.out.print(rightAngledT.firstSide);
//        System.out.print(rightAngledT.secondSide);
//        System.out.print(rightAngledT.thirdSide);


        //calculating right-angled triangle area by overrided area() method of triangle
        System.out.println(rightAngledT.area(rightAngledT.firstSide, rightAngledT.secondSide, rightAngledT.thirdSide) + ".");
    }
}
