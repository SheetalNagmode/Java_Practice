package src2;

import java.util.Scanner;

public class CharCaseChecker {
    public static void main(String[] args) {

        // Program to check whether the provided character is in lowercase or uppercase: user input

        Scanner in = new Scanner (System.in);
        char ch = in.next().trim().charAt(0);

        if (ch >= 'a' && ch <='z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");
        }

    }
}
