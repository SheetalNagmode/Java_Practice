package src2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenandOdd {
    public static void main(String[] args) {

        // Even and Odd number using while loop:

        System.out.print("Enter n : ");
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

        // Even and Odd numbers using for loop:

        System.out.print("Enter m : ");
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();

        System.out.println(" Even Numbers : ");

        for(int k = 2; k <= m; k = k+2 ){
            System.out.println(k);
        }

        System.out.println(" Odd Numbers : ");

        for(int l = 1; l <= m; l=l+2 ){
            System.out.println(l);
        }



        // Check whether a number is even or odd using if ...else statement:


        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
        }


    }

