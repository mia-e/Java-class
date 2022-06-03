//Mia Escoto 
//Counting the number of vowels in a string 

import java.util.Scanner;


public class vowelCounter{
    public static void main(String args[]){
        //declaring variables
        Scanner scan = new Scanner(System.in);
        String sentance; 
        int vowels = 0;
        //taking input
        System.out.println("Enter a sentance");
        sentance = scan.nextLine();
        sentance = sentance.toLowerCase();
        //going over each char and checking if theyre a vowel
        for(int i = 0; i < sentance.length(); i++){
            char ch = sentance.charAt(i);
            if(ch == 'a' || ch == 'e' || ch =='i' || ch == 'o'|| ch == 'u')
                vowels++;
        }
        //output
        System.out.println("There are "+vowels+" vowels");
    }
}