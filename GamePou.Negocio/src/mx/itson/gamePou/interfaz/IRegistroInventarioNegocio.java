/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.interfaz;

import mx.itson.gamePou.entidades.Pou;
import mx.itson.gamePou.entidades.RegistroInventario;


/**
 *
 * @author SaulUrias
 */
public interface IRegistroInventarioNegocio {
    public void consumir(RegistroInventario registro);
    public void comprar(RegistroInventario registro, Pou pou);
}
