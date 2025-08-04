package lec_01.Homework;

import java.util.Scanner;

public class task06_minutes_convertor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of minutes as an integer: ");
        int minutes = input.nextInt();

        int minutesInYear = 60*24*365 + 6*60;
        // One full orbit of the Earth around the Sun takes 365 days and 6 hours.
        // That's why we have a leap year every 4 years.

        int minutesInDay = 60*24;

        int years = minutes/minutesInYear;
        int days = (minutes%minutesInYear)/minutesInDay;

        System.out.println("Given minutes: " + minutes);
        System.out.println("Equivalent to: " + years + " years and " + days + " days.");
        System.out.println("Note: One year is considered as 365 days and 6 hours, which causes leap years every 4 years.");

        input.close();

    }
}
