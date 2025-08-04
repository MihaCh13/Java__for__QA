package Lec_02.Homework;

import java.util.Scanner;

public class task_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first angle in degrees: ");
        float angle_01 = input.nextFloat();

        System.out.print("Enter the second angle in degrees: ");
        float angle_02 = input.nextFloat();

        System.out.print("Enter the third angle in degrees: ");
        float angle_03 = input.nextFloat();

        if (angle_01 <= 0 || angle_01 >= 180 ||
                angle_02 <= 0 || angle_02 >= 180 ||
                angle_03 <= 0 || angle_03 >= 180) {
            // Invalid angle(s)
            System.out.println("Invalid input");
            System.exit(1);
        }


        if ((angle_02 + angle_01 + angle_03) != 180) {
            System.out.println("The triangle can't be built based on the angle values");
        }
        else {
            System.out.println("The triangle can be built based on the angle values");

            if (angle_01 > 90 || angle_02 > 90 || angle_03 > 90) {
                System.out.println("The triangle is obtuse");

                if (angle_01 != angle_02 && angle_02 != angle_03 && angle_03 != angle_01) {
                    System.out.println("The triangle is multifaceted");
                }
                else {
                    System.out.println("The triangle is isosceles");
                }
                // An obtuse triangle cannot be equilateral, because an equilateral triangle has all angles equal to 60°,
                // while an obtuse triangle must have one angle greater than 90°.

            }
            else if (angle_01 == 90 || angle_02 == 90 || angle_03 == 90) {
                System.out.println("The triangle is right-angled");

                if (angle_01 != angle_02 && angle_02 != angle_03 && angle_03 != angle_01) {
                    System.out.println("The triangle is multifaceted");
                }
                else {
                    System.out.println("The triangle is isosceles");
                }
                // A right-angled triangle cannot be equilateral, because an equilateral triangle has all angles equal to 60°,
                // while a right-angled triangle must have one angle exactly 90°.

            }
            else {
                System.out.println("The triangle is acute");
                if (angle_01 != angle_02 && angle_02 != angle_03 && angle_03 != angle_01) {
                    System.out.println("The triangle is multifaceted");
                }
                else if ( ((angle_01 + angle_02 + angle_03) / 3) == 60) {
                    //else if (angel_01 == angel_02 && angel_02 == angel_03) {
                    // If angle_01 == angle_02 and angle_02 == angle_03, then angle_01 == angle_03.

                    // else if (angel_01 == 60 && angel_02 == 60 && angel_03 == 60) {
                    System.out.println("The triangle is equilateral");
                }
                else {
                    System.out.println("The triangle is isosceles");
                }
            }
        }
        input.close();
    }
}
