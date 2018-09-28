/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cosettur.helpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author evazquez
 */
public class ConnectionManager {
        
    private static String url = "jdbc:mysql://201.150.40.239:3306/COSSETURdb?zeroDateTimeBehavior=convertToNull";    
    private static String driverName = "com.mysql.jdbc.Driver";   
    private static String username = "root";   
    private static String password = "AGIvft17330";
    private static Connection con;
    private static String urlstring;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            try {
                con = DriverManager.getConnection(url, username, password);
                con.setAutoCommit(false);
                System.out.println("Conexión con éxito: ");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
            ex.printStackTrace();//Se imprimiera el trazado de pila

        }
        return con;
    }
    
}
