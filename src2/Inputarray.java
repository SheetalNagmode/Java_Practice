package src2;

import java.util.Arrays;
import java.util.Scanner;

public class Inputarray {

    public static void main(String[] args) {

        // Array of primitives

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 33;
        arr[2] = 76;
        arr[3] = 45;
        arr[4] = 555;
        System.out.println(arr[3]);





        // input using for loops

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();

        }
        // Another way to print using the Array class:

        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // enhanced for loop

        for (int num : arr) {        // for every element in array, print the element
            System.out.print(num + " ");  // here num represents element of the array

            }

        //     System.out.println(arr[5]);  // index out of bound error

        // Array of objects

            String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));




    }
}

