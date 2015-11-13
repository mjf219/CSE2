//ask user for a number of values stored in an array of integers
//Create array of integers of that size (n)
//for loop to initialize the array with n Random numbers betwen 0 and 100
//Remember (int)(Math.random()*100 to generate a random number between 0 and 100
//for loop to ierate through the array to print all the vlaue in it
//another for loop to find the sum of the values in the array, print it, and the average after the loop
//final for loop to print the values greater than or equal to the average


public class average 


{
    
    public static void main(String [] args)
    {
        
        int sum = 0;
        double average;
        int n = (int)(Math.random()*100);
        int arr[] = new int[n];
        for(int x = 0; x<arr.length; x++)
            arr [x] = (int)(Math.random()*100);
        for(int x = 0; x<arr.length; x++)
            System.out.println(arr[x]);
        for(int x = 0; x<arr.length; x++)
            sum += arr [x];
        average = sum/n;
        System.out.println(sum);
        System.out.println("The average is" +sum/n);
        for(int x = 0; x<arr.length; x++)
            if(arr [x]>average)
                System.out.println(arr [x]);
                
        
        
        

          
        
        
    }
    
    
    
    
    
}