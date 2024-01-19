package src2;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {

        // Multiplication:

        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        long multiply = a * b;

        System.out.println(" Multiplication = " + multiply);


        // Division:

        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        double divide = num1 / num2;

        System.out.println("Division = " + divide);

    }
}
