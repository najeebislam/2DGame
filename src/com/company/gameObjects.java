package com.company;
import com.company.gameObjects;
import com.company.playerStats;


import java.util.ArrayList;

public class gameObjects {
    public static playerStats CreatePlayerObject(ArrayList<Integer>amount) {
        playerStats Player = new playerStats(1, 1, 0, amount);
        return Player;
    }

}
