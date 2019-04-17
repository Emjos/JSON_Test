package com.company;



import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {



        ExchangeOffice exchangeOffice = new ExchangeOffice(1000);

        exchangeOffice.exchange(13,Currency.CUP,Currency.PLN);
        exchangeOffice.exchange(12,Currency.EUR,Currency.PLN);
        exchangeOffice.exchange(11,Currency.USD,Currency.EUR);

        exchangeOffice.showList();

        exchangeOffice.loadFromFile();


        // poziom 1
        // 1.dopisz klase ktora bedzie rejesrowala kazda transakcje w array list
        //  Dopisz metode sprawdzajaca transakcje na koniec dnia
        // poziom 2
        // dopisz klase ktora bedzie rejestrowala kazda tranzakcje ale w pliku tekstowym
        // metoda ktora odczytuje z pliku i wyswietla

    }
}
