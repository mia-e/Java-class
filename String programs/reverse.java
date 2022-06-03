//Mia Escoto
//reverse the string 

import java.util.Scanner;

public class reverse{
    public static void main(String args[]){
        //declaring variables
        Scanner scan = new Scanner(System.in);
        String word;
        String reverseWord = "";
        //taking input
        System.out.println("Enter a word: ");
        word = scan.nextLine();
        //iterating over the chars and adding it to the reverse word in reverse
        for (int i = 0; i < word.length(); i ++){
            char character = word.charAt(i);
            reverseWord = character + reverseWord;
        }
        //output
        System.out.println(reverseWord);
    }
}
