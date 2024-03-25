package src2.CoreJava.Loops_JumpStatements;

public class ContinueStatement {
    public static void main(String[] args) {

        for (int i = 1; i <= 10 ; i++) {
            if (i==5){      // if one has to skip 3, 5 and 9 // use :- if (i==3 || i==5 || i==9)
                continue;
            }
            System.out.println(i);
        }
    }
}
