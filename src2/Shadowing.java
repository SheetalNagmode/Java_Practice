package src2;

public class Shadowing {
    static int x = 90;  // this will be shadowed at line 11
    public static void main(String[] args) {

        // Shadowing in java is a practice of using two variables with the same name within the scope that overlaps

        System.out.println(x);  // 90
    //    int x = 40;             // the class variable at line 4 is shadowed by this
        int x;
    //    System.out.println(x);   // scope will begin when value is initialised
        x = 45;
        System.out.println(x);  // 40
        fun();
    }

    static void fun(){
        System.out.println(x);  // 90 since outside the block so x value will remain the larger declared value
    }
}
