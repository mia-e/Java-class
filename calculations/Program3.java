//Mia Escoto
//Exercize 3, Multiplys input by 3

import java.util.Scanner;

public class Program3{
    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = scan.nextInt();
        int num2 = num * 10;
        System.out.println(num + " x 10 = " + num2);
        
    }
}