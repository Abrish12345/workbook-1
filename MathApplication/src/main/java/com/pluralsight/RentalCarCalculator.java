package com.pluralsight;

import java.util.Scanner;


public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner RentalCalculator = new Scanner(System.in);
        System.out.println("pick up date");
        int PickupDate = RentalCalculator.nextInt();

        System.out.println("How many days do you want the rental");
        int rentalDays = RentalCalculator.nextInt();
        RentalCalculator.nextLine();

        System.out.println("Do you want electronic toll tag: yes,no , if yes it will be $3.95 per day. ");
        String TollTag = RentalCalculator.nextLine();

        System.out.println("Do you want a GPS?: Yes, No, if yes it will be $2.95 per day.");
        String gps = RentalCalculator.nextLine();

        System.out.println("Do you want road side assistance?:Yes, No, if Yes it will be $3.95 per day.");
        String roadside = RentalCalculator.nextLine();

        System.out.println("How old are you?");
        int Age = RentalCalculator.nextInt();

        double basicCarRental = 29.99;

        double totalCost = basicCarRental * rentalDays;

        if (TollTag.equalsIgnoreCase("YES")) {
            totalCost += 3.95 * rentalDays;
        }
        if (gps.equalsIgnoreCase("yes")) {
            totalCost += 2.95 * rentalDays;

        }
        if (roadside.equalsIgnoreCase("yes")) {
            totalCost += 3.95 * rentalDays;
        }
        if (Age < 25) {
            totalCost *= 1.3;
        }
        System.out.printf("Your total rental cost is: %.2f", totalCost);

    }

}
