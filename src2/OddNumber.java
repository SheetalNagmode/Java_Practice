package src2;

import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {

        // Odd Number using user input:

        System.out.println("Enter n : ");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int i = 1;

        while (i<=n){
            System.out.println(i);
            i=i+2;
        }




    }
}
