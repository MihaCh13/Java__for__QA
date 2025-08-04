package Lec_02.Homework;

import java.util.Scanner;

public class task_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your destination: ");
        String destination = input.nextLine();

        System.out.println("Please enter your budget: ");
        double budget = input.nextDouble();

        if (budget <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        if (destination.equalsIgnoreCase("Beach")) {
            if (budget < 50) {
                System.out.println("The size of your budget is suitable for a destination in Bulgaria");
            }
            else {
                System.out.println("The size of your budget is suitable for a destination outside Bulgaria");
            }
        }
        else if (destination.equalsIgnoreCase("Mountain")) {
            if (budget < 50) {
                System.out.println("The size of your budget is suitable for a destination in Bulgaria");
            }
            else {
                System.out.println("The size of your budget is suitable for a destination outside Bulgaria");
            }
        }
        else
        {
            System.out.println("Invalid destination");
            System.out.println("There is no information about this type of vacation");
            return;
        }

        input.close();
    }
}
