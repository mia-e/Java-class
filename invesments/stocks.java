//Mia Escoto
//stock market 
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.text.NumberFormat;
public class stocks{
    public static double main(String args[], double balance){
        //objects
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        //declare variables 
        ArrayList<String> companies = new ArrayList<>
            (Arrays.asList("walmart", "apple", "microsoft", "disney", "netflix", "amazon", "nike", "google", "tesla"));
        ArrayList<Integer> companyPrice = new ArrayList<>
            (Arrays.asList(156, 158, 272, 116, 201, 2791, 122, 2384, 901));
        
        String stock;
        int stockRate;
        int stockPrice;
        boolean repeat = false;
        boolean run = true;
        double percent;
        String response;
        double MIN = 116;
          
        System.out.println("Welcome to the stock market!\n");
            while(run == true){
            ArrayList<String> ownedStocks = new ArrayList<>();
            //print stocks
            double startingBalance = balance;
            double balanceDiff = 0;
            while(true){
                for(int i = 0; i < companies.size(); i++){
                    System.out.println((i+1) + ". " + companies.get(i)) ;
                }
                System.out.println("How many stocks would you like to buy?");
                int buying = scan.nextInt();
                if (buying < 0){
                    System.out.print("\nYou can't buy 0 stocks");
                    continue;
                }
                for(int i = 0; i < buying; i++){
                    if (balance < MIN){
                        System.out.println("You can't afford to buy more stock");
                        break;
                    }
                    stock = getStock(scan, companies, ownedStocks);
                    stockPrice = getStockPrice(stock, companies, companyPrice);
                    while (true){
                        System.out.print("\nYour balance: "+fmt.format( balance) + "\nYou chose to buy a stock of "+ stock +"\bThe price is: "+ fmt.format(stockPrice)+ 
                            "\nAre you sure you would like to purchase this stock?\nenter yes or no: " );
                        response = scan.next().toLowerCase().strip();
                        if(response.equals("yes")){
                            //if they want to buy it
                            if(stockPrice > balance){
                                //check if they can afford it 
                               System.out.println("\nThis is out of your price range please choose another stock.");
                               buying ++;
                               }
                           else{
                               //take it out of their balance and adding the stock to total stocks bought
                               balance -= stockPrice;
                                ownedStocks.add(stock);
                                System.out.println("\nStock bought.\npurchase: " + stock);
                                }
                            break;
                           }    
                        else if (response.equals("no")){
                            //cancel request
                            System.out.println("\nRequest Cancelled");
                            System.out.println("choose another stock");
                            buying ++; 
                            break;
                        }
                        else{
                            System.out.println("\nPlease enter yes or no");
                            buying ++;
                        }
                    }
                }
                break;
            }
            
            if (ownedStocks.size() > 0)
                System.out.println("\nStock interst: ");
            
            for (int i = 0; i < ownedStocks.size(); i++){
                stockPrice = getStockPrice(ownedStocks.get(i), companies, companyPrice);
                percent = getPercent(rand);
                String sign = getSign(percent);
                System.out.println(ownedStocks.get(i) + ": " + sign + percent + "%");
                balanceDiff += stockInterest(percent, stockPrice);
            }
            //add or subtract the gains or losses from/to balance.
            balance += balanceDiff;
            
            closeMarket(startingBalance, balance, fmt);
            
            run = endProgram(scan, balance, MIN);
            //print out programs end. 
            
        }
        return balance;
    }
    public static String getStock(Scanner scan, ArrayList<String> companies, ArrayList<String> ownedStock){
        while(true){
            String stock;
            System.out.println();
            
            System.out.println("what stock would you like to buy? (enter a name of a stock)");
            stock = scan.next().toLowerCase().strip();
            if (companies.contains(stock) == false){
                System.out.println("enter one of the companies listed.");
                continue;
            }
            else if(ownedStock.contains(stock)){
                System.out.println("You already purchased this stock.");
                continue;
            }
            return stock;
        }
    }
    public static int getStockPrice(String stock, ArrayList<String> companies, ArrayList<Integer> companyPrice){
        //getting stock price 
        int price;
        int index = companies.indexOf(stock);
        price = companyPrice.get(index);
        return price;
    }
    public static double getPercent(Random rand){
        //randomizing new stock price
        double percent = rand.nextInt(201) - 100;
        double percent2 = percent/100;
        return percent2;
    }
    public static String getSign(double percent){
        //get the percent sign 
        if (percent > 0)
            return "+";
        else    
            return "";
    }
    public static double stockInterest(double percent, int stockPrice){
        //final change in price
        double change = stockPrice * percent;
        double newValue = stockPrice + change; 
        newValue = Math.round(newValue * 100) /100;
        return newValue;
    }
    public static void closeMarket(double startingBalance, double balance, NumberFormat fmt){
        //return the results 
        if(balance < startingBalance){
            double lost = startingBalance - balance;
            System.out.println("You lost "+  fmt.format(lost));
        }
        if (balance > startingBalance){
            double gained = balance - startingBalance;
            System.out.println("You gained "+ fmt.format(gained));
        }
        System.out.println("\nYour Balance " + fmt.format(balance));
        System.out.println("market closed.\n");
    }
    public static boolean endProgram(Scanner scan, double balance, double MIN){
        //checking if the user wants to continue or end
        boolean end;
        while(true){
            if (balance < MIN){
                System.out.println("Program ended.\n");
                end = false;
                break;
            }
            else{
                System.out.println("Would you like to keep investing in stocks?\nenter yes or no");
                String response = scan.next().toLowerCase();
                if (response.equals("yes"))
                    end = true;
                else if (response.equals("no")){
                    end = false;
                    System.out.println("Program ended.\n");
                }
                else{
                    System.out.println("enter yes or no.\n");
                    continue;
                }
                break;
                }
        }
        return end;
        }
}
