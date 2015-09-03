// Michael Forzato
//Cyclometer Lab2

// purpose of program is to
// print the number of minutes for each trip 
// print the number of counts for each tirp 
// print the distance of each trip in miles 
// print the distance for the two trips combined 

public class Cyclometer {
    //main method required for every Java program
    public static void main (String[] args) {
        
        int secsTrip1=480; // duration of the 1st trip in seconds
        int secsTrip2=3220; // duration of 2nd trip in seconds
        int countsTrip1=1561; // # of wheel rotation for 1st trip
        int countsTrip2=9037; // # of wheel rotations for 2nd trip
        
        double wheelDiameter=27.0; // diameter of wheel
        double PI=3.1459; // value of constant pi
        double feetPerMile=5280; // # of feet in one mile
        double inchesPerFoot=12; // # of inches in one foot
        double secondsPerMinute=60; // # of seconds in one minute
        double distanceTrip1, distanceTrip2, totalDistance; // values for distances for trips 1, 2, and 3
        
        System.out.println ("Trip 1 took " + (secsTrip1/secondsPerMinute)+" minutes and had " + countsTrip1+" counts.");
        System.out.println ("Trip 2 took " + (secsTrip2/secondsPerMinute)+" minutes and had " + countsTrip2+" counts.");
    
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile; 
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        System.out.println("Trip 1 was "+distanceTrip1+ " miles ");
        System.out.println("Trip 2 was "+distanceTrip2+ " miles ");
        System.out.println("The total distance was "+totalDistance+ " miles");
        

        
    } // end of main method
} // end of class

