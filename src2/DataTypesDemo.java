package src2;

public class DataTypesDemo {
    public static void main(String[] args) {

        // Numeric data types

        int a = 100, b = 200;
        System.out.println("the value of a is :"+a);
        System.out.println("the value of b is :"+b);
        System.out.println(a+b);

        System.out.println("the sum of a and b is :"+ (a+b));


        byte by = 125;
        System.out.println(by);

        short sh= 3535;
        System.out.println(sh);

        long l = 212131231232l;    // literal is needed  L/l
        System.out.println(l);

        // Decimal numbers - float, double

        float item_price = 15.5f;   // literal is needed F/f
        System.out.println(item_price);

        double dbl = 1234.4343412;
        System.out.println(dbl);

        char grad = 'A';
        System.out.println(grad);

        String name = "John";
        System.out.println(name);

        // char ch = 'ABC';  //invalid
        // String ch = 'ABC';  // invalid
        // String ch = 'A';  // invalid
        // String ch = "A";  // valid

        // boolean bl = false;  // allows only true/false
        // System.out.println(bl);

        // boolean bl = "true";  // not valid
        // boolean bl = "false"; // not valid

        // String bl = true;  // not valid
        // String bl = "true";  // valid





    }
}
