package src2;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        // Find the largest of the 3 numbers:

        Scanner in = new Scanner(System.in);

        System.out.print(" Please enter a, b and c : ");

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max){
            max = c;
        }
        System.out.println(max);


        int max1 = 0;
        if (a>b) {
            max1 = a;
        } else {
            max1 =b;
        }
         if (c> max1){
             max1 = c;
         }
        System.out.println(max1);


         // using Math.max function:

        int max2 = Math.max(c, Math.max (a , b ));

        System.out.println(max2);


    }
}
