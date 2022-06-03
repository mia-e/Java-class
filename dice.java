//Mia Escoto
//rolls dice returns each roll and total roll

import java.util.Random;


public class dice{
    public static void main(String args[]){
        //object
        Random rand = new Random();
        //roll die
        int roll1 = rand.nextInt(7) +1;
        int roll2 = rand.nextInt(7) +1;
        //add the rolls
        int totalRoll = roll1 + roll2;
        //print out all rolls
        System.out.println("First Roll: " +roll1);
        System.out.println("Second Roll: " +roll2);
        System.out.println("Total Roll: "+ totalRoll);
    }
}