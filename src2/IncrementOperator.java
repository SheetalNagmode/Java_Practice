package src2;

public class IncrementOperator {
    public static void main(String[] args) {

        // Increment operator   ++  --

        // Case 1
        /* int a = 10;
        System.out.println(a);

        a++;      // a = a+1;
        System.out.println(a);
         */


        // Case 2  - post increment

        /* int a =10;
        int res = a++;    // post increment : increment happens after assignment
        System.out.println(res);   // 10
         System.out.println(a);    // 11
         */


        //Case 3  - pre increment
        int a =10;
        int res = ++a;    // increment happens before assignment
        System.out.println(res);   // 11
        System.out.println(a);     // 11

    }
}
