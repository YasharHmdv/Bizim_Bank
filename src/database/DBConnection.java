/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class DBConnection { // Super class
    
    private final String HOST = "localhost";
    private final String PORT = "3306";
    private final String DATABASE_NAME = "bizim_bank";
    private final String USER = "root";
    private final String PASSWORD = "";
    
    protected Connection connection = null;
    protected Statement statement = null;

    public DBConnection() {
        String url = "jdbc:mysql://" + this.HOST + ":" + this.PORT + "/" + this.DATABASE_NAME;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            
            this.connection = DriverManager.getConnection(url, this.USER, this.PASSWORD);
            System.out.println("success");
            
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("unsucces");
        }
    }
    
    
}
