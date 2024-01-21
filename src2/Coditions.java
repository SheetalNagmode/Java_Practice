package src2;

public class Coditions {
    public static void main(String[] args) {

        /*
        Syntax of if statements:
        if (boolean expression T or F){
              // body
              } else{
              // do this
              }
         */

        // Write a program for salary "if ..else" statement:
        // if the salary is $10000 give a bonus of $2000 otherwise give a bonus of $1000

        int salary = 25400;
        if (salary > 10000) {
            salary = salary + 2000;   // salary == 2000
        } else {
            salary = salary + 1000;
        }
        System.out.println(" Your Salary is  " + salary);
        }






    }

