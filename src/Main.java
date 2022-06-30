import CoinCalc.Coin;
import CoinCalc.CoinFactory.CoinFactory;
import CoinCalc.CoinFactory.Coins;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


import CoinCalc.LogsWriter.LogsWriter;
import CoinCalc.Result.Result;

public class Main {
    public static void main(String[] args) throws IOException {


        ArrayList<Double> result = new ArrayList<>(); //Array names result that contains all currency converter results

        String answer;
        //Present first screen with welcome
        System.out.println("Welcome to currency converter");
        System.out.println("Please choose an option (1/2):");


        do {
            //Present first screen without the welcome (if user choose Yes for another cycle so the screen show without welcome comments)
            System.out.println("1. Dollars to Shekels");
            System.out.println("2. Shekels to Dollars");

            Scanner selection = new Scanner(System.in); // create a Scanner object


            if (selection.hasNextDouble()) {
                double input = selection.nextDouble();

                //Second screen
                System.out.println("Please enter an amount to convert");
                double amount = selection.nextDouble();


                if (input == 1) {
                    Coin usdValue = CoinFactory.getCoinInstance(Coins.USD);
                    //  System.out.println(ilsValue.calculate(amount));
                    assert usdValue != null;
                    double value = usdValue.calculate(amount);

                    //third screen
                    System.out.println(value);

                    Result USD2ILS = new Result(value, "USD to ILS -->");
                    System.out.println(USD2ILS.getResult());
                    result.add(value); //add value to result array
                    LogsWriter.getInstance().writeToFile(USD2ILS.getResult());   //writes to txt file

                } else if (input == 2) {
                    Coin ilsValue = CoinFactory.getCoinInstance(Coins.ILS);
                    assert ilsValue != null;
                    double value = ilsValue.calculate(amount);

                    System.out.println(value);

                    Result ILS2USD = new Result(value, "ILS to USD -->");
                    System.out.println(ILS2USD.getResult());

                    result.add(value);
                    LogsWriter.getInstance().writeToFile(ILS2USD.getResult());


                } else {
                    System.out.println("invalid choice, please try again ");

                }
            }

                System.out.println("Would you like to start over?");
                        answer = selection.next();
            }
      while (answer.equals("Y") || answer.equals("y")) ;


        if (answer.equals("N") || answer.equals("n")) {
            System.out.println("Thanks for using currency converter");
            System.out.println("Your Currency Calculations" + result);
        } else {
            System.out.println("Invalid Choice, Please try again");

        }
    }
}