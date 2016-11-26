/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.libreriaPou.interfaz;

import mx.itson.libreriaPou.entidades.Pou;

/**
 *
 * @author SaulUrias
 */
public interface PersistenciaPou {
    /**
     * Metodo que modifica los valores de pou despues en la base de datos
     * @param pou 
     */
   public void updatePou(Pou pou);
   
   /**
    * Metodo utilizado para obtener el Pou que se tiene guardado en la BD
    * @return 
    */
   public Pou obtenerPou();
}
