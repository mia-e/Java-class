//Futures - Danny and Mia
/*   the purpose of this program is to trade futures while simulating their prices using string functions, 
array lists, loops, if/else statements, scanners, random, and format   */

//imports
import java.util.*;
import java.text.NumberFormat;

public class futures{
    public static double main(String args[], double daily){
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        //declaring and initializing main variables and list
        NumberFormat fmt =  NumberFormat.getCurrencyInstance();       
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        double newBalance = daily;
        //learning about options
        System.out.println("Press 1 if you would like to learn about futures. Press any other number if not. \n");
        double t = scan.nextDouble();
        if(t==1)
            defi();        
        //master loop variable declaration and initializing
        int m = 0;        
        //start of master loop
        if (daily>0){
            while(m ==0){
                //options master loop
                System.out.println("Would you like to trade futures? 1 for yes or any other number for no \n");
                double decision = scan.nextInt();
                if(decision == 1 && newBalance>0){   
                    //declaring and initializing random prices
                    double priceOil = gen.nextInt(200)+50;
                    double priceWheat = gen.nextInt(100)+50;
                    double priceSilver = gen.nextInt(150)+50;;
                    double priceCoffeeBeans = gen.nextInt(10)+25;
                    double priceFur = gen.nextInt(1000)+2000;  
                    
                    //offering choices
                    System.out.println("Balance: " + fmt.format(newBalance));
                    System.out.println("1 week future options and prices: \nCrude Oil (per gallon)- " + fmt.format(priceOil));
                    System.out.println("Wheat- " + fmt.format(priceWheat));
                    System.out.println("Silver- " + fmt.format(priceSilver));
                    System.out.println("Coffee Beans- " + fmt.format(priceCoffeeBeans));
                    System.out.println("Mongoose Fur- " + fmt.format(priceFur));                
                    
                    //what investment
                    while(true){
                        System.out.println("\nType the number for the future you would like to purchase?\n 1. Crude Oil \n 2. Wheat \n 3. Silver \n 4.Coffee Beans \n 5. Mongoose Fur");
                        int pick = scan.nextInt();
                        //start of simulation
                        if(numbers.contains(pick)){                   
                            if(pick == 1){
                                newBalance = picking("Crude Oil", newBalance, priceOil, gen, scan, fmt);
                                break; //oil
                            }
                            if(pick == 2){
                                newBalance =picking("Wheat", newBalance, priceWheat, gen, scan, fmt);     
                                break; //wheat  
                            }
                            if(pick == 3){
                                newBalance = picking("Silver", newBalance, priceSilver, gen, scan, fmt); 
                                break; //silver     
                            }
                            if(pick == 4){
                                newBalance = picking("Coffee Beans", newBalance, priceCoffeeBeans, gen, scan, fmt); 
                                break; //coffee beans                     
                            }
                            if(pick == 5){
                                newBalance = picking("Mongoose Fur", newBalance, priceFur, gen, scan, fmt);  
                                break; //mongoose fur
                            }
                        }
                        else{
                            System.out.println("Incorrect. Choose again and make sure to choose a correct number.");
                        }
                    }                    
                }
                else if(newBalance <= 0){
                    System.out.println("You are out of money.");
                    end();
                    m++;
                }
                //ending the program
                else{
                    end();
                    m++; //ending master loop
                }                   
            }
        }
        //end of main
        return newBalance;
    }
    public static void intro(String args[]){
        //instructions
        System.out.println("Welcome to trading futures." +
        "Here you will have the ability to bet on commodity prices and either make a gain or loss of them");
        System.out.println("This simulator will allow you to pick a future to invest in and simulate its movement within 5 days of trading.");
        System.out.println("After 5 days, your future will automatically be sold.");
    }
    public static void defi(){
        //definition of options and examlpe
        System.out.println("A future is a contract between two parties that entitles to trader to bet on the future price of a commodity.");
        System.out.println("Based on things such as current events, the supply and demand of the product might change, therefoe affecting its price.");
        System.out.println("For example, right now oil futures are skyrocketing due to the Ukraine conflict. There is a shorter supply for a greater demand.");
    }
    public static double picking(String option, double daily, double prices1, Random gen, Scanner scan, NumberFormat fmt ){
        //picking and simulating the trade
        
        //calculating random percent fluctuation
        double percent = gen.nextInt(201) - 100;
        double realPercent = percent/100;
        
        //calculating new share price adjusted to new percent
       double price2 = (realPercent*prices1) + prices1;
       double nummy = numberOfFutures(daily, prices1, scan);
       
       //calculating new balance
       double newBalance = daily - (prices1*nummy) + price2*nummy;
       //if gained money
       if(price2>prices1){
           double gain = price2-prices1;
           System.out.println("Net Gain/contract: " + fmt.format(gain) + "  Original Price: " + fmt.format(prices1) + "  New Price: " + fmt.format(price2) + "  New Balance: " + fmt.format(newBalance) + "\n");
        }
        //if lost money
        else{
           double gain = prices1-price2;
           System.out.println("Net Loss/contract: " + fmt.format(gain) + "  Original Price: " + fmt.format(prices1) + "  New Price: " + fmt.format(price2) +  "  New Balance: " + fmt.format(newBalance) + "\n");
        }
        return newBalance;
    }
    public static double numberOfFutures(double daily, double prices1, Scanner scan){
        //how many shares user will invest
        double max= daily/prices1;
        double numF;
        while(true){
            System.out.println("How many contracts would you like to buy? The maximum number of contracts you can purchase is: " + max);
            numF = scan.nextDouble();
            //cant invest more than max number of shares
            if(numF <= max && numF > 0)
                break;           
            else
               System.out.println("Incorrect Quantity");                          
        }
        return numF; //returning number of futures able to purchase
    }
    public static void end(){
        //end function
        System.out.println("END OF TRADING FUTURES");
    }
}