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

        int b[][]= {{100, 200},
                    {300, 400},
                    {500, 600}
                };

        // Find size of an array
        System.out.println("Length of rows "+ b.length);
        System.out.println("Length of columns :" + b[0].length);

        // read single value from an array
        System.out.println(a[2][1]);   //600


        // normal for
        for (int r = 0; r <=2 ; r++)
            {      // 0 1   outer for loop
            for (int c = 0; c <=1 ; c++)
            {  // 0 1   inner for loop/ once the inner for loop repetation are completed
                // than it goes to outer for loop/ value will be increment than again go inside the for loop
                System.out.print(a[r][c] + " ");       // 100 200 300 400 500 600
            }
                System.out.println();
        }

        for (int r = 0; r <= a.length-1; r++) {           // When you don't know the length
            for (int c = 0; c <= a[r].length-1; c++) {    // You can also write r<a.length / c<a.length
                System.out.print(a[r][c] + " ");
            }
            System.out.println();
        }

        // enhanced for loop

        for(int arr[]: a){
            for(int x: arr){
                System.out.println(x);
            }
        }

    }
}
