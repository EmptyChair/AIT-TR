package Temp_Hold.lesson_002_CurrencyConverter;

import java.util.Scanner;

public class L2 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("WELCOME TO CURRENCY CONVERTER (TM)!\n\n");
        // declare value - "currency" to store which currency
        int currency;
        System.out.println("Please select YOUR CURRENCY:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. USD (US Dollar)");
        System.out.println("3. TR (Turkish Lira)\n\n");
        // read and store currency value
        currency = userInput.nextInt();
        // declare value - "original_sum" to store how much of that currency
        double original_sum;
        System.out.println("Please provide the SUM:\n\n");
        // read and store original_sum value
        original_sum = userInput.nextDouble();
        // declare value - "new_currency" to store new currency be converted TO
        int new_currency;
        System.out.println("Please select NEW CURRENCY to which you wish to convert your money to:");
        System.out.println("1. EUR (Euro)");
        System.out.println("2. USD (US Dollar)");
        System.out.println("3. TR (Turkish Lira)\n\n");
        // read and store new_currency value as higher order value
        new_currency = userInput.nextInt();
        // add new currency (10,20,30) to old currency (1,2,3)
        new_currency = 10*new_currency+currency;
        // this way new_currency means:
        // 11 EUR to EUR
        // 12 USD to EUR
        // 13 TL to EUR
        // 21 EUR to USD
        // 22 USD to USD
        // 23 TL to USD
        // 31 EUR to TL
        // 32 USD to TL
        // 33 TL to TL

        // switch board for calculations and output
        switch (new_currency) {
            // 11 EUR to EUR
            // 12 USD to EUR
            // 13 TL to EUR
            case 11:
                System.out.println("You can't convert Euro to Euro, silly!");
                break;
            case 12:
                System.out.println("The sum of "+original_sum+" USD equals "+original_sum*0.92+" EUR");
                break;
            case 13:
                System.out.println("The sum of "+original_sum+" Turkish liras equals "+original_sum*0.03+" EUR");
                break;
            // 21 EUR to USD
            // 22 USD to USD
            // 23 TL to USD
            case 21:
                System.out.println("The sum of "+original_sum+" EUR equals "+original_sum*1.09+" USD");
                break;
            case 22:
                System.out.println("You can't convert USD to USD, silly!");
                break;
            case 23:
                System.out.println("The sum of "+original_sum+" Turkish liras equals "+original_sum*0.033+" USD");
                break;
            // 31 EUR to TL
            // 32 USD to TL
            // 33 TL to TL
            case 31:
                System.out.println("The sum of "+original_sum+" EUR equals "+original_sum*32.80+" Turkish liras");
                break;
            case 32:
                System.out.println("The sum of "+original_sum+" USD equals "+original_sum*30.16+" Turkish liras");
                break;
            case 33:
                System.out.println("Alas, no conversion of liras to liras.");
                break;
            // and default to catch stuff
            default:
                System.out.println("Sorry, no conversion of other currencies!");
                break;
        }

    }

}
