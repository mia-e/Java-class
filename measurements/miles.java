//Mia Escoto 
//kilo --> miles 

import java.util.Scanner;

public class miles{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //declare variables
        float miles, kilo;
        //input kilometers
        System.out.println("Enter kilometers: ");
        kilo = scan.nextFloat();
        //calculate miles
        miles = kilo * 90 * 60 /10000;
        //output miles
        System.out.println("Nautical miles: " + miles);
        
    }
}