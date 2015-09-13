import java.util.Scanner;

public class Timer {
    public static void main (String[ ] args) {
        
        Scanner myScanner = new Scanner ( System.in);
        System.out.print("Enter the current time in form HHMM:"); //use military time
        double currentTime= myScanner.nextDouble();
        System.out.print("Enter the time that you will be eating dinner in form HHMM:"); //use military time
        double dinnerTime= myScanner.nextDouble ();
        
        double timeUntilDinner;
        int hours, minutes;
        timeUntilDinner=dinnerTime-currentTime;
        hours=(int) (timeUntilDinner/100);
        minutes=(int) (timeUntilDinner) %100;
        System.out.println("You have "+ hours +" hours and "+ minutes+ " minutes until dinner.");
        
    }
    
    
}