package src2;

public class IfCondition {
    public static void main(String[] args) {

        // If Condition examples:

        if (true) {
            System.out.println("Hello World!");
        }

         int a = 10;
        if (a == 10) {
            System.out.println("Please Enter!");
        }

        // While Loop example:

        int count = 1;
        while (count != 5) {
            System.out.println(count);
            count++;
        }

        int num = 10;
        while (num >= 10) {
            System.out.println(num);
            num--;
        }

        // for loop

        for(count = 1; count != 5; count ++){
            System.out.println(count);
        }

        // Roughly: when you don't know how many times the loop is going to run use "while loop"
        // When you know how many times the loop is going to run use "for loop"



    }
}
