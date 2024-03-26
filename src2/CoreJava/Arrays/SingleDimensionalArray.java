package src2.CoreJava.Arrays;

public class SingleDimensionalArray {
    public static void main(String[] args) {

        /*
        1. Declare an array
        2. Add Values into array
        3. Find length of an array
        4. Read single value from an array
        5. Read multiple values from an array
        */

        // Declaring array
        // Approach 1

        int a[] = new int [5];

        a[0]=100;              // Use this method if you know how many elements are to be added and
        a[1]=200;              // there will be no plan to change (adding more elements) in the future
        a[2]=300;              // The size is fixed
        a[3]=400;
        a[4]=500;

        // Approach 2

        int b[]= {100, 200, 300, 400, 500};

        // Use approach 2 when not sure how many elements to be added
        // And if you have to add more elements in the future


        // Find Length of an array : variable.length
        System.out.println("Length of an array :" + a.length);

        // Read single value from an array
        System.out.println(a[4]);    // here 4 is index number

        // reading all the values from array

        // Normal for loop
        for (int i = 0; i <=  a.length-1; i++)   // i <=4   i,<5  i<= a.length -1    i < a.length
        {
            System.out.println(a[i]);  // 100 200 300 400 500
        }

        // enhanced for loop / for...each loop

        for(int x: a){
            System.out.println(x);
        }




        // Read multiple values from an array



    }
}
