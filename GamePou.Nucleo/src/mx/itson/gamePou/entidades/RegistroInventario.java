/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.entidades;

/**
 *
 * @author SaulUrias
 */
public class RegistroInventario {
    private Producto producro;
    private int cantidad;

    public RegistroInventario(Producto producro, int cantidad) {
        this.producro = producro;
        this.cantidad = cantidad;
    }
    
    public Producto getProducro() {
        return producro;
    }

    public void setProducro(Producto producro) {
        this.producro = producro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
    
}
