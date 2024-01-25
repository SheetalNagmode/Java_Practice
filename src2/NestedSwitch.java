package src2;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Sheetal Nagmode");
                break;
            case 2:
                System.out.println("Sandeep Gaikwad");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                }
                break;
                    default:
                        System.out.println("Enter correct EmpID");

        }

        // Better/ cleaner way to write the code using enhanced switch function

        switch (empID) {
            case 1 -> System.out.println("Sheetal Nagmode");
            case 2 -> System.out.println("Sandeep Gaikwad");
            case 3 -> {
                System.out.println("Emp Number 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("No department entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }

    }
}
