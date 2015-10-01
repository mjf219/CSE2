import java.util.Scanner;

public class CalculatorSpecial {
    public static void main (String [] args){
        
        Scanner myScanner = new Scanner (System.in);
        boolean Stop = true;
        while (Stop == true){
        
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
        System.out.print("Type n or N to stop: ");//Ask user whether they are done or not
        String stop= myScanner.next ();
        if (stop.equals("n") || stop.equals("N")){
            Stop = false;
            System.out.println("Program is finished");
            break;
            
        }
        }
        
    }
}
