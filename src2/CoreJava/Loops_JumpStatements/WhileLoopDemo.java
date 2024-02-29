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


        // Example 3: Print even numbers between 1 to 10
        // Approach 1:

        /* int y = 2;
        while(y <= 10){
            System.out.println(y);
            y+=2;        // y=y+2
        }
         */

        //Approach 2:

        int y = 1;
        while (y<=10){
            if (y%2==0){
            System.out.println(y);}
            y++;
        }

        // Example 4: Print even and odd from 1 to 10 numbers
        // Use of conditional statement inside a loop statement

        int z = 0;
        while (z<=10){
            if(z%2==0) {
                System.out.println(z + "-"+ "Even");
            } else {
                System.out.println(z + "-"+ "Odd");
            }
                z++;

            }
        // Example 5: print 10 to 1

        int a = 10;
        while(a>=1){           // Also can a>=0
            System.out.println(a);
            a--;
        }


        }

    }

