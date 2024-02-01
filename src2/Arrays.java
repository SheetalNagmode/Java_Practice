package src2;

public class Arrays {
    public static void main(String[] args) {

        // Arrays is a collection of datatypes. it can either be primitive, object, complex data types
        // Syntax : datatype[] variable_name = new datatype [size];
        // store 5 roll numbers

        int [] rnos = new int [5];
        // or you can directly write

        int [] rnos2 = {23, 45, 33, 68, 74};

        //1.  This data type basically represents whatever type data stored inside the array
        //2.  All the type of data inside the array should be same. you cannot mismatch data type
        //    e.g: all int, or all string, etc
        //3.  'new' keyword is used to create an object
        // 4. index of a array starts with 0. e.g rnos2 [0] = 23, rnos2 [3] = 68.
        int [] ros; // declaration of array. ros is getting defined in the stack
        ros = new int [5]; // initialisation: actually here object is being created in the memory (heap).

        // array objects are in heap
        // objects are not continuous
        // Dynamic memory allocation happens at runtime
        // hence may not be continuous = depends on JVM

        String [] arr = new String [4];
        System.out.println(arr[0]);

        // Null in java is a special value literal. Its the by default value of reference variables.
        // you cannot assign a null type to primitive data type
        // you can assign it to String



    }
}
