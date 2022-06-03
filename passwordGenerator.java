//Mia Escoto 
//4/4/22
//Generating a password for a website

import java.util.Scanner;
import java.util.ArrayList;

public class passwordGenerator{
    public static void main(String args[]){
        //declaring variables
        Scanner scan = new Scanner(System.in);
        String website = "";
        int isWebsite;
        String password;
        String PURPOSE = "\nThis program will generate a password for any website\n";
        String PROMPT = "Enter a website to generate a password for or -1 to quit: "; 
        ArrayList<String> websites = new ArrayList<String>();
        ArrayList<String> passwords = new ArrayList<String>();
        boolean stop = false;
        
        //Error checking
        while(true){
            //prompt user for the website
            System.out.println(PURPOSE + "website: ");
            website = scan.nextLine(); 
            //if it isn't a website 
            isWebsite = website.indexOf(".com");
            if (isWebsite == -1){
                //ask again
                System.out.println("input is not a website, ex: website.com");
                continue;
                }   
            break;
            }
        //add to array list
        websites.add(website);
        
        while (stop == false){
            //create the password
            password = addQuarter(addStar(replaceVowel(reverse(removeDot(website)))));
            //add password to password array list
            passwords.add(password);
            //print out the website and corresponding password
            System.out.println("website: " + website + "  password: " + password + "\n");
            //error checking
                while(true){
                //getting password
                System.out.println(PROMPT);
                website = scan.nextLine(); 
                //checking if its a website
                isWebsite = website.indexOf(".com");
                //checking if user wants to quit
                stop = website.equals("-1");
                //if the user doesnt want to quit but they didnt enter a password
                if (isWebsite == -1 && stop == false){
                    System.out.println("input is not a website, ex: website.com");
                    continue;
                    }   
                break;
            }
            //add it to website array list
            websites.add(website);
        }
        
        //printing out a list of ALL websites and passwords
        System.out.println("\nall websites and passwords: ");
        
        for (int i = 0; i < passwords.size(); i++){
            System.out.println(i+1 + "." + "  website: " + websites.get(i) + "  password: " + passwords.get(i));
        }
        System.out.println("End of program");
    }
        public static String removeDot(String word){
        //since replace cant be used twice, this function takes a substring before the dot and one after the dot and adds them together creating a new string without the dot.
        String temp = "";
        int dotIndex = word.indexOf('.');
        String subs1 = word.substring(0, dotIndex);
        String subs2 = word.substring(dotIndex+1, word.length());
        temp = temp.concat(subs1 + subs2);
        return temp;
    }
    public static String reverse(String word){
        //this function reverses the word by adding the characters in reverse order
        String temp = "";
         for (int i = 0; i < word.length(); i ++){
            char character = word.charAt(i);
            temp = character + temp;
        }
        return temp;
    }
    public static String replaceVowel(String word){
        //this function replaces every vowel with either an @ sign or an ! sign
        String temp = word;
        for(int i = 0; i < word.length(); i++){
                word = temp;
                char ch = word.charAt(i);
                if(ch == 'a' || ch == 'i' || ch =='u' )
                    temp = word.replace(ch, '@');
                else if(ch == 'e'|| ch == 'o')
                    temp = word.replace(ch, '!');
            }
        return temp;
    }
    public static String addStar(String word){
        //this function adds on 431 to the end of the current string 
        String temp = word.concat("431");
        return temp;
    } 
    public static String addQuarter(String word){
        // this function creates a new string of the first quarter of the word so far and adds it on to the back of the new word
        String temp = word.concat(word.substring(0, word.length()/4 ));
        return temp;
    }
}