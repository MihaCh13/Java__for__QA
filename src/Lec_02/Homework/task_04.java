package Lec_02.Homework;

import java.util.Scanner;

public class task_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the unit price of the product: ");
        float price = input.nextFloat();

        System.out.print("Please enter the quantity of products: ");
        int quantity = input.nextInt();

        double revenue = price * quantity;
        double discount = 0;
        double discountPercent = 0;

        if (quantity <= 0 || price <= 0) {
            System.out.println("Invalid input");
            System.exit(1);
        }

        if (quantity >= 100 && quantity < 120) {
            discount = revenue * 0.15;
            discountPercent = 15.0;
            revenue = revenue - discount;
        } else if (quantity >= 120) {
            discount = revenue * 0.2;
            discountPercent = 20.0;
            revenue = revenue - discount;
        }

        System.out.println("Enter unit price: " + price);
        System.out.println("Enter quantity: " + quantity);
        System.out.println("The revenue from sale: " + revenue + "$");
        System.out.println("Discount: " + discount + "$ (" + discountPercent + "%)");

        input.close();
    }
}
