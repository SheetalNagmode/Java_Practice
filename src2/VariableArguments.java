package src2;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {

        fun(24,38,84,55,68,76,8,11);
        fun();  // empty array

        // Variable arguments: lengths doesn't stay constant. it varies to length of input provided.
        // Syntax is telling compiler this Function can be called via zero or more than zero arguments
        // variable length argument should always be at the end and not between two variables
        //e.g : multiple(int a, String...v, int b) this is not allowed

        multiple(2,4,"Sheetal", "Sandeep", "Atharv", "Sudha", "Ram", "Amit");




    }

    static void multiple(int a , int b, String...v){  // variable length always shown with three dots not more or less
        System.out.println(Arrays.toString(v));

    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
