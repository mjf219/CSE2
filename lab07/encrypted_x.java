// This program will hide a secret message X.
//Bury the character in a handful of stars
//Use while loops and break statements


import java.util.Scanner;

public class encrypted_x {
    public static void main (String [] args){
       
       
        boolean isInput;
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Please enter the size of square between 0-100: ");
        int number = myScanner.nextInt();
        
    
          if (number<0 || number > 100){
              System.out.println("Invalid input");
              System.exit(-1);
              
          }
              
            for (int i = 0; i <= number; i++){
                
                for (int j = 0; j < number; j++){
                    
                    if (j == i || j == number-i){
                        System.out.print(" ");
                    }
                    
                    else {
                        System.out.print("*");
                    }
                    
                }
    System.out.println();
          
          
    }
}
}
        