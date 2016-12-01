/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.implementacion;

import javax.swing.JOptionPane;
import mx.itson.gamePou.entidades.Pou;
import mx.itson.gamePou.entidades.RegistroInventario;
import mx.itson.gamePou.interfaz.IRegistroInventarioNegocio;
import mx.itson.gamePou.interfaz.IRegistroInventarioPersistencia;

/**
 *
 * @author SaulUrias
 */
public class NegocioRegistroInventario implements IRegistroInventarioNegocio{

    IRegistroInventarioPersistencia registroInventarioPersistencia = new PersistenciaRegistroInventario();
    
    @Override
    public void consumir(RegistroInventario registro) {
        if (registro.getCantidad() > 0) {
            int cantidad = registro.getCantidad();
            registro.setCantidad(cantidad-1);
            registroInventarioPersistencia.ActualizarRegistroInventario(registro);
        }else {
            JOptionPane.showMessageDialog(null, "No cuenta con este producto");
        }
    }

    @Override
    public void comprar(RegistroInventario registro, Pou pou) {
        int costoProducto = registro.getProducro().getCosto();
        if (pou.getDinero() > costoProducto) {
            int cantidad = registro.getCantidad();
            registro.setCantidad(cantidad+1);
            registroInventarioPersistencia.ActualizarRegistroInventario(registro);
        }else {
            JOptionPane.showMessageDialog(null, "Pou cuenta con $" + pou.getDinero() + "Y el producto cuesta " + costoProducto);
        }
    }

    
    
}
