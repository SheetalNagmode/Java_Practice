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


    }
}
