package DAO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anton
 */
import java.sql.*;
import javax.swing.JOptionPane;
public class DBConnect {
    Connection conn;
    
    public static Connection ConnectDB()
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:E:\\Learning(WIT)\\Java Project HOT\\RestaurantApp\\RestaurantDB.sqlite");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
