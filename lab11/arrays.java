// create array of size 20 (array 1)
//use for loop to initalize the array with 20 #'s 
//Write method called sort to sort elements of the array with return type void
//Create array (array 2) size 10
//Sort first and second array and print their values
//create third array (array 3) size 30. Fill third array with values of array 1 and 2


import java.util.Arrays;

public class arrays 
{
    public static void main(String[] args)
    {
        
        int arr [ ] = new int[20];
        for (int x = 0; x<arr.length; x++)
            {
                arr [x] = (int)(Math.random()*100);
            }
            sort(arr);
            System.out.println("Sorted first array: ");
            for (int x=0; x<arr.length; x++)
            {
                System.out.println(arr[x]);
            }
            int arr2[ ] = new int [10];
            for (int x = 0; x<arr2.length; x++)
            {
                arr2[x] = (int)(Math.random()*100);
            }
            sort(arr2);
            System.out.println("Sorted second array: ");
            for(int x = 0; x<arr2.length; x++)
            {
                System.out.println(arr2[x]);
            }
            int arr3[] = new int [30];
            for (int x = 0; x<arr.length; x++)
            {
                arr3[x] = arr[x];
            }
            for (int x = 0; x<arr2.length; x++)
            {
                arr3[arr.length-1+x] = arr2[x];
            }
            sort(arr3);
            System.out.println("The final array");
            for (int x = 0; x<arr3.length; x++)
            {
                System.out.println(arr3[x]);
            }
            
    }
    
    public static void sort(int x[])
    {
        Arrays.sort(x);
    }
    
}



