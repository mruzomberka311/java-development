package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio {
    private String name;
    private String owner;
    private List<Valuable> assets;

    public Portfolio(String name, String owner) {
        this.name = name;
        this.owner = owner;
        this.assets = new ArrayList<>();

    }

    public void add(Valuable asset){
        assets.add(asset);
    }

  public double getValue(){
    double finalValue = 0;
    for (Valuable asset : assets){
        finalValue += asset.getValue();
    }
    return finalValue;
  }
//Had trouble finding the max.
  public Valuable getMostValuable(){
    for (Valuable valuable : assets){
        Valuable max = assets.get
    }

  }

  public Valuable getLeastValuable(){

  }
}
