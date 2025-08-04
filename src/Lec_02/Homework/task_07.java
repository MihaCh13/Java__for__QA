package Lec_02.Homework;

import java.util.Scanner;

public class task_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter temperature: ");
        float temperature = input.nextFloat();

        System.out.print("If you want to convert from Celsius to Fahrenheit, please choose 1");
        System.out.println("If you want to convert from Fahrenheit to Celsius, please choose 2");
        int choice = input.nextInt();

        if (choice == 1) {
            double temp = (temperature * 9.0 / 5.0) + 32;
            System.out.println("Temperature: " + temp + "°F");

        }
        else if (choice == 2) {
            double temp = (temperature - 32) * 5.0 / 9.0;
            System.out.println("Temperature: " + temp + "°C");
        }
        else {
            System.out.println("Invalid choice");
            return;
        }

        input.close();
    }
}
