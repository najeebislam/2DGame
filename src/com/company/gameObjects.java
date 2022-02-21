package com.company;

import com.company.playerStats;
import com.company.Automatic_Clickers;


import java.util.ArrayList;

public class gameObjects {
    // interlile the player
    public static playerStats CreatePlayerObject(ArrayList<Integer>amount) {
        playerStats Player = new playerStats(0, 1, 0, amount);
        return Player;
    }
    // creats a list of the objects levels
    public static ArrayList<Automatic_Clickers>  Array_automatic_Clickers_add (Automatic_Clickers NewObject ,ArrayList<Automatic_Clickers> CurrentObjects ){
        CurrentObjects.add(NewObject);
        return CurrentObjects;

    }

    // amount gained per second
    public static int amountGainPerSecond (ArrayList<Automatic_Clickers> CurrentObjects){
        int amountGain = 0;
        for (int i = 0; i < CurrentObjects.size(); i++) {
            int Amount = CurrentObjects.get(i).getAmount_owned();
            int Currency_per_Second = CurrentObjects.get(i).getCurrency_per_Second();
            amountGain = amountGain +(Amount*Currency_per_Second);
        }
        return amountGain;


    }
    // gives amount given on click

    public static int amountGainOnCLick (ArrayList<Automatic_Clickers> CurrentObjects){
        int amountGain = 0;
        for (int i = 0; i < CurrentObjects.size(); i++) {
            int Amount = CurrentObjects.get(i).getAmount_owned();
            int  Add_to_Click_Damage= CurrentObjects.get(i).getAdd_to_Click_Damage();
            amountGain = amountGain +(Amount*Add_to_Click_Damage);
        }
        return amountGain;


    }

}
