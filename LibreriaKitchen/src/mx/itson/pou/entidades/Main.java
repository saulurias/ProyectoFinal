/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.entidades;

import mx.itson.pou.negocio.Comida;

/**
 *
 * @author SaulUrias
 */
public class Main {
    public static void main(String[] args) {
        Producto hamburguesa = new Producto("hamburguesa",100,20,0,-10,0,5);
        Pou pou = new Pou(5000,50,50,50,50);
        
        Comida comida = new Comida();
        
        
        comida.Comer(hamburguesa, pou);
        
        
        
        System.out.println("El pou tiene: " + pou.getValorHambre() + " de hambre y le quedan " + hamburguesa.getCantidad() + " " + hamburguesa.getNombre() );
        System.out.println("A pou le quedan " + hamburguesa.getCantidad() + " Hamburguesas");
        
        comida.Comprar(hamburguesa, pou);
        System.out.println("Pou compro una hamburguesa y ahora tiene: " + hamburguesa.getCantidad());
    }
}
