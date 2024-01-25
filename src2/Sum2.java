package src2;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {

    //    sum();
    //    sum();

    //    int ans = sum2();
    //    System.out.println(ans);

        int ans2 = sum3(11, 22);
        System.out.println(ans2);
    }

    // pass the value of numbers when you are calling the method in main()

       static int sum3 (int a, int b){
        int sum = a + b;
        return sum;
       }

        /*
          return_type name(arguments){
          // body
          return statement;
          }
         */

        // Take input of 2 numbers and print the sum

        static void sum() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            System.out.print("The sum = " + sum);
            System.out.println(" ");
        }

          // return the value

        static int sum2() {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter number 1: ");
            int num1 = in.nextInt();
            System.out.print("Enter number 2: ");
            int num2 = in.nextInt();
            int sum = num1 + num2;
            return sum;

        }

}


