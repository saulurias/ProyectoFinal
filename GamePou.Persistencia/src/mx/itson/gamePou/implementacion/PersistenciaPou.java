/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import mx.itson.gamePou.entidades.Conexion;
import mx.itson.gamePou.entidades.Pou;
import mx.itson.gamePou.interfaz.IPouPersistencia;

/**
 *  Implementacion que posee los metodos de Pou
 * @author SaulUrias
 */
public class PersistenciaPou implements IPouPersistencia{
    Connection conn = Conexion.conexion();
    
    /**
     * Metodo que modifica los valores de pou despues en la base de datos
     * @param pou 
     */
    @Override
   public void actualizarPou(Pou pou){
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
       }
   }
    
    /**
    * Metodo utilizado para obtener el Pou que se tiene guardado en la BD
    * @return 
    */
    @Override
   public Pou obtenerPou(){
      Pou pou = null;
 
       try {
            String query = "SELECT * FROM pou;";
          try (Statement st = conn.createStatement()) {
              ResultSet rs = st.executeQuery(query);
              
              while (rs.next()) {
                  pou = new Pou(rs.getInt("dinero"),
                          rs.getInt("valorHambre"),
                          rs.getInt("valorSalud"),
                          rs.getInt("valorEnergia"),
                          rs.getInt("valorFelicidad"));
              }
          }
             
            return pou;
            
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al momento de obtener los valores de Pou");
       }
       return pou; 
   }
 
}
