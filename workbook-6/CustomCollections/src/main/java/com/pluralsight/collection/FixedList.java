package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList <T> {
    private List<T> items;
    private int maxSize;

   // private T numbers;
   // private T dates;



   /* void item(T numbers, T dates){
        this.numbers = numbers;
        this.dates = dates;
    }
*/


    public FixedList(int maxSize) {
        this.maxSize = 10;
        this.items = new ArrayList<>(maxSize);

    }

    public void add(T item){

        if (items.size() >= maxSize){
            items.add(null);
            return;
        }
        items.add(item);
    }


    public List<T> getItems(){
        return items;
    }
}
