package software.ulpgc.moneycalculator;

//import software.ulpgc.moneycalculator.mock.*;
import software.ulpgc.moneycalculator.api.ApiCurrencyLoader;
import software.ulpgc.moneycalculator.api.ApiExchangeRateLoader;
import software.ulpgc.moneycalculator.model.Currency;

public class Main {
    public static void main(String[] args) {

        CurrencyLoader loader = new ApiCurrencyLoader();
        System.out.println(loader.load());

        ExchangeRateLoader rateLoader = new ApiExchangeRateLoader();
        rateLoader.load(new Currency("EUR","Euro"), new Currency("USD", "Dollar"));
    }
}
