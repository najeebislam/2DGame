package com.company;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.company.gameObjects.*;
import com.company.playerStats.*;
import com.company.Automatic_Clickers.*;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


import static com.company.gameObjects.*;


public class Main {


    public static void main(String[] args) {
        // creates timer task
        /*
        Timer t = new Timer();
        TimerTask tt = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Task Timer on Fixed Rate");
            };
        };
        t.scheduleAtFixedRate(tt,new Date(),1000);

         */



        ArrayList<Integer> AutomaticClickersOwned = new ArrayList<>();
        ArrayList<Automatic_Clickers> AutomaticClickersList = new ArrayList<>();
        playerStats player = new playerStats(0,0,0,AutomaticClickersOwned,1);

        ArrayList<Automatic_Clickers> AutomaticClickerArray= CreateAutomaticClickers();
        AutomaticClickersOwned = AmountOfAutomaticClickers(AutomaticClickerArray);
        player = CreatePlayerObject(AutomaticClickersOwned);
        System.out.println(player.toString());






        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setResizable(true);
        window.setTitle("Smash Those Explosives!");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();




        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}





