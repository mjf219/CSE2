//Lab will excercise switch statements
//Prompt user for two integers a and b and an operator ("*", "-", "+" or "/")
//Display "illegal operator" if operator is invalid
//compute and display integers and operator

import java.util.Scanner;

public class Calculator {
    public static void main (String [] args){
        
        Scanner myScanner = new Scanner ( System.in);
        System.out.print("Enter an integer: "); //user inputs an integer
        double firstInteger= myScanner.nextDouble(); 
        System.out.print("Enter a second integer: ");//user inputs a second integer
        double secondInteger = myScanner.nextDouble ();
        System.out.print("Enter one of the following operators; '*', '-', '+' or '/': ");//tell user to input an operator
        String operator= myScanner.next ();
        
        
        switch (operator){
            case "*":
                System.out.println(+firstInteger*secondInteger+firstInteger*secondInteger);//if '*' multiply 1st and 2nd integer
                break;
            case "-":
                System.out.println(firstInteger-secondInteger);//if '-' subtract 1st and 2nd integer
                break;
            case "+":
                System.out.println(firstInteger+secondInteger);//if '+' add 1st and 2nd integer
                break;
            case "/":
                System.out.println(firstInteger/secondInteger);//if '/' divide 1st and 2nd integer
                break;
            default:
                System.out.println("Invalid operator");//if an invalid operator print out this statement 
                break;
            
        }
      
        
        
    }
}