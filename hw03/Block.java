//imputs: length, width, height of blocl
//program will calulate the volume and surface area

import java.util.Scanner;

public class Block {
    public static void main (String[ ] args) {
        
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter the length of the block: ");//input a length of the block
        double lengthBlock= myScanner.nextDouble();
        System.out.print("Enter the width of the block: ");//input a width for the block
        double widthBlock=myScanner.nextDouble();
        System.out.print("Enter the height of the block: ");//input a height for the block
        double heightBlock=myScanner.nextDouble();
        
        double volume;
        double surfaceArea;
        volume=lengthBlock*widthBlock*heightBlock;//volume is equal to inputs multiplied together
        surfaceArea= 2*lengthBlock*widthBlock + 2*widthBlock*heightBlock + 2*lengthBlock*heightBlock;//surrface area = ab*bc*ca where a+length, b=width, c=height
        System.out.println("The volume of the block of dimensions "+lengthBlock+ " x "+widthBlock+ " x "+heightBlock+" is "+volume+".");//print out the dimensions of the block and its volume
        System.out.println("The surface area of the block is "+surfaceArea+".");//print out the surfacce area of the block
        
        
        
        
    }
    
}   
        
    
    
    