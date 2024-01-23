package src2;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {

        // Write a program to find the Fibonacci number :

        Scanner in = new Scanner (System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= n){
            int temp = b;
            b =b +a;
            a = temp;
            count ++;
        }
        System.out.println(b);

    }
}
