package src2.CoreJava.Loops_JumpStatements;

public class ForLoopDemo {
    public static void main(String[] args) {

        // For loop:
        /*Syntax:
        for (initialization; condition; increment/decrement)
        {
        statements;
        }
         */

        // Print 1 to 10 numbers

        for (int i =1; i <=10; i++)
        {
            System.out.println(i);
        }

        // Print even numbers 1 to 10

        for(int a=2; a<=10; a+=2)
        {
            System.out.println(a);
        }

        // Print even and odd numbers from 1 to 10:
        // using for loop and conditional statement

        for (int x = 0; x<=10; x++)
        {
            if (x%2==0){
                System.out.println(x + "-"+ "Even");
            }else{
                System.out.println(x + "-"+ "Odd");
            }
        }



        // Print 10 to 1 in descending order:

        for (int b=10; b>=0 ; b-- ){
            System.out.println(b);
        }





    }
}
