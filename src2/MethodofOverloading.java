package src2;

public class MethodofOverloading {
    public static void main(String[] args) {

        int a = main(3,4);
        System.out.println(a);

        String s = main ("Rinky");
        System.out.println(s);

    }

    public static int main(int num1, int num2){
        return num1 + num2;
    }

    public static String main (String s){
        return s;
    }

    public static void main (int num){
        num = 10;
        System.out.println(num);
    }

    public static void main(float s){
        s = 10.7f;
        System.out.println(s);
    }
}
