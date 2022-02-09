package com.company;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {


    //Screen Settings
    final int originalTileSize = 32;  //32x32 tile
    final int scale = 2;

    final int tileSize = originalTileSize * scale; //64x64 tile
    final int maxScreenCol = 32;
    final int maxScreenRow = 12;
    final int screenWidth = 1600;
    final int screenHeight = 900;

    public GamePanel () {

        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true); //lol

    }

}

