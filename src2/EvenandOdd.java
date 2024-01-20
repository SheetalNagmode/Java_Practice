package src2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args) {

        // Even and Odd number using user input:

        System.out.println("Enter n : ");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int i = 2;
        int j = 1;

        System.out.println("Even Numbers: ");

        while (i<=n){
            System.out.println(i);
            i=i+2;
        }

        System.out.println(" Odd Numbers: ");

        while (j<=n){
            System.out.println(j);
            j=j+2;
        }







    }
}
