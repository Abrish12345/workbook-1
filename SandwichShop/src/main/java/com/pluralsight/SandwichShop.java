package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner((System.in));
        System.out.println("Welcome to sandwich shop!");
        System.out.println("Enter sandwich size (1 for regular,2 for large):");
        int size = myScanner.nextInt();


        double price = 0;
        if (size == 1) {
            price = 5.45;
            System.out.println("you choose regular base price: $" + price);
        } else if (size == 2) {
            price = 8.95;
        } else {
            System.out.println("Invalid sandwich size selected.");

        }
        System.out.println("How old are you?");
        int age = myScanner.nextInt();
        double discount=0;
        if (age <=17){
            discount=0.10;
        } else if (age >=65) {discount = 0.20;

        }
        double finalprice = price -(price * discount);
        System.out.printf("your total is %.2f", finalprice);
    }
}

