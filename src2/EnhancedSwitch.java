package src2;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner (System.in);
        System.out.print("Enter a fruit name: ");
        String fruit = in.next();

//        switch (fruit){
//            case "Mango":
//                System.out.println(" King of fruits: ");
//                break;
//            case "Apple":
//                System.out.println(" A Sweet red fruit: ");
//                break;
//            case "Orange":
//                System.out.println(" Round Citrus fruit: ");
//                break;
//            case "Grapes":
//                System.out.println("Small juice fruit: ");
//                break;
//            default:
//                System.out.println(" Please enter a valid fruit ");
//        }

        // Instead of switch we can use enhanced switch for the above program
        // click on switch and do Alt + Enter = to select enhanced switch
        // enhanced condition option is only shown when you have break after every condition in the code
        // because in enhanced switch: every particular line contains a break condition but it's not written
        // much cleaner code.
        // you can also change it to if statements by using the Alt+enter on switch

        switch (fruit) {
            case "Mango" -> System.out.println(" King of fruits: ");
            case "Apple" -> System.out.println(" A Sweet red fruit: ");
            case "Orange" -> System.out.println(" Round Citrus fruit: ");
            case "Grapes" -> System.out.println("Small juice fruit: ");
            default -> System.out.println(" Please enter a valid fruit ");
        }

        //  Alt+enter selecting switch to change it to if statements:

//        if (fruit.equals("Mango")) {
//            System.out.println(" King of fruits: ");
//        } else if (fruit.equals("Apple")) {
//            System.out.println(" A Sweet red fruit: ");
//        } else if (fruit.equals("Orange")) {
//            System.out.println(" Round Citrus fruit: ");
//        } else if (fruit.equals("Grapes")) {
//            System.out.println("Small juice fruit: ");
//        } else {
//            System.out.println(" Please enter a valid fruit ");
//        }


        // Write a program to Display day name between 1 to 7:

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the number : ");
        int day = in.nextInt();
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }

        // write a program to display weekdays and weekends
        // using the same above code:

        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
        }

        // same code with enhanced switch:
//        switch (day) {
//            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
//            case 6, 7 -> System.out.println("weekend");
//        }

        }
}
