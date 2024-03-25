package src2.CoreJava.Loops_JumpStatements;

public class WhileLoopWithoutCondition {
    public static void main(String[] args) {

        int i = 1;
        while(true){
            System.out.println("Hello");
            i++;

            if (i==10){
                break;
            }
        }

    }
}
