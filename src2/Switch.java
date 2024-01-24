package src2;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // Switch: in switch statements, you can jump to various cases based on your expression.
        // Syntax:
        // switch (expression){                     Notes:
//        // cases                                    - cases have to be the same type as expressions,
//           case one:                                  must be a constant or literal.
//           // do something                          - duplicate case values are not allowed.
//           break;                                   - break is used to terminate the sequence.
//           case two:                                - if break is not used, it will continue to next case.
//           // do something                          - default will execute when none of the above does.
//           break;                                   - if default is not at the end, put break after it.
//           default:
//          do something }

        // Write a program "Describe fruit":

        Scanner in = new Scanner (System.in);
        System.out.print("Enter a fruit name: ");
        String fruit = in.next();

        switch (fruit){
            case "Mango":                                       // don't put a space inside "" e.g: " Mango" / "Mango "
                System.out.println(" King of fruits: ");        // otherwise the code won't run as expected.
                break;
            case "Apple":
                System.out.println(" A Sweet red fruit: ");
                break;
            case "Orange":
                System.out.println(" Round Citrus fruit: ");
                break;
            case "Grapes":
                System.out.println("Small juice fruit: ");
                break;
            default:
                System.out.println(" please enter a valid fruit ");
        }
    }
}
