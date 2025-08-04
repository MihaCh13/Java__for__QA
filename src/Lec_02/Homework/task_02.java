package Lec_02.Homework;

import java.util.Scanner;

public class task_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number between 1 and 7 to select a day of the week: ");
        int dayNumber = input.nextInt();

        if (dayNumber <= 0 || dayNumber > 7) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        switch (dayNumber) {
            case 1:
                System.out.println("The " + dayNumber +"st day of the week is Monday\n");
                break;
            case 2:
                System.out.println("The " + dayNumber +"nd day of the week is Tuesday\n");
                break;
            case 3:
                System.out.println("The " + dayNumber +"rd day of the week is Wednesday\n");
                break;
            case 4:
                System.out.println("The " + dayNumber +"th day of the week is Thursday\n");
                break;
            case 5:
                System.out.println("The " + dayNumber +"th day of the week is Friday\n");
                break;
            case 6:
                System.out.println("The " + dayNumber +"th day of the week is Saturday\n");
                break;
            case 7:
                System.out.println("The " + dayNumber +"th day of the week is Sunday\n");
                break;
        }
        input.close();
    }
}
