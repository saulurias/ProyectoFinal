/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.interfaz;

import mx.itson.libreriaPou.entidades.Pou;
import mx.itson.libreriaPou.entidades.Producto;
import mx.itson.libreriaPou.entidades.RegistroInventario;

/**
 *  Interface que posee los metodos del negocio de Producto
 * @author SaulUrias
 */
public interface IPouNegocio {
    /**
     * Metodo utilizado para consumir un producto, La cantidad de producto debe ser mayor a 0
     * @param registro
     * @param pou
     */
    public void consumir(RegistroInventario registro, Pou pou);
    
    /**
     * Metodo utilizado para comprarle producto a Pou
     * @param producto
     * @param pou
     */
    public void comprar(Producto producto, Pou pou);
 
    
}
