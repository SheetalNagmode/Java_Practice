package src2;

public class Swap {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // swap numbers code

    //    int temp = a;
    //    a = b;
    //    b = temp;

        swap(a,b);

        System.out.println(a + " "+ b);

        String name = "Sheetal Nagmode";
        changename(name);
        System.out.println(name);

    }
     static void changename(String name){
        name = " Sandeep Gaikwad";  // creating a new object
     }

    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }
}
