package src2.CoreJava.JavaOperators_Expressions;

public class Swapping2Numbers {
    public static void main(String[] args) {

        // 5 different ways of swapping two numbers

        int a = 10, b =20;

        System.out.println("Before swapping the values are.."+a+ " " +b);

        // Logic 1: using the third variable

       /* int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping the values are.. "+a+ " " +b); */

        // Logic 2 : using + and - . Without using the third variable.

        /*a= a+b;   // 10+20=30
        b= a-b;   // 30-20=10
        a= a-b;   // 30-10=20

        System.out.println("After swapping the values are.. "+a+ " " +b);*/


        // Logic 3: using * & / . Without using third variable
        // Possible only when a & b values are not zero

       /* a= a*b;  //10*20=200
        b= a/b;   //200/20=10
        a= a/b;   //200/10=20

        System.out.println("After swapping the values are.. "+a+ " " +b);*/

        //Logic 4: using Bitwise XOR (^)

        /*a=a^b;   //10^20=30
        b=a^b;   //30^20=10
        a=a^b;   //30^10=20

        System.out.println("After swapping the values are.. "+a+ " " +b);*/

        //Logic 5: Single statement
        //a=10  b=20

        b = a+b - (a=b);  // this is solved from right to left
        // brackets are solved first


        System.out.println("After swapping the values are.. "+a+ " " +b);



    }
}
