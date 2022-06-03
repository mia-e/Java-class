//Mia Escoto
//remove dot from word 

import java.util.Scanner;

public class dot{
    public static void main(String args[]){
        //assigning variables 
        Scanner scan = new Scanner(System.in);
        String website, dotlessWord;
        System.out.println("Enter a website: ");
        website = scan.nextLine();
        //replace dots with no space
        dotlessWord = website.replace(".", "");
        //output
        System.out.println(dotlessWord);
    }
}