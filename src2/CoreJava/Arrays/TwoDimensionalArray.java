package src2.CoreJava.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        /*
        1. Declare an array
        2. Add Values into array
        3. Find length of an array
        4. Read single value from an array
        5. Read multiple values from an array
        */

        // Declaring array

        // Approach 1:

        int a[][] = new int [3][2];
       // int [][]a =new int [3][2];    // different ways to write the syntax
       // int []a[]= new int [3][2];

        a[0][0]= 100;
        a[0][1]= 200;

        a[1][0]= 300;
        a[1][1]= 400;

        a[2][0]= 500;
        a[2][1]= 600;


        // Approach 2:

        int a[][]= {{100, 200},
                    {300, 400},
                    {500, 600}
                };

        // Find size of an array
        System.out.println("Length of rows "+ a.length);
        System.out.println("Length of columns :" + a[0].length);

        // read single value from an array
        System.out.println(a[2][1]);   //600





    }
}
