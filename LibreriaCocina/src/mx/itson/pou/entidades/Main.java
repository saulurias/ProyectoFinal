/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.entidades;

import java.util.List;
import mx.itson.pou.negocio.Comida;
import mx.itson.pou.persistencia.PersistenciaCocina;

/**
 *  Entidad utilizada para realizar pruebas
 * @author SaulUrias
 */
public class Main {
    public static void main(String[] args) {
        
        PersistenciaCocina persistenciaCocina = new PersistenciaCocina();
        
        List<Producto> productos = persistenciaCocina.obtenerComida();
        
        
        Producto hamburguesa = productos.get(0);

        Pou pou = persistenciaCocina.obtenerPou();

        Comida comida = new Comida();
        
        
        comida.Comer(hamburguesa, pou);
        
        System.out.println("El pou tiene: " + pou.getValorHambre() + " de hambre y le quedan " + hamburguesa.getCantidad() + " " + hamburguesa.getNombre() );
        System.out.println("A pou le quedan " + hamburguesa.getCantidad() + " Hamburguesas");
        
        comida.Comprar(hamburguesa, pou);
        System.out.println("Pou compro una hamburguesa y ahora tiene: " + hamburguesa.getCantidad());
        
 
    }
}
