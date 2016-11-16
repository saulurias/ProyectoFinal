/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.negocio;

import javax.swing.JOptionPane;
import mx.itson.pou.entidades.Pou;
import mx.itson.pou.entidades.Producto;

/**
 * Entidad que posee los metodos que manejan el negocio del proyecto LibreriaKitchen
 * @author SaulUrias
 */
public class Comida  {
    /**
     * Metodo utilizado para Alimentar a Pou
     * La cantidad de comida debe ser mayor a 0
     * @param comida
     * @param pou 
     */
    public void Comer(Producto comida, Pou pou){
        
        if (comida.getCantidad() <= 0) {
            JOptionPane.showMessageDialog(null, "No hay suficiente comida");
        }else {
            /**
         * Se obtienen los valores que la comida contiene
         */
        int hambre = comida.getValorHambre();
        int salud = comida.getValorSalud();
        int energia = comida.getValorEnergia();
        int felicidad = comida.getValorFelicidad();
        
        /**
         * Se suman los valores de la comida a los valores de pou
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
        }else {
            pou.setValorHambre(hambrePou);
        }
        
        /**
         * Se asigna el valor de salud a Pou
         */
         if (saludPou >= 100) {
            pou.setValorSalud(100);
        }else {
            pou.setValorSalud(saludPou);
        }
        
        
        /**
         * Se asigna el energia de salud a Pou
         */
        if (energiaPou >= 100) {
            pou.setValorEnergia(100);
        }else{
            pou.setValorEnergia(energiaPou);
        }
        
        /**
         * Se asigna el felicidad de salud a Pou
         */
        if (felicidadPou >= 100){
            pou.setValorFelicidad(100);
        }else{
            pou.setValorFelicidad(felicidadPou);
        }
        
        
        //Restar la comida consumida
        int comidaRestante = comida.getCantidad()-1;
        
        if (comidaRestante <= 0) {
            comida.setCantidad(0);
        }else {
            comida.setCantidad(comidaRestante);
        }
        }
        
        
    
    }
    
    /**
     * Metodo utilizado para comprarle comida a Pou
     * @param comida
     * @param pou 
     */
    public void Comprar(Producto comida, Pou pou){
        /**
         * Se obtiene el costo del producto a comprar
         */
        int costoComida = comida.getCosto();
        /**
         * Se obtiene el dinero con el que cuenta Pou
         */
        int dinero = pou.getDinero();
        
        /**
         * Se obtiene la cantidad de objetos del producto 
         */
        int cantidadProducto = comida.getCantidad();
        
        
        /**
         * Se le asigna el dinero restante a Pou y se agrega la Comida 
         */
        if (costoComida > dinero) {
            JOptionPane.showMessageDialog(null, "Se necesita más dinero para comprar este objeto");
        }else {
            int totalDinero = dinero-costoComida;
            
            pou.setDinero(totalDinero);
            
            int totalComida = comida.getCantidad()+1;
            
            comida.setCantidad(totalComida);
        }
    }

    
}
