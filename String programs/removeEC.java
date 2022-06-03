//Mia Escoto 
//removing words that appear more than once 

import java.util.Scanner;

public class removeEC{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //declaring variables
        String sentence, output = "";
        String words[];
        //get input
        System.out.println("Enter a sentence: ");
        //assign to sentence
        sentence = scan.nextLine().toLowerCase();
        //splitting the words into an array 
        words = sentence.split(" ");
        //iterate over array to find repeating words
        for(int i = 0; i < words.length; i++){
            //next one in the array
            for(int j = i + 1; j < words.length; j++){
                if(words[i].equals(words[j])) {
                    words[j] = "repeat";
                }
            }
        }
        
        //make it back to a string
        for(String word: words){
            if(word != "repeat"){
                output = output + word + " ";
            }
        }
        
        //print it out 
        System.out.println(output);
    }
} 