//Mia Escoto 
//makes the actual game for hangman 

import TurtleGraphics.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class game{
    public static void Main(String args[]){
        //declaring variables
        boolean stop = false;
        Scanner scan = new Scanner(System.in);
        hangman hang = new hangman();
        Random rand = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        //declaring words/catagories/hints 
        ArrayList<String> catagories = new ArrayList<>(Arrays.asList("sports", "foods", "animals"));
        
        ArrayList<String> sports = new ArrayList<>(
            Arrays.asList("basketball", "volleyball", "baseball", "golf", "waterpolo", "soccer", "lacrosse", "swimming"));
        
        ArrayList<String>sportsHints = new ArrayList<> (
            Arrays.asList("NBA", "net", "homerun ", "club", "played in a pool", "goal", "cradle", "laps"));
        
        ArrayList<String> foods = new ArrayList<>
            (Arrays.asList("sushi", "pasta", "pizza", "hamburger", "cheeseburger", "hotdog", "steak", "salad", "eggs", "toast", "quesadilla", "tacos"));
        
        ArrayList<String> foodsHints = new ArrayList<> (
            Arrays.asList("type of japanese dish", "spagetti is a type of this", "it's very good with pepperoni", "buns", "cheese", "type of fair food", "cow meat", "mixed vegetables", 
            "comes from chickens", "bread", "cheese and tortilla", "type of mexican food" ));
            
        ArrayList<String> animals =  new ArrayList<> (
            Arrays.asList("birds", "dogs", "cats", "lion", "zebra", "eagle", "raccoon", "monkey", "lizard", "giraffe", "whale"));
            
        ArrayList<String> animalsHints = new ArrayList<> (
            Arrays.asList("they fly", "they bark", "they scratch", "has a mane", "they're striped", "they fly", "they're known as bandits", "close to a human", "reptile", "long neck", "lives in the ocean"));
        
        String intro = "Welcome to the hangman game.\nYou will be able to chose from given catagories. \nThen a randomly generated word from the given catagories will be presented" +
            "\nYou will be prompted to enter a letter until you get all the letters, or you get 7 wrong.\nYou will also have the option to guess the entire word. \nIf you are on your last guess you will be able to take a hint.\n";
        
        while(stop == false){
            //declaring variables
            SketchPadWindow pad = new SketchPadWindow(600, 800);
            StandardPen pen = new StandardPen(pad);
            String WORD;
            String spaces = "";
            String catagory;
            String guessedLetters = "";
            String message;
            String letter;
            int wordIndex;
            int Letterindex;  
            int wrong =0;
            int correct = 0;
            boolean wordGuessed = false;
            
           //draw gallows
            hang.drawGallow(pen);
            
            //print introduction to game
            System.out.println(intro);
            
            //take the catagory the user wants
            while(true){
                System.out.println("There are three catagories to play from: Sports, Foods, and Animals.\nPlease enter which you would like to play: ");
                catagory = scan.nextLine().toLowerCase().strip();
                if (catagories.contains(catagory))
                    break;
                System.out.println("This was not apart of the listed catagories. Please make sure it is and that your spelling is correct.\n");
            }
            
            //setting the word for the game
            ArrayList<String> words =  setCatagory(catagory,animals, sports, foods);
            wordIndex = rand.nextInt(words.size());
            WORD = words.get(wordIndex);
            
            ArrayList<String> hints = getHints(catagory, animalsHints,sportsHints, foodsHints);
            //make the spaces
            for( int i = 0; i<WORD.length(); i++)
                spaces = spaces.concat("_"); 
            
            
            //guess each letter
                while (wordGuessed == false && wrong !=7 && correct != -1 ){
                
                //prompting user
                System.out.println("\nSecret word: " + spaces + "\nGuess Letter: "); 
                //taking letter
                letter = scan.nextLine().toLowerCase().strip();
                Letterindex = WORD.indexOf(letter);
                int isLetter = alphabet.indexOf(letter);
                //checking if the letter is in the word
                boolean guessed = inWord(letter, WORD, Letterindex);
                //checking if its repeated
                boolean repeat = repeated(letter, guessedLetters);
                if (letter.length() != 1 || isLetter == -1){
                    //checking that the user actually entered something
                    System.out.println("Please enter one letter.\nGuess Again\n");
                    continue;
                }
                else if (guessed == false && repeat == false){
                    //if its wrong tally goes up
                    wrong++;
                    guessedLetters = guessedLetters.concat(letter);
                    drawNext(hang, pen, wrong);
                    message = "wrong \nGuesses left: " + (7-wrong);
                }
                else if(repeat == true){
                    System.out.println("You already guessed this letter\nGuess Again\n");
                    continue;
                }
                
                else{
                    // if its right then rewrite the stars and add letter
                    spaces = addLetter(letter, WORD, spaces);
                    guessedLetters = guessedLetters.concat(letter);
                    message = "correct!\n";
                }
                //print the results
                System.out.println("\nGuess Letter: " + letter + "\n" + message + "\n" + spaces + "\n" );
                correct = spaces.indexOf("_");
                if (wrong == 5)
                    giveHints(scan, wordIndex, hints);
                if (correct != -1 && wrong < 7){
                    wordGuessed = guessWord(scan, WORD, wordGuessed);
                }
            }
            //printing out the results
            printMessage(wrong, correct, WORD);
            
            //checking if the user wants to end and printing out the ending message
            stop = endProgram(scan, stop);       
        }          
    }
    public static boolean guessWord(Scanner scan, String WORD, boolean guessed){
        //allowing the user to guess the word
        while (true){
            System.out.println("Would you like to guess the word?\nWarning if you guess incorrectly you lose\nenter yes or no: ");
            String answer = scan.nextLine().toLowerCase().strip();
            if (answer.equals("yes")){
                guessed = true; 
                System.out.println("Guess word: ");
                String guess = scan.nextLine().toLowerCase().strip();
                if(guess.equals(WORD)){
                    printMessage(0, -1, WORD);
                }
                else
                    printMessage(7, 0,WORD);
            }
            else if (answer.equals("no"))
                System.out.println("\nokay. keep guessing\n");
            else{
                System.out.println("\nPlease enter yes or no\n");
                continue;
            }
            break;
        }
        return guessed;
    }
        public static boolean repeated(String letter, String wrongLetters){
        //checks if there is any repeated letters
        int repeat = wrongLetters.indexOf(letter);
        if (repeat == -1)
            return false;
        else
            return true;
    }
    public static void printMessage(int wrong, int correct, String WORD){
        //prints out the end message
        if(wrong ==7)
            //if they got 7 wrong
            System.out.println("You lost\nThe word was: " + WORD);
        else if(correct == -1)
        //if they guessed the word
            System.out.println("You guessed it!\nThe word was: "+ WORD);       
    }
    public static boolean inWord(String letter, String WORD, int check){
        //checking if the letter is in the string 
        if (check == -1)
            return false;
        else
            return true;
    }   
    public static String addLetter(String letter, String WORD, String spaces){
        //find where letter is
        int index = WORD.indexOf(letter);
        //make sub without it on both sides
            while (index != -1){
            String sub1 = spaces.substring(0, index);
            //add it to where it was
            String sub2 = spaces.substring(index+1, WORD.length());
            spaces = sub1 + letter + sub2;
            //check if the letter is there multiple times
            index = WORD.indexOf(letter, index + 1);
        }
        return spaces;
    }
        public static boolean endProgram(Scanner scan, boolean stop){
        //checks if the user would like to try again 
        System.out.println("Would you like to play again?\nEnter -1 if you wish to quit or any key to continue: ");
        String quit = scan.nextLine().strip();
        stop = quit.equals("-1"); 
        if(stop == true)
            System.out.println("Game ended. Thank you for playing.");
        return stop;
    }
    public static ArrayList setCatagory(String catagory, ArrayList<String> animals, ArrayList<String> sports, ArrayList<String> foods){
        //returning the array of words that the user chose
        if (catagory.equals("animals")){
            return animals;
        }
        else if (catagory.equals("sports")){
            return sports;
        }
        else{
            return foods;
        }
    }
    public static ArrayList getHints(String catagory, ArrayList<String> animalsHints, ArrayList<String> sportsHints, ArrayList<String> foodsHints){
        //returning the hint array depending on the catagory being used
        if (catagory.equals("animals")){
            return animalsHints;
        }
        else if (catagory.equals("sports")){
            return sportsHints;
        }
        else{
            return foodsHints;
        }
    }
    public static void giveHints(Scanner scan, int wordIndex, ArrayList<String> hints){
        //giving the user hints 
        String response; 
        String hint = hints.get(wordIndex);
        while (true){
            System.out.println("It seems like you need help. Would you like to take a hint? \nEnter yes or no:");
            response = scan.nextLine().toLowerCase().strip();
            if (response.equals("no"))
                System.out.println("ok. keep guessing.");
            else if (response.equals("yes"))
                System.out.println("Your hint: " + hint);
            else{
                System.out.println("Please enter either yes or no");
                continue;
            }
            break;
        }
    }
    public static void drawNext(hangman hang, StandardPen pen, int wrong){
        //draws each part of the hangman depending on how many wrong guesses they have 
        if (wrong == 1){
            //draw head
            hang.drawHat(pen);
            hang.drawHead(pen);
        }
        else if(wrong ==2){
            //draw eyes and ears
            hang.drawRightEye(pen);
            hang.drawLeftEye(pen);
            hang.drawRightEar(pen);
            hang.drawLeftEar(pen);
            hang.drawRightEarring(pen);
            hang.drawLeftEarring(pen);
        }
        else if(wrong ==3){
            //draw nose and mouth
            hang.drawNose(pen);
            hang.drawMouth(pen);
            hang.drawTeeth(pen);
        }
        else if(wrong ==4){
            //draw the body
            hang.drawBody(pen);
        }
        else if(wrong ==5){
            //draw arms
            hang.drawRightArm(pen);
            hang.drawLeftArm(pen);
            hang.drawTop(pen);
            hang.drawButtons(pen);
        }
        else if(wrong ==6){
            hang.drawRightLeg(pen);
            hang.drawLeftLeg(pen);
            hang.drawRightFoot(pen);
            hang.drawLeftFoot(pen);
            hang.drawPants(pen);
        }
        else{
            hang.drawGlasses(pen);
            hang.drawRightSandal(pen);
            hang.drawLeftSandal(pen);
        }
    }
}


