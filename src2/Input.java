package src2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.in : Keyboard input (by default). Can be changed to file etc.
        // System.out.println(input.nextInt());
        // System.out.println(input.next());  // only first string is return
         System.out.println(input.nextLine()); // Whole string is return


        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter some input: ");
        int rollno = sc.nextInt();
        System.out.println("Your roll number is " + rollno);

        // Literals and identifiers
         int a = 10;
         // In primitive data type literal are the syntactic representation of boolean, char, numbers etc
        // 10 here is the literal
        // reference variable is called the Identifier.
        // Name of a class, method, variable, function, packages is an identifier in java
        // if you want to write 234 million. Commas cannot be used you can use underscore instead
        int b = 234_000_000;
        System.out.println(b);

        String name = input.next();
        System.out.println(name);

        float marks = input.nextFloat();
        System.out.println(marks);

        double num = input.nextDouble();
        System.out.println(num);

        boolean check = input.nextBoolean();
        System.out.println(check);




    }
}
