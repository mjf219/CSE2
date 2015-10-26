import java.util.Scanner;
import java.lang.Math;

    public class flip {
        
        public static void main (String[ ] args)
        {
            Scanner scan = new Scanner(System.in);
            boolean cont = true;
            while (cont){
                System.out.println("Enter the number of times you wish to flip the coin");
                int x = scan.nextInt();
                if (x>100)
                    cont = false;
                else
                    System.out.println(flip(x));
            }
        }
        
        public static String flip (){
            double x = Math.random();
            if (x>0.5)
                return "Heads 1\nTails: 0";
            else
                return "Heads: 0\nTails: 1";
        }
        
        public static String flip (int n){
            
            int heads = 0;
            int tails = 0;
            if (n==0)
                return flip();
            else{
                for(int x = 0; x<n; x++){
                    double flip = Math.random();
                    if (flip>0.5)
                        heads ++;
                    else
                        tails++;
                }
                return "Heads: " + heads + "\nTails: " + tails;
            }
        }
}
    
        
        
   