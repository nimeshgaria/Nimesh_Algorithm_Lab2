package org.example.client;

import org.example.service.CurrencyService;

public class CurrencyClient {
    public static void main(String[] args) {
        CurrencyService  currencyService = new CurrencyService();
        int[] denominators = new int[] {500,200,100,50,20,10};
        currencyService.denominatorService(denominators,3650);
    }
}
