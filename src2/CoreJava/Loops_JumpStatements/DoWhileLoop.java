package src2.CoreJava.Loops_JumpStatements;

public class DoWhileLoop {
    public static void main(String[] args) {

        // Do.. while Loop
        /* Syntax:
        do{
        statements;
        increment/ decrement;
        } While (condition);
         */

        // Print 1 to 10 numbers using do..while loop

        int i =1;
        do{
            System.out.println(i);
            i++;
        }while(i<=10);

        // Print Hello message 5 times

        int x = 1;
        do{
            System.out.println("Hello");
            x++;
        }while(x<=5);

        //Print even number 1 to 10
        // Approach 1: using if statement

        int a = 2;
        do{
            if(a%2==0){
                System.out.println(a + "-" + "Even");
            }
            a+=2;
        }while(a<=10);

        //Approach 2:

        int b =2;
        do{
            System.out.println(b);
            b+=2;
        }while(b<=10);

        //Print even and odd numbers between 1 to 10 : using if..else statement

        int z = 0;
        do{
            if(z%2==0){
                System.out.println(z + "-"+ "Even");
            }else{
                System.out.println(z + "-"+ "Odd");
            }
            z++;
        }while(z<=10);


        // Print 10 to 1

        int c = 10;
        do{
            System.out.println(c);
            c--;
        }while(c>=0);


    }
}
