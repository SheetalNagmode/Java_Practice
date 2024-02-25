package src2.CoreJava.ConditionalStatements;

public class Largestof2Numbers {
    public static void main(String[] args) {

        int a = 200, b = 30;
        if(a > b){
            System.out.println(" The largest number is a = " + a);
        } else {
            System.out.println(" The largest number is b = "+ b);
        }

        // Using Ternary operator:

        int a1 = 300, b1 = 200;
        int res = (a1>b1)? 300 :200;
        System.out.println(" The largest number is = " + res);
    }
}
