package Lesson_015_OOP;

import java.util.Scanner;
public class Homework_15_CurrencyConvCli {
    public static void main(String[] args) {
        //Adding Rubles, Canadian Dollars, Swiss Francs, Pound Sterling to previous selection
        String[] currencies = new String[] {"EUR", "USD", "TL", "RUB", "CAD", "SWF", "GBP"};
        double[] currencyRates = new double[] {1, 0.93, 0.03, 0.01028, 0.69, 1.07, 1.17};

        //creating new currency converter and new scanner
        CurrencyConverter cc0 = new CurrencyConverter(currencies,currencyRates);
        Scanner userInput = new Scanner(System.in);
        Scanner userInput2 = new Scanner(System.in);
        String currencyName = null;
        double sum;
        int origC;
        int newC;

        //launch intro
        cc0.intro();

        do {
            //show the list
            cc0.showCurrencyList();

            //enter old currency
            System.out.println("Please enter your original currency (or exit):");
            currencyName = userInput.nextLine();
            origC = cc0.findCurrency(currencyName);

            //enter sum
            System.out.println("Please enter your sum of old currency:");
            sum = userInput.nextDouble();

            //Because apparently JAVA's nextDouble() does not consume the '\n'
            // so the next call to nextLine() consumes it and then it's waiting to read the input for y.
            // so it needs a damn mouth wash to keep running
            userInput.nextLine();

            //enter new currency
            System.out.println("Please enter your new currency (or exit):");
            currencyName = userInput2.nextLine();
            newC = cc0.findCurrency(currencyName);

            cc0.convert(origC,newC,sum);

        } while (!currencyName.equals("exit"));



        /* Testing corner
        //default converter
        CurrencyConverter cc1 = new CurrencyConverter();
        //covert 200 USD in turkish lira
        cc1.convert(1,2, 200);
        //show currency list
        cc1.showCurrencyList();
        //testing finding currency
        int a = cc1.findCurrency("USD");
        System.out.println(" USD is on the list in place "+a);
        int b = cc1.findCurrency("EUR");
        System.out.println(" EUR is on the list in place "+b);
        int c = cc1.findCurrency("DM");
        System.out.println(" DM is on the list in place "+c);

         */
    }
}
