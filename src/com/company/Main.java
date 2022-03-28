package com.company;
import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;



public class Main {
    public static JFrame window = new JFrame();
    public static void main(String[] args) {


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





