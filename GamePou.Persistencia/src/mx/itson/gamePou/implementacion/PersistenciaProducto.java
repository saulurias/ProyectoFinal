/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.implementacion;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.gamePou.entidades.Conexion;
import mx.itson.gamePou.entidades.Producto;
import mx.itson.gamePou.entidades.Seccion;
import mx.itson.gamePou.interfaz.IProductoPersistencia;

/**
 * Implementacion que posee los metodos de la persistencia de Producto 
 * @author SaulUrias
 */
public class PersistenciaProducto implements IProductoPersistencia {
    Connection conn = Conexion.conexion();
    Seccion seccion;

   
    /**
     * Metodo utilizado para obtener la lista de productos que se encuentran guardados dentro de la Base de Datos
     * @return 
     */
    @Override
      public List<Producto> obtenerProductos(){
       List<Producto> productos = new ArrayList();
       
       try {
           
            String query = "SELECT * FROM producto;";
           try (Statement st = conn.createStatement()) {
               ResultSet rs = st.executeQuery(query);
               
               while (rs.next()) {
                   
                   //Enumerador que define la seccion del producto
                   seccion = Seccion.valueOf(rs.getString("seccion"));
                   
                   //Hambre salued energia felicidad
                   Producto p = new Producto(rs.getInt("id"),
                           rs.getString("nombre"),
                           rs.getInt("costo"),
                           rs.getInt("valorHambre"),
                           rs.getInt("valorSalud"),
                           rs.getInt("valorEnergia"),
                           rs.getInt("valorFelicidad"),
                           seccion);
                   productos.add(p);
               }
           }
             
            return productos;
            
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al momento de consultar la lista de Productos");
       }
       
       
       return productos;
   }

    
}
