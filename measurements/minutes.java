//Mia Escoto
//min --> year

import java.util.Scanner;

public class minutes{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //final variables
        final int DAYS = 365;
        final int HOURS = 24;
        final int MINS = 60;
        //multiplying mins in one year
        int mins_in_year = DAYS * HOURS * MINS;
        //declare 
        int years, totalMins;
        //get years
        System.out.println("enter years: ");
        years = scan.nextInt();
        //minutes in the years
        totalMins = mins_in_year * years;
        System.out.println("There are " +totalMins+  " minutes in " + years + " years");
        
        
        
    }
}