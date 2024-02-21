package src2;

public class VariablesDemo {
    public static void main(String[] args) {

        // int a;  // declaration
        // a = 100;   // assignment

        /*
        int a = 100;   // declaration + assignment
        System.out.println(a); // 100

        a = 200;
        System.out.println(a);
        */

        // Approach 1 :  if all the variables belongs to different data types
       /* int a = 100;
        int b = 200;
        int c = 300;
        */

        // Approach 2 : if all variables belongs to same data type
        /* int a, b,c;
        a = 100;
        b = 200;
        c = 300;
         */

        // Approach 3 : if all variables belongs to same data type
         int a =100, b = 200, c = 300;

        System.out.println("The value of a is " + a);  // using concatenation
        System.out.println("The value of b is " + b);
        System.out.println("The value of c is " + c);

        System.out.println(a+" "+b+" "+c);   // space in between the variable will print the variables in single line



    }
}
