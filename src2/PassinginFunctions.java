package src2;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {

        // Arrays are mutable in nature: that means you can change the object
        // Strings are immutable in nature

        int [] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
