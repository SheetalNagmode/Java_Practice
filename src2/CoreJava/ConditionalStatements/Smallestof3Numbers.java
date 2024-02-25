package src2.CoreJava.ConditionalStatements;

public class Smallestof3Numbers {
    public static void main(String[] args) {

        // Smallest of three numbers using if else.. statement

        int a = 40, b = 60, c = 30;

        if ( a<b && a<c){
            System.out.println(" The smallest number is a =" + a);
        } else if( b<a && b<c){
            System.out.println(" The smallest number is b = "+ b);
        } else {
            System.out.println(" The smallest number is c = "+ c);
        }

    }
}
