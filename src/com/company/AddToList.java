package com.company;

import java.util.ArrayList;
import java.util.List;

public class AddToList {
    static int couunter = 1;
    List<String> list = new ArrayList<>();
    public void addTo(Currency from,Currency to, double ammountIn, double ammountOut){

        list.add("Tranzakcja " + couunter++ + " wymiana:"+ammountOut +" "+ from.getName() +
                " na :" +ammountIn+" " +to.getName());

    }

    public void showList(){

        for (String excgangeList : list){
            System.out.println(excgangeList);
        }
    }
}
