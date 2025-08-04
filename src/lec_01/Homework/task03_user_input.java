package lec_01.Homework;

import java.util.Scanner;

public class task03_user_input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side of the triangle in cm");
        float side = input.nextFloat();

        System.out.println("Enter the hight of the triangle in cm");
        float hight = input.nextFloat();

        float area = (side * hight)/2;
        System.out.println("Area of the triangle is: " + area + "cm");

        input.close();
    }
}
