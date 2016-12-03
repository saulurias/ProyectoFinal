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
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.gamePou.entidades.Conexion;
import mx.itson.gamePou.entidades.Producto;
import mx.itson.gamePou.entidades.RegistroInventario;
import mx.itson.gamePou.entidades.Seccion;
import mx.itson.gamePou.interfaz.IRegistroInventarioPersistencia;

/**
 * Clase que implementa los metodos de la interface 
 * @author SaulUrias
 */
public class PersistenciaRegistroInventario implements IRegistroInventarioPersistencia {

    Connection conn = Conexion.conexion();
    
    @Override
    public void ActualizarRegistroInventario(RegistroInventario registro) {
        try {
           String query = "UPDATE registroInventario SET cantidad =" + registro.getCantidad() +" WHERE idProducto = '"+ registro.getProducto().getId() +"';";
                    
           PreparedStatement pst = conn.prepareStatement(query);
           pst.execute();
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al modificar los valores de RegistroProducto");
       } catch (Exception e){
           JOptionPane.showMessageDialog(null, "Error al modificar los valores de RegistroProducto");
           e.printStackTrace();
       }
    }

    @Override
    public List obtenerRegistrosInventario() {
        Seccion seccion;
        List<RegistroInventario> registros = new ArrayList();
        try {
            String query = "SELECT p.id, p.nombre, p.costo, p.valorHambre, p.valorSalud, p.valorEnergia, p.valorFelicidad, registroInventario.cantidad, p.seccion "
                         + "FROM registroInventario INNER JOIN producto p ON p.id = registroInventario.idProducto;";
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
                    int cantidad = rs.getInt("cantidad");
                    
                    RegistroInventario registroInventario = new RegistroInventario(p, cantidad);
                    registros.add(registroInventario);
                    
                }
            }
            return registros;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al momento de consultar la lista de Productos");
        } catch (Exception e) {;
            e.printStackTrace();
        }
       return registros;
    }
    
    
}
