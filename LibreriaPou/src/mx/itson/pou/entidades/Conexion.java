/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.entidades;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Entidad que posee el metodo de conexión hacia la base de datos
 * @author SaulUrias
 */
public class Conexion {
    
    static Connection conn = null;
    
    static{
        try {
             String url = "jdbc:mysql://localhost:3306"; 
             String dbName = "/poudb";
             String user = "root";
             String password = "WhiteFatalis252514";
             conn = DriverManager.getConnection(url+dbName,user,password);
             System.out.println("Conectado a " + dbName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Connection conexion(){
        return conn;
    }
}
