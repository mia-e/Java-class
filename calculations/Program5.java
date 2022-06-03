//Mia Escoto
//Program 5, calculates hours worked in a week and in a year

import java.util.Scanner;

public class Program5{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //declare variables
        int hours_worked, hours_week, hours_year;
        //input hours
        System.out.println("Enter hours worked per day");
        hours_worked = scan.nextInt();
        //hours in a week
        hours_week = hours_worked *5;
        hours_year = hours_worked * 252;
        //output
        System.out.println("Hours worked in a week: " + hours_week);
        System.out.println("Hours worked in a year: " + hours_year);
        
    }
}