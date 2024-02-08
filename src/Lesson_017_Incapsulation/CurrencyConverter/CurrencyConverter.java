package Lesson_017_Incapsulation.CurrencyConverter;

public class CurrencyConverter {

    //two array parameters
    private String[] currencies;
    private double[] currencyRates;


    //IMPORTANT!
    //Since we have unknown number of currencies, we need 1 default currency
    //which will serve as a measure for all others
    //it will be the first currency[0] array element
    //its currencyRate[0] value will be set to 1 as, for example, a singular USD costs one USD
    //original currency will be re-calculated into default and then re-calculated again into new currency

    // GETTERS AND SETTERS


    public double[] getCurrencyRates() {
        return currencyRates;
    }

    public String[] getCurrencies() {
        return currencies;
    }

    public void setCurrencies(String[] currencies) {
        this.currencies = currencies;
    }

    public void setCurrencyRates(double[] currencyRates) {
        this.currencyRates = currencyRates;
    }

    //constructor default - no parameters given, so its old EUR/USD/LIRA
    public CurrencyConverter() {
        setCurrencies(new String[] {"EUR","USD", "TL"});
        setCurrencyRates(new double[] {1, 0.93, 0.03});
    }

    //constructor with a full set - currencies and rates
    public CurrencyConverter(String[] currencies, double[] currencyRates) {
        setCurrencies(currencies);
        setCurrencyRates(currencyRates);
    }

    //constructor with only rates - totally useless without actual currency names, but what the heck
    public CurrencyConverter(double[] currencyRates) {
        setCurrencies(null);
        setCurrencyRates(currencyRates);
    }

    // a method which converts currency
    // int origC is the number of original currency in the currency/currencyRates array
    // int newC is the number of new currency in the currency/currencyRates array
    // double origSum is the original sum
    // the method prints an announcement
    public void convert (int origC, int newC, double origSum ) {
        double result = 0;
        //original currency into default currency
        result = getCurrencyRates()[origC]*origSum;
        //default currency into new currency, basically by applying 1/rate in the array
        result = result/getCurrencyRates()[newC];
        System.out.println("#########################");
        System.out.println("NOW WITNESS THE CALCULATING POWER OF THIS FULLY CODED AND TESTED CURRENCY CALCULATOR!!!");
        System.out.println("The sum of "+origSum+" "+getCurrencies()[origC]+" equals "+result+" of "+getCurrencies()[newC]);
        System.out.println("#########################");
    }

    //a method which shows all the currencies and their rates
    public void showCurrencyList () {
        System.out.println("#########################");
        System.out.println("LIST OF CURRENCIES AND RATES");
        System.out.println(getCurrencies()[0]+" is the default currency, with an obvious rate of "+getCurrencyRates()[0]);
        System.out.println("Its rate to itself is supposed to be 1-to-1 for self-evident reasons.");
        for (int i=1; i<getCurrencies().length; i++) {
            System.out.println(getCurrencies()[i]+" has the going rate of "+getCurrencyRates()[i]+" to the "+getCurrencies()[0]);
        }
        System.out.println("#########################");
    }

    //intro methos
    public void intro () {
        System.out.println("#########################");
        System.out.println("WELCOME TO THE CURRENCY CONVERTER!");
        System.out.println("We calculate how much your old currency costs in new currency");
        System.out.println("You have to provide the name of the old currency from the list, the sum of the old currency and the name of the new currency on the list");
        System.out.println("The converter will continue automatically until you shut it down!");
        System.out.println("For shut down, type 'exit'");
        System.out.println("Enjoy!");
        System.out.println("#########################");
    }

    //a method which searches currency array for a currency which was provided in String form
    // if none is found, error message and shutdown
    public int findCurrency (String name) {
        int place = -1;
        // check if they didn't type exit
        if (name.equalsIgnoreCase("exit")) {
            System.out.println("Accepting exit command, shutting down!");
            System.out.println("Thank you for using our services and have a nice day!");
            //System.exit(-1);
            return place;
        }
        // search for currency with the same name
        for (int i=0; i<getCurrencies().length; i++) {
            if (getCurrencies()[i].equalsIgnoreCase(name)) {
                place = i;
                break;
            }
        }
        // if such currency was found - moving along
        // if not - GTFO
        if (place != -1) {
            return place;
        } else {
            System.out.println("We are sorry, your currency is not on the list!");
            System.out.println("Shutting down the system!");
            //System.exit(-1);
            return place;
        }
    }
}
