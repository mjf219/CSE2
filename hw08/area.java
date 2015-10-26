//program should allow users to tell the program which shape (circle, rectangle, trapezoid) they wish to calculate the area for
//user then inputs the repective dimensions for the shape that they selected
//user can exit program by inputting the number 4
//if user inputs invalid input then program will say "invalid input"

import java.util.Scanner; //import scanner that allows user to input data

public class area { //public class area
    
    public static void main (String[ ] args) //main method
        {
            
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the shape you wish to calculate the area (1 for circle, 2 for rectangle, 3 for trapezoid). Enter 4 to exit the program: ");
            int shape = scan.nextInt();//stores input as integer 
            
            if (shape == 1) //method if user inputs the number 1 (circle)
            {
                System.out.println("Enter radius of the circle: ");
                double r = scan.nextDouble();//stores radius value
                area(r);//call area method for the the circle
            }
            else if (shape == 2)//method if the user inputs the number 2 (rectangle)
            {
                System.out.println("Enter the length of the rectangle: ");
                double l = scan.nextDouble();//storing the input length value
                System.out.println("Enter the width of the rectangle: ");
                double w = scan.nextDouble();//storing the input width value
                area(l, w);//call area method for the rectangle
            }
            else if (shape == 3)//method if user inputs the number 3 (trapezoid)
            {
                System.out.println("Enter the length of the longer base: ");
                double base1 = scan.nextDouble();
                System.out.println("Enter the length of the shorter base: ");
                double base2 = scan.nextDouble();
                System.out.println("Enter the height of the object: ");
                double height = scan.nextDouble();
                area(base1, base2, height);//call area method for the trapezoid
            }
            else if (shape==4)//method that allows user to exit the program instead of finding an area of a shape
            {
                System.out.println("You have exited the program.");//print statement that shows that the user has stopped the program
            }
            else
                System.out.println("Invalid input");//if anything other is inputted then this statement is printed
                
                
        }
        
        public static double area(double r)// method for calculating the area of a circle
        {
            double areaC = 1;//initializing the variable
            areaC = areaC * 3.14 * r * r;//area of circle equation
            System.out.println("The area of the circle is: " + areaC);//prints out the area of the circle using the user inputs
            return areaC;//returns this value
        }
        public static double area(double l, double w)//method for calculating the area of a rectangle
        {
            double areaR = 1;//initalizing the variable
            areaR = areaR * l * w;//area of a rectangle formula 
            System.out.println("The area of the rectangle is: " + areaR);//print statement: area of the rectangle
            return areaR;//returns this value
        }
        public static double area(double base1, double base2, double height)//method for calculating the area of a trapezoid
        {
            double baseADD = base1 + base2;
            double areaT = 1;//initializing the variable 
            areaT = areaT * ((baseADD / 2)*height);//formula for the area of the trapezoid
            System.out.println("The area of the trapezoid is: " + areaT);//print statement: area of the trapezoid
            return areaT;//returns this value
        }
    
}