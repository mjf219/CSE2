//Program will ask the user to enter a non-negative integer specifying the number of employee timesheets to be read
//Ask for the data for each of the employees
//First input for each employee is an integer= their pay per hour in cents.
//Ask for 5 integers representing the number of hourse they worked on each of the days of the workweek (Monday-Friday)
//Write a loop and any necessary code that reads the data and stores the total payroll of all employees 
//**will have to add up the numbers worked by each employee and multiply that by that particular
//employee's rate to get the employee's pay for the week-and sum those values into a total
//Program should print the total payroll of all the employees


import java.util.Scanner;

public class timeSheets {
    public static void main (String [] args){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a the number of employees: "); //user inputs the number of employees (non-negative number)
        int numberEmployees = scan.nextInt(); 
        double overallPay = 0;
        for (int x=1; x<numberEmployees+1; x++) 
        {
          System.out.println("Pay per hour in cents for employee "+x); 
          int pay= scan.nextInt();
          int total = 0;
          for(int z = 1; z<6; z++)//start at day 1 and less than day 6 (because of working 5 days in business week), initalize variable +1)
          {
              System.out.println("Enter hours worked on day "+z);//allows user to input hours worked on days 1-5
              total+=scan.nextInt();
          }
          overallPay+=(pay*total);//pay for each employee times the total hours worked by each employee
          
        }
        
        overallPay = overallPay/100; //converting the cents into dollars
        System.out.println("The total payroll of all the emplpyees is $" + overallPay);//prints out the total payroll
       
        
    }
    
}
        