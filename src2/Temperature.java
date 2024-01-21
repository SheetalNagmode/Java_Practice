package src2;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {

        // Program to convert temperature from Celsius to Fahrenheit: User input
        // Formula: °F = (°C * 9/5) + 32

        Scanner in = new Scanner (System.in);
        System.out.print("Please enter temperature in Celsius: ");
        float tempC = in.nextFloat();

        float tempF = (tempC * 9/5) + 32;

        System.out.println("Temperature in Fahrenheit is  " + tempF);


        // Program to convert temperature from Fahrenheit to Celsius: User input
        // Formula: °C = (°F - 32) * 5.0/9

        Scanner input = new Scanner (System.in);
        System.out.print("Please enter temperature in Fahrenheit: ");
        double f = input.nextDouble();

        double c = (f - 32) * 5.0/9;
        // when numerator is smaller than denominator and both are integer.
        // we need to use the double data type otherwise the value will be zero in java
        // when a double data type gets divided, multiplied, added or subtracted by any smaller type
        // the final data type is always the larger type.
        // e.g: use 5.0/9 instead of 5/9

        System.out.println("The Temperature in Celsius is  " + c);

    }
}
