package com.pluralsight;

public class MathApp {
    //this is the main method and where my code will run
    //all code I am typing for this exercise will be on this method
    public static void main(String[] args) {
        int carprice =32000;
        int truckPrice=45000;

        int minPrice= Math.min(carprice,truckPrice);
        System.out.println("The lowest price is" + minPrice);
        /* Question number 3

         */

        double radius = 7.25;
        double area= Math.PI * Math.pow(radius,2);
        System.out.println("The area of the circle is " + area);
        /* Question number 4

         */
        double number=5.0;
        double squareRoot= Math.sqrt(number);
        System.out.println("The square root of a given number is" + squareRoot);

        /* Question number five

         */
        int distanceOne=5;
        int distanceTwo=10;
        int distanceThree=85;
        int distanceFour=50;
        double distance = Math.sqrt(Math.pow(distanceThree-distanceOne,2) + Math.pow(distanceFour-distanceTwo,2));
        System.out.println(distance);
        /* Question number six

         */
        double Value = -3.8;
        double absoluteValue = Math.abs(Value);
        System.out.println(absoluteValue);
        /* Question number seven

         */
        double randomNumber= Math.random();
        System.out.println(randomNumber);



    }
}
