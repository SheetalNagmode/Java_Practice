package src2.CoreJava.JavaOperators_Expressions;

public class DecrementOperator {
    public static void main(String[] args) {

        // Decrement Operators:

        // Case 1
       /* int a =10;

        a--;  // a = a-1;
        System.out.println(a);  // 9
        */

        // Case 2 - post decrement
        /*int a = 100;

        int res = a--;
        System.out.println(res);  // 100
        System.out.println(a);    // 99
        */

        // Case 3 - pre decrement
        int a = 100;

        int res = --a;
        System.out.println(res);  // 99
        System.out.println(a);    // 99


    }
}
