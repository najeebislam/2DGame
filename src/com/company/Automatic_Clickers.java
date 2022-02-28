package com.company;

import static java.lang.Math.round;

public class Automatic_Clickers {
    public String Name;
    public int Currency_per_Second;
    public int Add_to_Click_Damage;
    public int Amount_owned;
    public int BaseCost;
    public int Rate_Of_Increase_to_cost;
    public int Level;
    public int CurrentCost;

    public Automatic_Clickers(String name, int currency_per_Second, int add_to_Click_Damage, int amount_owned, int baseCost, int rate_Of_Increase_to_cost, int level,int currentCost) {
        Name = name;
        Currency_per_Second = currency_per_Second;
        Add_to_Click_Damage = add_to_Click_Damage;
        Amount_owned = amount_owned;
        BaseCost = baseCost;
        Rate_Of_Increase_to_cost = rate_Of_Increase_to_cost;
        Level = level;
        CurrentCost = currentCost;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getCurrency_per_Second() {
        return Currency_per_Second;
    }

    public void setCurrency_per_Second(int currency_per_Second) {
        Currency_per_Second = currency_per_Second;
    }

    public int getAdd_to_Click_Damage() {
        return Add_to_Click_Damage;
    }

    public void setAdd_to_Click_Damage(int add_to_Click_Damage) {
        Add_to_Click_Damage = add_to_Click_Damage;
    }

    public int getAmount_owned() {
        return Amount_owned;
    }

    public void setAmount_owned(int amount_owned) {
        Amount_owned = amount_owned;
    }

    public int getBaseCost() {
        return BaseCost;
    }

    public void setBaseCost(int baseCost) {
        BaseCost = baseCost;
    }

    public int getRate_Of_Increase_to_cost() {
        return Rate_Of_Increase_to_cost;
    }

    public void setRate_Of_Increase_to_cost(int rate_Of_Increase_to_cost) {
        Rate_Of_Increase_to_cost = rate_Of_Increase_to_cost;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getCurrentCost() {
        return CurrentCost;
    }

    public void setCurrentCost(int currentCost) {
        CurrentCost = currentCost;
    }

    public void updateCost(){
        setCurrentCost(round(getBaseCost()*getRate_Of_Increase_to_cost()^getAmount_owned()));
    }
}
