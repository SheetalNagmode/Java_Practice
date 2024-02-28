package src2.CoreJava.Loops_JumpStatements;

public class WhileLoopDemo {
    public static void main(String[] args) {

        // While Loop Statement
        /* Syntax:
            initialization;
            while(condition){
            statements;
            increment/ decrement;
            }
         */

        // Example 1: Print 1 to 10 numbers using while loop.

        int i =1;          // initialization
        while(i<=10){       //  condition
            System.out.println(i);
            i++;             // incrementation
        }

        // Example 2: Print Hello Message 10 times

        int x = 1;
        while (x<=10){
            System.out.println("Hello");
            x++;
        }



    }
}
