//create program that enables the user to input data
//use While loops and if-else statements to structure code
//using a while statement- continuously requests a grade to be entered.
//If grade>0 or grade>100 display "invalid grade has been entered"
//When a grade of 999 is entered, program exits loop and computes average grade of the valid grades


import java.util.Scanner;

public class averageGrade {
    public static void main (String [] args){
        
        Scanner myScanner = new Scanner (System.in);
        while (grade>=0 || grade<=100){
        
        System.out.print("Enter a grade: "); //user inputs a grade
        double grade= myScanner.nextDouble(); 
 

        if (grade.equals("999")){
            grade = false;
            System.out.println("Average grade=");
            break;
            
        }
        }
        
    }
}
