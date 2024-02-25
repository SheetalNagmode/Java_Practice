package src2.CoreJava.ConditionalStatements;

public class IfElseConditionDemo {
    public static void main(String[] args) {

        // If Else Condition:
        // Syntax: if (condition){
        // statements;
        //}else{
        // statements;
        //}


        int person_age= 16;

        if (person_age >= 18)        // no semicolon after if and else
        {
            System.out.println("Eligible for vote");
        }                           // if there is a single statement after if and else than curly braces are optional
        else
        {                          // curly braces are important when multiple statements are there
            System.out.println("Not eligible for vote");
        }


       /* if (person_age >= 18)
            System.out.println("Eligible for vote");
        else
            System.out.println("Not eligible for vote");
        */


    }
}
