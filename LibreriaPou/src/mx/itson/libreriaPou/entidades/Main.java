/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.entidades;

import java.util.List;
import mx.itson.libreriaPou.implementacion.IPouPersistencia;
import mx.itson.libreriaPou.implementacion.IProductoNegocio;
import mx.itson.libreriaPou.implementacion.IProductoPersistencia;
import mx.itson.libreriaPou.interfaz.NegocioProducto;
import mx.itson.libreriaPou.interfaz.PersistenciaPou;
import mx.itson.libreriaPou.interfaz.PersistenciaProducto;

/**
 *  Entidad utilizada para realizar pruebas
 * @author SaulUrias
 */
public class Main {
    public static void main(String[] args) {
        
        PersistenciaProducto persistenciaProducto = (PersistenciaProducto) new IProductoPersistencia();
        PersistenciaPou persistenciaPou = new IPouPersistencia();
        
        List<Producto> productos = persistenciaProducto.obtenerProductos();
        
        
        Producto hamburguesa = productos.get(0);

        Pou pou = persistenciaPou.obtenerPou();

        
        
        NegocioProducto comida = new IProductoNegocio();
        
        
        comida.Consumir(hamburguesa, pou);
        
        System.out.println("El pou tiene: " + pou.getValorHambre() + " de hambre y le quedan " + hamburguesa.getCantidad() + " " + hamburguesa.getNombre() );
        System.out.println("A pou le quedan " + hamburguesa.getCantidad() + " Hamburguesas");
        
        comida.Comprar(hamburguesa, pou);
        System.out.println("Pou compro una hamburguesa y ahora tiene: " + hamburguesa.getCantidad());
        
 
    }
}
