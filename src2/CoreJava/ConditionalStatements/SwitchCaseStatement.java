package src2.CoreJava.ConditionalStatements;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        // Switch case Statement:
        // Syntax:
        /* switch(variable){
        case value 1 : statement; break;
        case value 2: statement; break;
        case value 3: statement; break;
        default: statement;
        }
         */

        int weekno = 5;

        switch(weekno)
        {
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
            case 7: System.out.println("Saturday"); break;
            default: System.out.println("Invalid Week Number");
        }
    }
}
