package src2;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        // Write a program to check whether the given number is a Armstrong number or not

    //    Scanner in = new Scanner (System.in);
    //    System.out.println("Please enter n: ");
    //    int n = in.nextInt();

        // if we need to find 3 digit Armstrong number till 1000

        for (int i = 100; i < 1000; i++){
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
        }





    }

    static boolean isArmstrong (int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        if (sum == original){
            return true;
        }
        return false;

    }
}
