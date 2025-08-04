package Lec_02.Homework;

import java.util.Scanner;

public class task_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a year: ");
        int year = input.nextInt();

        if (year <= 0 ){
            System.out.println("Invalid input. Please enter a positive year.");
            return;
        }

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not a leap year");
        }

        input.close();
    }
}
