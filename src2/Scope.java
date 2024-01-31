package src2;

public class Scope {
    public static void main(String[] args) {

        // Block Scope basically means you can access the variables defined in a function
        // only inside the function and not outside

        int a = 10;
        int b = 20;
        String name = "Sheetal";
    //    int a = 22;  // you cannot initialise a variable again
    //    a = 22;  you can modify the value of the variable without initializing it again
        {
    //        int a = 78;  // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100; // reassign the origin ref variable to some other value
            System.out.println(a);
            name = "Sandeep";
            System.out.println(name);
            int c = 99;   // Values which are initialise in the block will remain in the block
        }
    //     System.out.println(c);  // cannot use outside the block

    //    System.out.println(num);
    //    System.out.println(marks);
    //    Can't access in the main function

        // 1. Function Scope: you define a variable in a function you can only access those inside the function
        // this is also true for arguments e.g 'marks'

    }

    static void random (int marks){
    //    System.out.println(a); // 'a' is only accessed in the top function.This function will not no whether 'a' exist.
        int num = 67;
        num = 99;   // this change will only be valid in this function scope only.
        System.out.println(num);
        System.out.println(marks);
    }
}
