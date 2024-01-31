package src2;

import java. lang. String;

public class Overloading {
    public static void main(String[] args) {

        // two or more functions with the same name but different data types
        // this is called function overloading
        // The program determines which function to use during the time of compilation
        // function overloading decides which function to use at the compile time
        // two ways to provide function overloading is either the number of  arguments should be different
        // or the types of arguments should be different
        // By changing the number of parameters.
        // By changing the data type of parameters
        // Overloading by changing the number of parameters A method can be overloaded by changing the number of parameters.

        fun(67);
        fun("Sheetal");


    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }

    static void fun(float f){
        System.out.println(f);
    }
}
