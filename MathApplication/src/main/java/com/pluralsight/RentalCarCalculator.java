package com.pluralsight;

import java.util.Scanner;


public class RentalCarCalculator {
    public static void main(String[] args) {
        Scanner RentalCalculator = new Scanner(System.in);
        System.out.println("pick up date");
        int pickupDate = RentalCalculator.nextInt();

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
        int age = RentalCalculator.nextInt();

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
        if (age < 25) {
            totalCost *= 1.3;
        }
        System.out.printf("Your total rental cost is: %.2f", totalCost);

    }

}

package com.pluralsight;

import java.util.Scanner;

public class CarRental {

    // Constant values (these do not change)
    public static final double basicRentalCost = 29.99;                // Basic rental cost per day
    public static final double electronicTollTagCost = 3.95;         // Cost for toll tag per day
    public static final double gpsCost = 2.95;                          // Cost for GPS per day
    public static final double roadsideAssistanceUsage = 3.95;         // Cost for roadside assistance per day
    public static final double under25surCharge = 1.3;                // 30% surcharge for drivers under 25

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Scanner to get user input

        //Ask and store each user input using methods
        String pickupDate = getPickupDate(scanner);                         // Get pickup date
        int rentalDays = getRentalDays(scanner);                           // Get rental days
        boolean hasToll = wantsTollTag(scanner);                          // Ask about toll tag
        boolean hasGPS = wantsGps(scanner);                              // Ask about GPS
        boolean hasRoadside = wantsRoadsideAssistance(scanner);         // Ask about roadside assistance
        int age = getUserAge(scanner);                                 // Ask user age

        // Calculate the total cost based on inputs

        double totalCost = calculateTotalCost(rentalDays, hasToll, hasGPS, hasRoadside, age);

        // Print a summary of the user's selections and total cost

        printSummary(pickupDate, rentalDays, hasToll, hasGPS, hasRoadside, age, totalCost);
    }

    // Get the rental pickup date from the user

    public static String getPickupDate(Scanner scanner) {
        System.out.println("Enter pickup date (e.g 2025-04-16)");
        String pickupDate = scanner.nextLine();  //Store as a string
        return pickupDate;
    }

    // Method to get number of rental days

    public static int getRentalDays(Scanner scanner) {
        System.out.println("How many days do you want the rental");
        int rentalDays = scanner.nextInt();

        return rentalDays;
    }
    // Method to ask if the user wants an electronic toll tag

    public static boolean wantsTollTag(Scanner scanner) {
        scanner.nextLine(); // Consume newline left over
        System.out.println("Do you want an electronic toll tag? (yes/no)");
        String wantsTollTag = scanner.nextLine().toLowerCase();
        if (wantsTollTag.startsWith("y")) {
            System.out.println("Electronic toll tag added.");
            return true;
        } else if (wantsTollTag.startsWith("n")) {
            System.out.println("No electronic toll tag selected.");
            return false;

        } else {
            System.out.println("Invalid Input.");
            return false;
        }
    }

    // Method to ask if the user wants GPS
    public static boolean wantsGps(Scanner scanner) {
        System.out.println("Do ypu want GPS? (yes/no)");
        String wantsGps = scanner.nextLine().toLowerCase();
        if (wantsGps.startsWith("y")) {
            System.out.println("GPS added.");
            return true;
        } else if (wantsGps.startsWith("n")) {
            System.out.println("No electronic toll tag selected.");
            return false;

        } else {
            System.out.println("Invalid input.");
            return false;
        }

    }
    // Ask if the user wants roadside assistance
    // Returns true if yes, false if no or invalid input.


    public static boolean wantsRoadsideAssistance(Scanner scanner) {
        System.out.println("Do you want roadside assistance? (yes/no)");
        String hasRoadside = scanner.nextLine().toLowerCase();
        if (hasRoadside.startsWith("y")) {
            System.out.println("Roadside assistance added.");
            return true;
        } else if (hasRoadside.startsWith("n")) {
            System.out.println("No roadside assistance selected.");
            return false;
        } else {
            System.out.println("Invalid input. Assuming no.");
            return false;
        }

    }

    // Ask for the user's age
    public static int getUserAge(Scanner scanner) {
        System.out.println("Enter your age:");
        return scanner.nextInt();
    }

    // Calculate total cost based on selections

    public static double calculateTotalCost(int rentalDays, boolean hasToll, boolean hasGPS, boolean hasRoadside, int age) {
        double total = basicRentalCost * rentalDays;
        if (hasToll) {total +=electronicTollTagCost * rentalDays
        }
    }

}
