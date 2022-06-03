//Mia Escoto 
//count how many words

import java.util.Scanner;

public class wordCount{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        //declare variables
        String sentence;
        int words = 0;
        int index = 0;
        //get an input
        System.out.println("Enter a sentence: ");
        sentence = scan.nextLine();
        //iterating over each letter
        for (int i = 0; i < sentence.length(); i++){
            //checking the index of the spaces
            index = sentence.indexOf(" ", i);
            //setting index to past the first space index
            i = index+1;
            if (index > 0){
                words += 1;
            }
        }
        //output
        System.out.println("there are " +words+ " words");
    }
}

   
 