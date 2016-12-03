/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.entidades;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 * Entidad que posee el metodo de conexión hacia la base de datos
 * @author SaulUrias
 */
public class Conexion {
    
    static Connection conn = null;
    
    static{
        try {
             String url = "jdbc:mysql://localhost:3306"; 
             String nombreDb = "/poudb";
             String usuario = "readWrite";
             String contrasenia = "";
             conn = DriverManager.getConnection(url+nombreDb,usuario,contrasenia);
             System.out.println("Conectado a " + nombreDb);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se genero un error al momento de hacer la conección con la base de datos");
        }
    }
    
    public static Connection conexion(){
        return conn;
    }
}
