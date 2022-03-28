package com.company;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {


    //Screen Settings
    //final int originalTileSize = 32;  //32x32 tile
    final int scale = 2;

    //final int tileSize = originalTileSize * scale; //64x64 tile
    final int maxScreenCol = 32;
    final int maxScreenRow = 12;
    final int screenWidth = 1280;
    final int screenHeight = 720;

    public GamePanel () {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);

        Icon buttonIcon = new ImageIcon("C:\\Users\\NI211044\\IdeaProjects\\2DGame1\\src\\com\\company\\grenade.png");
        JButton grenadeButton = new JButton(buttonIcon);
        grenadeButton.setSize(100,100);
        grenadeButton.setBounds(540,350,250,250);
        add(grenadeButton);
        
        
        int Clicks = 0;
        JLabel ClickCounter = new JLabel("Clicks" + 0);
        ClickCounter.setSize(100,100);
        ClickCounter.setBounds(540, 100, 300, 250);
        add(ClickCounter);




        setLayout(new BorderLayout());
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\NI211044\\IdeaProjects\\2DGame1\\src\\com\\company\\wallpaper_2.jpg"));
        add(background);

        background.setLayout(new FlowLayout());















        //JFrame buttonFrame = new JFrame();
        //Main.window.add(grenadeButton);
        //Main.window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Main.window.setLocationByPlatform(true);
        //buttonFrame.setSize(500, 300);
        //buttonFrame.setVisible(true);
    }

}

