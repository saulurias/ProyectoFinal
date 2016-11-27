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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.libreriaPou.entidades.Conexion;
import mx.itson.libreriaPou.entidades.Pou;
import mx.itson.libreriaPou.entidades.Producto;
import mx.itson.libreriaPou.entidades.Seccion;
import mx.itson.libreriaPou.interfaz.PersistenciaPou;
import mx.itson.libreriaPou.interfaz.PersistenciaProducto;

/**
 * Implementacion que posee los metodos de la persistencia de Producto 
 * @author SaulUrias
 */
public class IProductoPersistencia implements PersistenciaProducto {
    Connection conn = Conexion.conexion();
    Seccion seccion;
    
    /**
    * Metodo que modifica los valores de producto en la base de datos
    * @param producto 
    */
    @Override
   public void actualizarProducto(Producto producto){
       try {
           String query = "UPDATE producto SET cantidad =" + producto.getCantidad() +" WHERE producto.id = '"+ producto.getId() +"';";
                    
           PreparedStatement pst = conn.prepareStatement(query);
           pst.execute();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al modificar los valores de Producto");
       }
   }
   
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
                           rs.getInt("cantidad"),
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
      
      /**
     * Metodo utilizado para actualizar la información dentro de la base de datos
     * @param pou
     * @param producto 
     */
    public void actualizarBD(Pou pou, Producto producto){
            //Se editan los valores de Producto dentro de la base de datos
            PersistenciaProducto persistenciaProducto = new IProductoPersistencia();
            persistenciaProducto.actualizarProducto(producto);
            
            //Se editan los valores de Pou dentro de la base de datos
            PersistenciaPou persistenciaPou = new IPouPersistencia();
            persistenciaPou.actualizarPou(pou);
    }
    
}
