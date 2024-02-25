package src2.CoreJava.ConditionalStatements;

public class Largestof3Numbers {
    public static void main(String[] args) {

        // Find largest of 3 numbers
        //condition to solve this problem:
        /* a>b and a>c---a is the largest umber
        b>a and b>c --- b is the largest number
        c>a and c>b ----c is the largest number
         */

        int a = 25, b = 35, c = 20;

        if (a > b && a>c){           // logical and relational operator combination
            System.out.println("The largest number is a  = " + a);
        } else if (b>a && b >c){
            System.out.println("The largest number is b = " + b);
        }else {
            System.out.println(" The largest number is c = " + c);
        }
    }
}
