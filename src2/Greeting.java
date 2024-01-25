package src2;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

    //    String message = greet();
    //    System.out.println(message);

    //    String personalised = myGreet("Sheetal");
    //    System.out.println(personalised);

    //  Taking input

        Scanner in = new Scanner (System.in);
        System.out.print("Enter your name: ");
        String name = in. next();
        String personalised = myGreet(name);
        System.out.println(personalised);




    }

    static String myGreet(String name) {
        String message = "Hello "+ name;
        return message;
    }


    static String greet() {
            String greeting = " How are you?";
            return greeting;
        }

}
