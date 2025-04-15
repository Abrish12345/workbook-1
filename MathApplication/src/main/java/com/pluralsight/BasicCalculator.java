package com.pluralsight;
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        float num1 = myScanner.nextFloat();
        System.out.print("Enter the second Number:");
        float num2 = myScanner.nextFloat();
        System.out.println("Chose an operation:(A)dd,(S)ubstract,(M)ultiply,(D)ivide");
        String operation = myScanner.next().toLowerCase();
        float result=0;
        if (operation.equals("a")){
            result = num1 + num2;
        }
        else if (operation.equals("s")) { 
            result= num1 - num2;
            
        } 
        else if (operation.equals("m")) {
            result= num1 * num2;
            
        }
        else if (operation.equals("d")) {
            result= num1/num2;
            
        }
        else {
            System.out.println("Error invalid inputs");
        }
        System.out.println("The result is " + result);


    }
}
