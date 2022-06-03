//Mia Escoto
//program has a secret word and user has to guess letters if they're in the word

import java.util.Scanner;
 
public class guessWord{
    public static void main(String args[]){
        //declare variables
        Scanner scan = new Scanner(System.in);
        String WORD = "mouse";
        String stars = "";    
        String letter;
        int GUESS_LIMIT;
        int correct = 0;
        int index;
        int wrong =0;
        String message;
        //show length of the word
        for( int i = 0; i<WORD.length(); i++)
            stars = stars.concat("*");
        

        while ( wrong !=7 && correct != -1){
            //prompting user
            System.out.println("Secret word: " + stars + "\nGuess Letter: "); 
            //taking letter
            letter = scan.nextLine().toLowerCase();
            index = WORD.indexOf(letter);
            //checking if the letter is in the word
            boolean guessed = inWord(letter, WORD, index);
            if (guessed == false){
                //if its wrong tally goes up
                wrong++;
                message = "wrong \ncounter: " + wrong;
            }
            else{
                // if its right then rewrite the stars and add letter
                stars = addLetter(letter, WORD, stars);
                message = "correct! \nindex: " + index;
            }
            //print the results
            System.out.println("\nGuess Letter: " + letter + "\n" + message + "\n" + stars + "\n" );
            correct = stars.indexOf("*");

        }
        if(wrong ==7)
            //if they got 7 wrong
            System.out.println("You lost");
        else if(correct == -1)
        //if they guessed the word
            System.out.println("You guessed it!");
    }
    public static boolean inWord(String letter, String WORD, int check){
        //checking if the letter is in the string 
        if (check == -1)
            return false;
        else
            return true;
    }   
    public static String addLetter(String letter, String WORD, String stars){
        //find where letter is
        int index = WORD.indexOf(letter);
        //make sub without it on both sides
        String sub1 = stars.substring(0, index);
        //add it to where it was
        String sub2 = stars.substring(index+1, WORD.length());
        stars = sub1 + letter + sub2;
        return stars;
    }
    }
