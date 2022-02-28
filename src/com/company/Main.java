package com.company;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import com.company.gameObjects.*;
import com.company.playerStats.*;
import com.company.Automatic_Clickers.*;

import static com.company.gameObjects.*;


public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> AutomaticClickersOwned = new ArrayList<>();
        ArrayList<Automatic_Clickers> AutomaticClickersList = new ArrayList<>();
        playerStats player = new playerStats(0,0,0,AutomaticClickersOwned);

        ArrayList<Automatic_Clickers> AutomaticClickerArray= CreateAutomaticClickers();
        AutomaticClickersOwned = AmountOfAutomaticClickers(AutomaticClickerArray);
        player = CreatePlayerObject(AutomaticClickersOwned);



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





