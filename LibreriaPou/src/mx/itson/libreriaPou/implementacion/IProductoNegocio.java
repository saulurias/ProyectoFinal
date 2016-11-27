/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.implementacion;

import javax.swing.JOptionPane;
import mx.itson.libreriaPou.entidades.Pou;
import mx.itson.libreriaPou.entidades.Producto;
import mx.itson.libreriaPou.interfaz.NegocioProducto;
import mx.itson.libreriaPou.interfaz.PersistenciaProducto;


/**
 *
 * @author SaulUrias
 */
public class IProductoNegocio implements NegocioProducto{
    
    PersistenciaProducto persistenciaProducto = new IProductoPersistencia();
    
    
    /**
     * Metodo utilizado para Alimentar a PouLa cantidad de producto debe ser mayor a 0
     * @param producto
     * @param pou 
     */
    public void Consumir(Producto producto, Pou pou){
        
        if (producto.getCantidad() <= 0) {
            JOptionPane.showMessageDialog(null, "No hay suficiente producto");
        }else {
            /**
         * Se obtienen los valores que el producto tiene
         */
        int hambre = producto.getValorHambre();
        int salud = producto.getValorSalud();
        int energia = producto.getValorEnergia();
        int felicidad = producto.getValorFelicidad();
        
        
        /**
         * Se suman los valores del producto a los valores de pou
         */
        int hambrePou = (pou.getValorHambre()+hambre);
        int saludPou = (pou.getValorSalud()+salud);
        int energiaPou = (pou.getValorEnergia()+energia);
        int felicidadPou = (pou.getValorFelicidad()+felicidad);  
        
        
        
        /**
         * Se asigna el valor de hambre a Pou
         */
         if (hambrePou >= 100) {
            pou.setValorHambre(100);
        }else if (hambrePou <= 0) {
            pou.setValorHambre(0);
        }else {
            pou.setValorHambre(hambrePou);
        }
        
        /**
         * Se asigna el valor de salud a Pou
         */
         if (saludPou >= 100) {
            pou.setValorSalud(100);
        }else if (saludPou <= 0) {
            pou.setValorSalud(0);
        }else {
            pou.setValorSalud(saludPou);
        }
        
        
        /**
         * Se asigna el energia de salud a Pou
         */
        if (energiaPou >= 100) {
            pou.setValorEnergia(100);
        }else if (saludPou <= 0) {
            pou.setValorEnergia(0);
        }else {
            pou.setValorEnergia(saludPou);
        }
        
        /**
         * Se asigna el felicidad de salud a Pou
         */
        if (felicidadPou >= 100){
            pou.setValorFelicidad(100);
        }else if (felicidadPou <= 0) {
            pou.setValorFelicidad(0);
        }else {
            pou.setValorFelicidad(felicidadPou);
        }
        
        
        //Restar el producto consumido
        int comidaRestante = producto.getCantidad()-1;
        
        if (comidaRestante <= 0) {
            producto.setCantidad(0);
        }else {
            producto.setCantidad(comidaRestante);
        }
        
        /**
         * Se llama el metodo que actualiza la base de datos
         */
            persistenciaProducto.actualizarBD(pou, producto);
        
       }
    }
    
    /**
     * Metodo utilizado para comprarle producto a Pou
     * @param producto
     * @param pou 
     */
    @Override
    public void Comprar(Producto producto, Pou pou){
        /**
         * Se obtiene el costo del producto a comprar
         */
        int costoComida = producto.getCosto();
        /**
         * Se obtiene el dinero con el que cuenta Pou
         */
        int dinero = pou.getDinero();
        
        /**
         * Se obtiene la cantidad de objetos del producto 
         */
        int cantidadProducto = producto.getCantidad();

        /**
         * Se le asigna el dinero restante a Pou y se agrega el producto 
         */
        if (costoComida > dinero) {
            JOptionPane.showMessageDialog(null, "Se necesita más dinero para comprar este objeto");
        }else {
            int totalDinero = dinero-costoComida;
            
            pou.setDinero(totalDinero);
            
            int totalComida = producto.getCantidad()+1;
            
            producto.setCantidad(totalComida);
            
            
            /**
            * Se llama el metodo que actualiza la base de datos
            */
            persistenciaProducto.actualizarBD(pou, producto);
        }  
    }
    
    
    
}
