package src2.CoreJava.JavaOperators_Expressions;

public class OperatorsDemo {
    public static void main(String[] args) {

        // 1. Arithmetic operators    +  -  *  /  %

        int a =20, b =10;

        int result = a+b;
        System.out.println("Sum of a and b is : " + result);   // storing in another variable

        System.out.println("Sum of a and b is : " + (a+b));
        System.out.println("Diff of a and b is : " + (a-b));
        System.out.println("Multiplication of a and b is : " + (a*b));
        System.out.println("Division of a and b is : " + (a/b));      // this will return the quotient
        System.out.println("Modulo division of a and b is : " + (a%b));   // this will return the remainder


        // 2. Relational/ Comparison Operators   >  >=  <  <=  !=  ==
        // returns boolean value - true/false
        // Can be used for any data types

        System.out.println(a>b);   // true
        System.out.println(a<b);   // false
        System.out.println(a>=b);  // true
        System.out.println(a<=b);  // false
        b = 20;
        System.out.println(a<=b);  // true
        System.out.println(a>=b);  // true

        System.out.println(a!=b);  // false
        System.out.println(a==b);  // true

        boolean res = a>b;
        System.out.println(res);



        // 3. Logical Operators   &&  ||  !
        // returns boolean value -  true / false
        // works only between two boolean values


        boolean x = true;
        boolean y = false;

        System.out.println(x && y);    // false
        System.out.println(x || y);    // true
        System.out.println(!x);        // false
        System.out.println(!y);        // true

        boolean b1 = 10>20;
        System.out.println(b1);    // false

        boolean b2 = 20>10;
        System.out.println(b2);    // true

        System.out.println(b1 && b2);   // false
        System.out.println(b1 || b2);   // true

        System.out.println((10<20)  && (20>10));    // true
        // combination of relation and logical operators


    }
}
