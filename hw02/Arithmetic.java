// hw02
// This homework has the objective of giving you practice manipulating data 
// stored in variables, in running simple calculations, and in printing the numerical output
// that you generated.

// Task: You go shopping at Walmart’s and want to compute the cost of the items you
// bought, including the PA sales tax of 6%. Begin by setting up a class called “Arithmetic”
// with a main method, as you did in your first homework.



public class Arithmetic{
    
    public static void main(String[ ] args) {
        
        //Number if pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;
        
        //Number of boxes of envelopes
        int nEnvelopes=1;
        //Cost per box of envelopes
        double envelopeCost$=3.25;
        
        double taxPercentValue=0.06; //value used to show the amount paid in tax
        double taxPercent=1.06; //value used to add tax to total costs
        double totalSockCost$; //total cost of socks
        double PercentageTaxCostSocks$; //amount of tax paid for socks
        double totalGlassCost$; //total cost of glasses
        double PercentageTaxCostGlass$; //amount of tax paid for glasses
        double totalEnvelopeCost$; //total cost of envelopes
        double PercentageTaxCostEnvelope$; //amount of tax paid for envelopes
        double totalShoppingCost$; //total amount paid for shopping
        double totalSalesTax$; //total amount paid in tax
        
        
        totalSockCost$=nSocks*sockCost$*taxPercent;
        PercentageTaxCostSocks$=nSocks*sockCost$*taxPercentValue;
        
        totalGlassCost$=nGlasses*glassCost$*taxPercent;
        PercentageTaxCostGlass$=nGlasses*glassCost$*taxPercentValue;
        
        totalEnvelopeCost$=nEnvelopes*envelopeCost$*taxPercent;
        PercentageTaxCostEnvelope$=nEnvelopes*envelopeCost$*taxPercentValue;
        
        totalShoppingCost$=totalSockCost$+totalGlassCost$+totalEnvelopeCost$;
        totalSalesTax$=PercentageTaxCostEnvelope$+PercentageTaxCostGlass$+PercentageTaxCostSocks$;
        
        
        //socks
        System.out.println("You have purchased "+nSocks+" socks at a price of $"+sockCost$ +".");
        System.out.println("Your total cost for socks is $"+ totalSockCost$+ ".");
        System.out.println("You paid $"+PercentageTaxCostSocks$+" in tax for socks.");
        
        //glasses
        System.out.println("You have purchased "+nGlasses+" glasses at a price of $"+glassCost$ +".");
        System.out.println("Your total cost for glasses is $"+totalGlassCost$+".");
        System.out.println("You paid $"+PercentageTaxCostGlass$+" in tax for glasses.");
        
        //envelopes
        System.out.println("You have purchased "+nEnvelopes+" envelope at a price of $"+envelopeCost$ +".");
        System.out.println("Your total cost for envelopes is $"+totalEnvelopeCost$+".");
        System.out.println("You paid $"+PercentageTaxCostEnvelope$+" in tax for envelopes.");
        
        //total cost 
        System.out.println("Your total cost is $"+totalShoppingCost$+".");
        System.out.println("You paid $"+totalSalesTax$+" in sales tax.");
        
        // show list of items bought, how many of each, and the cost per item
        // display cost of items and the sales tax for that item
        // display total cost of items purchased (before tax), total sales tax, total cost with sales tax
        
    
        
        
    }
        
    }