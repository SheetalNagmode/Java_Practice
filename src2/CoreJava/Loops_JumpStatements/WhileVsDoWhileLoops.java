package src2.CoreJava.Loops_JumpStatements;

public class WhileVsDoWhileLoops {
    public static void main(String[] args) {

       /*int i=10;
        while(i<=5){      // since the condition is false the statement will not be executed
            System.out.println(i);
            i++;
            }
        */


        int i =10;
        do{
            System.out.println(i);
            i++;   //11         // the statement will atleast execute once even if the condition is false
        }while(i<=5);

         // the major difference between while loop and do while loop is:
        // while loop will not execute if the condition is false
        // but in do while loop the program will atleast execute once even if the condition is false.
        // While loop condition will be verified and than the statement will be executed
        // in do..while loop the statement will be executed before verifying the condition

    }

}
