package com.company;
import java.sql.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;

public class repository {
    private static final String DatabaseLocation = System.getProperty("user.dir") + "\\ProjectManagment.accdb";
    private static Connection con;
    public static Connection getConnection() {
        try {
            con = DriverManager.getConnection("jdbc:ucanaccess://" + DatabaseLocation, "", "");
            return con;
        } catch (Exception e) {
            System.out.println("Error in the repository class: " + e);
        }
        return null;
        //https://github.com/julieheard/projectManager/blob/master/src/main/resources/helpful%20links.txt
    }

}
