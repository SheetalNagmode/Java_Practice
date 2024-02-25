package src2.CoreJava.ConditionalStatements;

public class MultipleStatements {
    public static void main(String[] args) {

        // If condition requires a boolean value

        if (true) {        // we can directly put boolean value instead of expression
            System.out.println(1);
        }else{
            System.out.println(2);
        }

        if (1==2) {       // expression = boolean value true or false
            System.out.println(1);
        }else{
            System.out.println(2);
        }

        // Nested if condition:
        // One if condition.. have multiple if else.. conditions

        if(true){
            if(false){
                System.out.println("abc");
            }else{
                System.out.println("xyz");
            }
        }else{
            System.out.println(123);
        }


    }
}
