package src2;

import java.util.Scanner;

public class EvenNumber {
    public static void main(String[] args) {

        // Even Number program using user input:

        System.out.println("Enter n : ");
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        int i = 2;

        while (i<=n){
            System.out.println(i);
            i=i+2;
        }

        // Print 1 to 20 Even numbers:

        int x = 1;
        System.out.println("Even Numbers : ");
        while (x <= 10 ) {
            System.out.println(x * 2);
            x++;
        }

        //



    }
}
