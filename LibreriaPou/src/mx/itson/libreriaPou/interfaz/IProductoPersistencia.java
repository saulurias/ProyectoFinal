/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.interfaz;

import java.util.List;
import mx.itson.libreriaPou.entidades.Producto;

/**
 * Interface que posee los metodos de persistencia de Producto
 * @author SaulUrias
 */
public interface IProductoPersistencia {
    /**
     * Metodo utilizado para obtener la lista de productos que se encuentran guardados dentro de la Base de Datos
     * @return 
     */
    public List<Producto> obtenerProductos();
   
}
