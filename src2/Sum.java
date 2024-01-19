package src2;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

        // Sum:

        Scanner sc = new Scanner (System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum = " + sum);

        // Subtraction :

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        int subtract = a - b;

        System.out.println(" Subtraction = " + subtract);


    }
}
