/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.interfaz;

import java.util.List;
import mx.itson.libreriaPou.entidades.RegistroInventario;

/**
 * Interface que posee los metodos de la entidad RegistroInventario
 * @author SaulUrias
 */
public interface IRegistroInventarioPersistencia {
    /**
     * Metodo utilizado para actualizar la información dentro de la tabla RegistroInventario en la base de datos
     * @param registro
     */
    public void ActualizarRegistroInventario(RegistroInventario registro);
    
    public List obtenerRegistrosInventario();
}
