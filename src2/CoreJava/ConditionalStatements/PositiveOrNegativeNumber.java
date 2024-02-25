package src2.CoreJava.ConditionalStatements;

public class PositiveOrNegativeNumber {
    public static void main(String[] args) {

        //  Check number is positive, negative or zero
        // if the num > 0 = positive, num < 0 = negative number, if num = zero it is zero

        int num = 0;

        if (num > 0){
            System.out.println("Positive Number");
        } else if (num < 0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Zero");
        }
    }
}
