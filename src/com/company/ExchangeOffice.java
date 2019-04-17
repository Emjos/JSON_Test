package com.company;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExchangeOffice {

private Map<Currency,Double> avaibleFunds;
AddToList addToList = new AddToList();
AddToFile addToFile = new AddToFile();
public  ExchangeOffice(double startFunds){
    this.avaibleFunds = new HashMap<>();
    for (Currency c: Currency.values()){
        this.avaibleFunds.put(c, startFunds);

        }
    }
    public void showFunds(){
        System.out.print("Current Funds: ");
        for (Map.Entry<Currency,Double> entry:avaibleFunds.entrySet()){
            System.out.print(entry.getValue() +" "+ entry.getKey().getName()+"  ");
        }
        System.out.println();
    }

    public void exchange(double amount,Currency from,Currency to) throws IOException {
        double avaible = avaibleFunds.get(to);
        double needed = amount * 0.8 * CurrencyConventer.convert(from,to);
        if (avaible >= needed){
            avaibleFunds.put(from, avaibleFunds.get(from)+amount);
            avaibleFunds.put(to, avaibleFunds.get(to) + -needed);
            System.out.println("Exchanging " + amount + " " + from.getName()
            + "to " + needed + " "  + to.getName());
            addToList.addTo(from,to,needed,amount);
            addToFile.AddFile(from,to,needed,amount);
        }
        else {
            System.out.println("Cannot exchange " + amount + " " + from.getName()
                    + "to " + needed + " "  + to.getName());
        }

    }

    public void showList(){
    addToList.showList();
    }
    public void deleteList(){
    addToFile.cleanList();
    }
    public void loadFromFile(){
    addToFile.loadList();
    }
}


