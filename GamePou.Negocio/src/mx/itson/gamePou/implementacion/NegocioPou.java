/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.implementacion;

import javax.swing.JOptionPane;
import mx.itson.gamePou.entidades.Pou;
import mx.itson.gamePou.entidades.Producto;
import mx.itson.gamePou.entidades.RegistroInventario;
import mx.itson.gamePou.interfaz.IPouNegocio;
import mx.itson.gamePou.interfaz.IPouPersistencia;
import mx.itson.gamePou.interfaz.IProductoPersistencia;


/**
 * Implementacion que posee los metodos del negocio de Producto
 * @author SaulUrias
 */
public class NegocioPou implements IPouNegocio{
    
    IProductoPersistencia persistenciaProducto = new PersistenciaProducto();
    IPouPersistencia persistenciaPou = new PersistenciaPou();
    
    /**
     * Metodo utilizado para Alimentar a PouLa cantidad de registro debe ser mayor a 0
     * @param registro
     * @param pou 
     */
    @Override
    public void consumir(RegistroInventario registro, Pou pou){
        
        if (registro.getCantidad() <= 0) {
            JOptionPane.showMessageDialog(null, "No hay suficiente producto");
        }else {
         /**
         * Se obtienen los valores que el producto tiene
         */
        int hambre = registro.getProducro().getValorHambre();
        int salud = registro.getProducro().getValorSalud();
        int energia = registro.getProducro().getValorEnergia();
        int felicidad = registro.getProducro().getValorFelicidad();
        
        
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
         * Se asigna el energia a Pou
         */
        if (energiaPou >= 100) {
            pou.setValorEnergia(100);
        }else if (saludPou <= 0) {
            pou.setValorEnergia(0);
        }else {
            pou.setValorEnergia(energiaPou);
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

        /**
         * Se llama el metodo que actualiza la base de datos
         */
            persistenciaPou.actualizarPou(pou);
            //LO QUE AHORA SE VA A ACTUALIZAR ES EL REGISTROINVENTARIO
            //persistenciaProducto.actualizarProducto(registro);
      
       }
    }
    
    /**
     * Metodo utilizado para comprarle producto a Pou
     * @param producto
     * @param pou 
     */
    @Override
    public void comprar(Producto producto, Pou pou){
        /**
         * Se obtiene el costo del producto a comprar
         */
        int costoProducto = producto.getCosto();
        /**
         * Se obtiene el dinero con el que cuenta Pou
         */
        int dinero = pou.getDinero();
        
        

        /**
         * Se le asigna el dinero restante a Pou 
         */
        if (costoProducto > dinero) {
            JOptionPane.showMessageDialog(null, "Se necesita más dinero para comprar este producto");
        } else {
            int totalDinero = dinero-costoProducto;
            
            pou.setDinero(totalDinero);

            /**
             * Se llama el metodo que actualiza la base de datos
             */
            persistenciaPou.actualizarPou(pou);
            //AHORA SE VA A ACTUALIZAR EL REGISTRO
            //persistenciaProducto.actualizarProducto(producto);
        }  
    }
    
    
    
}
