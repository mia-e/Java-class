//Mia Escoto 
//removing a word that is suggested 

import java.util.Scanner;

public class remove{
    public static void main(String args[]){
        //declaring variables
        Scanner scan = new Scanner(System.in);
        String sentence, word;
        //inputs
        System.out.println("Enter a sentence: ");
        sentence = scan.nextLine();
        System.out.println("Enter a word: ");
        word = scan.nextLine();
        //replacing the word with no space 
        System.out.println(sentence.replace(word + " ", ""));
        
    }
}
