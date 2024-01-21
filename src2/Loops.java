package src2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
           Syntax of for loops:

           for (initialisation; condition; increment/decrement){
                // body
           }
         */

        // Print numbers from 1 to 5:

        for(int num = 1; num <= 5; num++){
            System.out.println(num);
        }

        // Print numbers from 1 to n = User input

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter n : ");
        int n = in.nextInt();

        for (int num = 1; num <= n ; num++) {
        //     System.out.println(num + " ");
            System.out.println("Hello World!");
        }


        // while loops:
        /*
            Syntax:
            while (condition){
               // body;
               increment/decrement;
            }
         */

        // Print numbers from 1 to 5:

        int num1 = 1;
        while (num1<=5){
            System.out.println(num1);
            num1++;
        }

        // do while loop:
        /*
            Syntax for do while:
            do{
               //body
               increment/decrement;
             } while (condition);
         */

        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);


        // the difference between while & do while loops:
        // In do while loop the loop is going to execute atleast once
        // for e.g:

        int m = 1;
        do{
            System.out.println("Hello World!");
        } while (m != 1);

        // it will execute first and then follow the condition.









    }
}
