//Mia Escoto 
//Program6, gives difference and sum of 2 inputs 

import java.util.Scanner;

public class Program6{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //declare variables
        int value1, value2, sum, difference;
        //input numbers
        System.out.println("Enter a number");
        value1 = scan.nextInt();
        System.out.println("Enter another number");
        value2 = scan.nextInt();
        sum = value1 + value2;
        //add them
        System.out.println("Sum of numbers: " + sum);
        difference = value1 - value2;
        System.out.println("Difference of numbers: " + difference);
    }
}
