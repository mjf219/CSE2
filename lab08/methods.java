// ask user for 10 numbers
// calculate mean 
// calculate the median

import java.util.Scanner;


public class methods {
    

    public static double mean(double a, double b, double c, double d, double e, double f, double g, double h, double i, double j){
        
        double x = (a+b+c+d+e+f+g+h+i+j)/10;
        return x;
      
    }
    
    public static double median(double k, double l){
        
        double y = (k+l)/2;
        return y;
      
    }
    
    public static void print(double x, double y){
        
        System.out.println("Mean value is "+x);
        System.out.println("Median value is "+y);
        return;
      
    }
    
    public static void main (String [] args){
        
        double x;
        double y;
        
        Scanner myScanner = new Scanner(System.in);
     
        System.out.println("Please input all values in numerical order.");
        System.out.print("Value 1: ");
        int x1 = myScanner.nextInt();
        System.out.print("Value 2: ");
        int x2 = myScanner.nextInt();
        System.out.print("Value 3: ");
        int x3 = myScanner.nextInt();
        System.out.print("Value 4: ");
        int x4 = myScanner.nextInt();
        System.out.print("Value 5: ");
        int x5 = myScanner.nextInt();
        System.out.print("Value 6: ");
        int x6 = myScanner.nextInt();
        System.out.print("Value 7: ");
        int x7 = myScanner.nextInt();
        System.out.print("Value 8: ");
        int x8 = myScanner.nextInt();
        System.out.print("Value 9: ");
        int x9 = myScanner.nextInt();
        System.out.print("Value 10: ");
        int x10 = myScanner.nextInt();
        
        x = mean(x1, x2, x3, x4, x5, x6, x7, x8, x9, x10);
        y = median(x5, x6);
        print(x,y);
  
        }
        
        
    }
    
