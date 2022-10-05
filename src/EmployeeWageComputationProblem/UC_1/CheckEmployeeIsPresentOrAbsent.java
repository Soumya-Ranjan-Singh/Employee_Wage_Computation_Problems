//This program is to check whether the Employee is present or not.

package EmployeeWageComputationProblem.UC_1;

public class CheckEmployeeIsPresentOrAbsent {
    public static void main(String[] args) {

        //Declaring the variables.
        double isPresent = 1;
        double randomCheck = (double)Math.floor((Math.random()*10)%2);

        //Checking if the Employee is present!!!
        if (randomCheck == isPresent)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
