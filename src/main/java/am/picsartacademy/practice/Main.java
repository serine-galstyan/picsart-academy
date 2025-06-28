package am.picsartacademy.practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1.	Define a Simple Enum
        //                 Create an enum DayOfWeek with constants for each day (MONDAY to SUNDAY).
        //	•	Task: Print a message based on the current day.
        //	2.	Enum with Switch Case
        //                 Use the DayOfWeek enum in a switch statement to print whether the day is a weekday or weekend.
        //	3.	Enum with Methods
        //                Create an enum Season with a method getAverageTemp().
        //	•	Task: Print the average temperature for each season.

        //1.
        System.out.println("1.");
        enum DayOfWeek {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println("Here is " + day);
        }

        System.out.println();
        System.out.println("Today is " + DayOfWeek.SATURDAY + "!");

        //2
        System.out.println();
        System.out.println("2.");

        for (DayOfWeek day : DayOfWeek.values()) {
            switch (day) {
                case MONDAY:
                    System.out.println("It's a weekday!");
                    break;
                case TUESDAY:
                    System.out.println("It's a weekday!");
                    break;
                case WEDNESDAY:
                    System.out.println("It's a weekday!");
                    break;
                case THURSDAY:
                    System.out.println("It's a weekday!");
                    break;
                case FRIDAY:
                    System.out.println("It's a weekday!");
                    break;
                case SATURDAY:
                    System.out.println("It's a weekend!");
                    break;
                case SUNDAY:
                    System.out.println("It's a weekend!");
                    break;
//                default:
//                    System.out.println("It's not a day of week");
            }
        }


        //3
        System.out.println();
        System.out.println("3.");

        enum Season {
            WINTER(4.0),
            SPRING(15.0),
            SUMMER(27.0),
            AUTUMN(17);


            private double temp;

            Season(double temp) {
                this.temp = temp;
            }

            public double getAverageTemp() {
                return temp;
            }
        }


        for (Season season : Season.values()) {
            System.out.println("The average temp for " + season + " is " + season.getAverageTemp() + "C.");
        }


    }

}
