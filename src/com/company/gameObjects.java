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
    // interlises the automatic clickers
    public static ArrayList<Automatic_Clickers> CreateAutomaticClickers(){
        Automatic_Clickers Grenade = new Automatic_Clickers("Grenade",1,1,0,1,1,1,0);
        Automatic_Clickers C4 = new Automatic_Clickers("C4",1,1,0,1,1,2,0);
        Automatic_Clickers ExplosiveSniper = new Automatic_Clickers("Explosive sniper ",1,1,0,1,1,3,0);
        Automatic_Clickers RPG = new Automatic_Clickers("RPG",1,1,0,1,1,4,0);
        Automatic_Clickers HomingMissile = new Automatic_Clickers("Homing missile",1,1,0,1,1,5,0);
        Automatic_Clickers TankCannon = new Automatic_Clickers("Tank Cannon",1,1,0,1,1,6,0);
        Automatic_Clickers Cannon = new Automatic_Clickers("Cannon",1,1,0,1,1,7,0);
        Automatic_Clickers ShipArtillery = new Automatic_Clickers("Ship artillery",1,1,0,1,1,8,0);
        Automatic_Clickers Howitzers = new Automatic_Clickers("Howitzers",1,1,0,1,1,9,0);
        Automatic_Clickers MissileLauncher = new Automatic_Clickers("Missile launcher",1,1,0,1,1,10,0);
        Automatic_Clickers AircraftBomb = new Automatic_Clickers("Aircraft bomb",1,1,0,1,1,11,0);
        Automatic_Clickers ICBMS = new Automatic_Clickers("ICBMS",1,1,0,1,1,12,0);
        Automatic_Clickers NuclearBomb = new Automatic_Clickers("Nuclear bomb",1,1,0,1,1,13,0);

        // add objects to list
        ArrayList<Automatic_Clickers> AutomaticClickersList = new ArrayList<>();
        AutomaticClickersList = Array_automatic_Clickers_add(Grenade,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(C4,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(ExplosiveSniper,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(RPG,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(HomingMissile,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(TankCannon,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(Cannon,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(ShipArtillery,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(Howitzers,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(MissileLauncher,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(AircraftBomb,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(ICBMS,AutomaticClickersList);
        AutomaticClickersList = Array_automatic_Clickers_add(NuclearBomb,AutomaticClickersList);

        return AutomaticClickersList;


    }

}
