/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.entidades;

/**
 *  Enumerador que define la seccion de Producto
 * @author SaulUrias
 */
public enum Seccion {
    COCINA(1),
    CUARTO(2),
    LABORATORIO(3);
    
    private final int valor;
    
    Seccion(int valor){
        this.valor = valor;
    }
    
    public int getValor() {
	return valor;
    }
    
}
