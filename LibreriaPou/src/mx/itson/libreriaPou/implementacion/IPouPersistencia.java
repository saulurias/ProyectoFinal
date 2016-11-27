/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import mx.itson.libreriaPou.entidades.Conexion;
import mx.itson.libreriaPou.entidades.Pou;
import mx.itson.libreriaPou.interfaz.PersistenciaPou;

/**
 *
 * @author SaulUrias
 */
public class IPouPersistencia implements PersistenciaPou{
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
           JOptionPane.showMessageDialog(null, "Error al momento de cambiar los valores de Pou");
           ex.printStackTrace();
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
               pou = new Pou(rs.getInt("dinero"),
                       rs.getInt("valorHambre"),
                       rs.getInt("valorSalud"),
                       rs.getInt("valorEnergia"),
                       rs.getInt("valorFelicidad"));
           }
            
             st.close();
             
            return pou;
            
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al momento de obtener los valores de Pou");
           ex.printStackTrace();
       }
       return pou; 
   }
 
}
