//move a value at a specific index to the end of the array
//ask user to specify the size of the array- use try/catch to check that the value entered is >0
//Fill array with random vlaue between 0 and 100
//ask user to enter the value of the index to be moved. 
//Use try/catch to check that the value entered is between 0 and the size of the array -1
//move the value at index to the end of the array

import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class move_array
{
    public static void main(String [] args)
    {
        
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please specify the size of the array");
        int x = myScanner.nextInt();
        
        int arr [] = new int [x];
        for (int i = 0; i<arr.length; i++)
            {
                arr [i] = (int)(Math.random()*100);
                System.out.println(arr [i]);
            }
        
        System.out.println("Which number in the array do you wish to move to the end of the array?");
        int j = myScanner.nextInt();
        
        int z = arr[j];
        if (x>0 || x<arr.length)
        {
            for (int k = j; k<arr.length-1; k++)
            {
                arr [k] = arr [k+1];
            }
            
          arr [arr.length-1] = z;
          System.out.println(Arrays.toString (arr));
            
        }
        else 
        {
            System.out.println("Invalid input");
        }
        
        
    }
    
    
    
}