package src2;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        // When one type of data is assigned to another type of variable
        // an automatic type conversion will take place is the following conditions are met.
        // 1. The two data types should be compatible.
        // for e.g: Int, float, double, and not int and boolean
        // 2. the destination type should be greater than the source type.
        // for e.g:

        Scanner input = new Scanner(System.in);
        float num = input.nextInt();   //The left side should be greater than the right
        System.out.println(num);


        // Java does automatic type conversion when storing a integer constant into variable types
        // like byte, short, long and even char sometimes. it stores the ASCII value of char.
        // Integer to float conversion is known as Type Casting : casting in incompatible types
        // This is sometimes called as narrowing conversion
        // Compressing the bigger number into smaller type explicitly is called Type Casting

        int num1 = (int)(67.56f); // Type casting
        System.out.println(num1);

        // Automatic Type promotion in expressions

        int a = 257;
        byte b = (byte)(a);  // the maximum value stored in byte is 256
        System.out.println(b);  // 257 % 256 = 1

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int d = x * y / z;
        // the value of x * y is exceeding the maximum range of byte
        // java automatically promotes the byte/ short
        // (whatever expression you take) to Integer when it's evaluating this expression.
        // so that its able to store it

        System.out.println(d);

        int number = 'A';
        System.out.println(number); // prints the ASCII value of 'A'. Automatic type conversion.

        // Java follows the unicode principle.
        // you can print any language, unicode values in java.

        System.out.println("नमस्ते");

        // Rules to promote the type
        // 1. All the byte, short, char is promoted to integer
        // 2. if one of the factors is long, whole operation will be converted to long.
        // 3. if one of the factors is float, whole operation will be converted to float.

        byte a1 = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d1 = 0.1234;
        double result = (f * a1) + (i / c) - (d1 * s);
        // float + int - double = double
        System.out.println((f * a1) + " " + (i / c) + " " + (d1 * s));
        System.out.println(result);











    }
}
