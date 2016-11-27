/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.interfaz;

import mx.itson.libreriaPou.entidades.Pou;
import mx.itson.libreriaPou.entidades.Producto;

/**
 *
 * @author SaulUrias
 */
public interface NegocioProducto {
    /**
     * Metodo utilizado para Consumir un producto, La cantidad de producto debe ser mayor a 0
     * @param producto
     * @param pou 
     */
    public void Consumir(Producto producto, Pou pou);
    
    /**
     * Metodo utilizado para comprarle producto a Pou
     * @param producto
     * @param pou 
     */
    public void Comprar(Producto producto, Pou pou);
 
    
}
