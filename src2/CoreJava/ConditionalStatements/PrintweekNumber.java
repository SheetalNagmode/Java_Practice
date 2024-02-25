package src2.CoreJava.ConditionalStatements;

public class PrintweekNumber {
    public static void main(String[] args) {

        // Print week number on given week name using switch case statement

        String weekname = "Friday";

        switch (weekname){
            case "Sunday": System.out.println("Week number is 1"); break;
            case "Monday": System.out.println("Week number is 2"); break;
            case "Tuesday": System.out.println("Week number is 3"); break;
            case "Wednesday": System.out.println("Week number is 4"); break;
            case "Thursday": System.out.println("Week number is 5"); break;
            case "Friday": System.out.println("Week number is 6"); break;
            case "Saturday": System.out.println("Week number is 7"); break;
            default: System.out.println("Invalid week name");
        }


    }
}
