//Mia Escoto and Danny Mendelson
//this program is the central program to get the balance from the user and then let
//the user invest in either stocks or options
//once the user is finished with that, it will return them to this where they can repeat
//or end the process

//imports
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.NumberFormat;
import java.lang.String;

//class investments
public class invesments{
    //main
    public static void main(String args[]){
        //declaring and initializing objects and variables
        Scanner scan = new Scanner(System.in);
        stocks stocks = new stocks();
        futures futures = new futures();
        double balance;
        String investing;
        boolean run = true;
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        //getting balance
        balance = openProgram(scan, fmt);
        
        //main loop
        while(run == true){  
            while(true){
                System.out.println("Would you like to invest in stocks or futures? \n Enter 1 for stocks 2 for futures: ");
                investing = scan.next();
                if(investing.equals("1"))
                    balance = stocks.main(args, balance); //investing in stocks
                else if (investing.equals("2"))
                    balance = futures.main(args, balance); //investing in options
                else{
                    System.out.println("Enter 1 or 2 please \n");
                    continue; //checking
                }
                break;
                }
            run = endProgram(scan, balance); //seeing if user wants to end project
        }
    }
    //getting balance class
    public static double getBalance(Scanner scan, NumberFormat fmt){
        double balance;
        while(true){
            System.out.println("How much money will you be spending? The limit is $100,000. \n");
            balance = scan.nextDouble();
            if(balance > 0 && balance <= 100000) //checking for range
                break;
            System.out.println("Please enter a number in the price range.");
        }
        System.out.println("Balance: " + fmt.format(balance));
        return balance;
    }
    //ending program
    public static boolean endProgram(Scanner scan, double balance){
        boolean run;
        while (true){
            if (balance == 0){ 
                System.out.println("You ran out of money, you can no longer continue to invest.");
                run = false;
                break; //if ran out of money
            }
            System.out.println("Would you like to continue investing in futures and stocks? \n Enter 1 to continue 0 to quit: ");
            int answer = scan.nextInt();
            if (answer ==1)
                run = true; //more investing
            else if (answer ==0){
                run = false; //stop investing
            }   
            else{
                System.out.println("Please enter 1 or 0");
                continue; //check
            }
            break;
        }
        return run;
    }
    //introduction
    public static double openProgram(Scanner scan, NumberFormat fmt){
        int response;
        System.out.println("Hello! \nThis program will allow you to choose between buying&selling" 
        +" stocks and investing in futures\nYou will then enter your balance to invest."
        +"\nYou may keep investing until you want to stop or you have no money left \n \n ");
        double balance = getBalance(scan, fmt);
        return balance;
    }
}
