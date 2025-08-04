package Lec_02.Homework;

import java.util.Scanner;

public class task_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your age (it must be an integer): ");
        int age = input.nextInt();

        if (age <= 0 || age > 100) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        if (age >= 16) {
            System.out.println("You are eligible to work");
        }
        else {
            System.out.println("You are not eligible to work");
        }
        input.close();
    }
}
