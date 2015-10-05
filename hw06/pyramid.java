//Allows user to input code
//Practice using nested loops

import java.util.Scanner;

public class pyramid {
    public static void main (String [] args){
       
        Scanner scan = new Scanner(System.in);//set up scanner to allow user to input the size of pyramid they want 
        System.out.println("Enter the size of pyramid you want: "); //user inputs the size of pyramid 
        int sizePyramid = scan.nextInt();//input is stored as int value
        
        
        for (int x=1; x<(sizePyramid*2); x= x+ 2){ //need to add more stars in order to from a pyramid, therefore need to manipulate the user input to add +2 stars to every row
            
            for (int i=0; i<(sizePyramid-x/2); i++){ // for loop adds spacing before the * in order to shift the stars over to produce a pyramid
                System.out.print(" "); //prints out space starting from 0 up until (size-x)/2. As x increases # of blank spaces decreases
                }
    
            for (int k=0; k<x; k++){  //prints out *'s at the k values where k is less than x
            System.out.print("*");
            
        }
            System.out.println("");//prints for loop and then returns to start of for loop and prints next outputs on another line, thus producing rows 
        }
    
    }
}
