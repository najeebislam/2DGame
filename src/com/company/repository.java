package com.company;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class repository {

    private static final String DatabaseLocation = System.getProperty("players.dir") + "\\2DGame.accdb";



    public static Connection getConnection() {
        try {
            Connection con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            return con;
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
        return null;
    }

    public static void updatePlayer(playerStats player) {
        try {
            String sql = "SELECT players.* FROM players where ID= '" + player.getID() + "'";
            Connection con = getConnection();
            ResultSet rs = executeSQL.executeQuery(con, sql);
            if (rs.next()) {
                //rs.moveToInsertRow();
                //Primary key not needed as it is an autonumber, it adds that field automatically
                rs.updateLong("players_curenncy", player.getCurrency());
                rs.updateString("players_itemOwned", player.toString());

                rs.updateRow();
            }
            con.close();
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
    }

}
