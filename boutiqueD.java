//Mia Escoto 
//boutiqueD: printing out salesmen who sold between 50-100

import java.util.Scanner;


public class boutiqueD{
    public static void main(String args[]){
        //declaring 
        Scanner scan = new Scanner(System.in);
        int idNum;
        int itemsSold;
        int itemValue;
        int ITEM_MIN = 50;
        int ITEM_MAX = 100;
        int QUIT = -1;
        String ID_PROMPT = "Enter an ID number or -1 to quit.";
        
        System.out.println("Enter id number: ");
        idNum = scan.nextInt();
        
        while(idNum != QUIT){
            //inoput values
            System.out.println("Number of items sold: ");
            itemsSold = scan.nextInt();
            
            System.out.println("Enter item value: ");
            itemValue = scan.nextInt();
            
            //determine high performer
            idNum = detail(scan, ID_PROMPT, idNum, itemsSold, ITEM_MIN, ITEM_MAX);
            
            //priming reed

        }
        finish();
    }
    public static int detail(Scanner scan, String ID_PROMPT, int idNum, int itemsSold, int ITEM_MIN, int ITEM_MAX){
        if (itemsSold > ITEM_MIN && itemsSold < ITEM_MAX) 
        //print out id
            System.out.println(idNum);
        System.out.println(ID_PROMPT + "\nEnter id number: ");
        idNum = scan.nextInt();
        return idNum;
    }
    public static void finish(){
        System.out.println("End of program.");
    }
} 