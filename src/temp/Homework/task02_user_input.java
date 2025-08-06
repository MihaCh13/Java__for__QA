package lec_01.Homework;

import java.util.Scanner;

public class task02_user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first side of the triangle in cm");
        float side1 = input.nextFloat();
        System.out.println("Enter the second side of the triangle in cm");
        float side2 = input.nextFloat();
        System.out.println("Enter the third side of the triangle in cm");
        float side3 = input.nextFloat();

        float perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of the triangle is: " + perimeter + " cm");

        input.close();
    }
}
