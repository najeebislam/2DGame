package com.company;

public class Automatic_Clickers {
    public String Name;
    public int Currency_per_Second;
    public int Add_to_Click_Damage;
    public int Amount_owned;
    public int BaseCost;
    public int Rate_Of_Increase_to_cost;

    public Automatic_Clickers(String name, int currency_per_Second, int add_to_Click_Damage, int amount_owned, int baseCost, int rate_Of_Increase_to_cost) {
        Name = name;
        Currency_per_Second = currency_per_Second;
        Add_to_Click_Damage = add_to_Click_Damage;
        Amount_owned = amount_owned;
        BaseCost = baseCost;
        Rate_Of_Increase_to_cost = rate_Of_Increase_to_cost;
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
}
