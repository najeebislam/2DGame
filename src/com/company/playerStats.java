package com.company;
import java.util.ArrayList;
public class playerStats {
    public long Currency;
    public int Click_Power;
    public int Total_Currency_per_second;
    public ArrayList<Integer> ObjectOwned ;

    public playerStats(long currency, int click_Power, int total_Currency_per_second, ArrayList<Integer> objectOwned) {
        Currency = currency;
        Click_Power = click_Power;
        Total_Currency_per_second = total_Currency_per_second;
        ObjectOwned= objectOwned;
    }

    public long getCurrency() {
        return Currency;
    }

    public void setCurrency(long currency) {
        Currency = currency;
    }

    public int getClick_Power() {
        return Click_Power;
    }

    public void setClick_Power(int click_Power) {
        Click_Power = click_Power;
    }

    public int getTotal_Currency_per_second() {
        return Total_Currency_per_second;
    }

    public void setTotal_Currency_per_second(int total_Currency_per_second) {
        Total_Currency_per_second = total_Currency_per_second;
    }

    public ArrayList<Integer> getObjectOwned() {
        return ObjectOwned;
    }

    public void setObjectOwned(ArrayList<Integer> objectOwned) {
        ObjectOwned = objectOwned;
    }
}
