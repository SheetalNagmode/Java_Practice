package src2.CoreJava.JavaOperators_Expressions;

public class TernaryOperator {
    public static void main(String[] args) {

        // Syntax
        // variable = expression ? result 1 : result 2;

        // Example 1
        int a = 200, b =100;
        int x = (a>b) ? a: b;
        System.out.println(x);
        int x1 = (a<b) ? a : b;
        System.out.println(x1);

        // Example 2:
        int y = (1==1) ? 200 : 100;    // if the exp is true first value is printed
        System.out.println(y);
        int z = (1==2) ? 200 : 100;    // if the exp is false the second value is printed
        System.out.println(z);

        // Example 3:
        int person_age = 30;
        String res = (person_age > 18)? "Eligible" : "Not Eligible";
        System.out.println(res);




    }
}
