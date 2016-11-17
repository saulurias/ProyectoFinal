/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import mx.itson.pou.entidades.Conexion;
import mx.itson.pou.entidades.Pou;
import mx.itson.pou.entidades.Producto;

/**
 *
 * @author SaulUrias
 */
public class PersistenciaCocina {
    
    Connection conn = Conexion.conexion();
   
    /**
     * Metodo que modifica los valores de pou despues en la base de datos
     * @param pou 
     */
   public void updatePou(Pou pou){
       try {
           String query = "UPDATE pou SET dinero = '"+pou.getDinero()+"',"
               + "valorHambre = '"+pou.getValorHambre()+"',"
               + "valorSalud = '"+pou.getValorSalud()+"',"
               + "valorEnergia = '"+pou.getValorEnergia()+"',"
               + "valorFelicidad = '"+pou.getValorFelicidad()+"';";

           PreparedStatement pst = conn.prepareStatement(query);
           pst.execute();
       } catch (SQLException ex) {
           
           Logger.getLogger(PersistenciaCocina.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
  
   /**
    * Metodo que modifica los valores de producto en la base de datos
    * @param comida 
    */
   public void updateComida(Producto comida){
       try {
           String query = "UPDATE producto SET cantidad =" + comida.getCantidad() +" WHERE producto.nombre = '"+ comida.getNombre() +"';";
                    
           PreparedStatement pst = conn.prepareStatement(query);
           pst.execute();
       } catch (SQLException ex) {
           
           Logger.getLogger(PersistenciaCocina.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   /**
    * Metodo utilizado para obtener el Pou que se tiene guardado en la BD
    * @return 
    */
   public Pou obtenerPou(){
      Pou pou = null;
       try {
            String query = "SELECT * FROM pou;";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {               
               pou = new Pou(rs.getInt("dinero"),rs.getInt("valorHambre"),rs.getInt("valorSalud"),rs.getInt("valorEnergia"),rs.getInt("valorFelicidad"));
           }
            
             st.close();
             
            return pou;
            
       } catch (SQLException ex) {
           Logger.getLogger(PersistenciaCocina.class.getName()).log(Level.SEVERE, null, ex);
       }
       return pou; 
   }
   
   public List<Producto> obtenerComida(){
       List<Producto> productos = new ArrayList();

       try {
            String query = "SELECT * FROM producto;";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            while (rs.next()) {     
               
                //Hambre salued energia felicidad
               Producto p = new Producto(rs.getString("nombre"),rs.getInt("costo"),rs.getInt("valorHambre"),rs.getInt("valorSalud"),rs.getInt("valorEnergia"),rs.getInt("valorFelicidad"),rs.getInt("cantidad")); 
               productos.add(p);
           }
            
             st.close();
             
            return productos;
            
       } catch (SQLException ex) {
           Logger.getLogger(PersistenciaCocina.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
       return productos;
   }
   
}
