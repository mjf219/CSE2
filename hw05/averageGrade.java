//create program that enables the user to input data
//use While loops and if-else statements to structure code
//using a while statement- continuously requests a grade to be entered.
//If grade>0 or grade>100 display "invalid grade has been entered"
//When a grade of -999 is entered, program exits loop and computes average grade of the valid grades


import java.util.Scanner;

public class averageGrade {
    public static void main (String [] args){
        Scanner keyboard = new Scanner(System.in);
    
        int grade = 0; //declare variable grade
        int NumGrades = 0;//declare variable for the number of grades entered
        double avg = 0;//declare average
        int sum = 0;//declare sum of the grades entered
        
        
        System.out.println("Enter grades within the range of 0-100: Enter -999 when finished");//ask user to input grades between that range and enter -999 when they are done inputting grades
    
        do  {
           
            grade = keyboard.nextInt();
            if(grade >=0 && grade <=100){
           
            sum = sum + grade;//sum the grades that were entered
            if (grade <0 || grade>100){
                System.out.println("Invalid grade has been entered.");//if grade is not within range print out this statement
            }
            
            }
            if (grade >= 0){
                NumGrades++;
            }
        }
        while (grade >=0);
        avg = sum / NumGrades;//average of the grades is equal to the sum of them / by the number of grades
        System.out.println("Average grade: " + avg);//print out the average grade
        
    
        
}
}


