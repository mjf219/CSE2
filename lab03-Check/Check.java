//This program is designed to determine how much everyone owes when they want to split a check\
//This program will allow imputs of # of people, total cost of check, % of tip willing to be paid
//Producing the amount that each person owes

import java.util.Scanner;

public class Check {
    public static void main (String[ ] args) {
    
        
        Scanner myScanner = new Scanner ( System.in);
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        double checkCost= myScanner.nextDouble();
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");
        double tipPercent = myScanner.nextDouble ();
        tipPercent /= 100; // Converting the tip into a decimal
        System.out.print("Enter the number of people who went out to dinner: ");
        double numPeople = myScanner.nextDouble ();
        
        
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amount of cost
        dimes, pennies; //for storing digits to the right of the decimal point for the cost$
        totalCost=checkCost*(1+tipPercent);
        costPerPerson = totalCost/numPeople;
        dollars=(int)costPerPerson;
        dimes=(int) (costPerPerson *10) %10;
        pennies=(int) (costPerPerson*100) %10;
        System.out.println("Each person in the group owes $" + dollars + '.' + dimes + pennies);
        
    }
        
}