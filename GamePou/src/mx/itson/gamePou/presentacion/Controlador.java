/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.presentacion;


import mx.itson.gamePou.entidades.Pou;
import mx.itson.gamePou.entidades.Seccion;
import mx.itson.gamePou.implementacion.PersistenciaPou;
import static mx.itson.gamePou.presentacion.Principal.panelPrincipal;


/**
 * Entidad utilizada para controlar los paneles y frame utilizados en el proyecto GamePou
 * @author soygo
 */
public class Controlador {
    PersistenciaPou persistencia = new PersistenciaPou();
    Pou pou = persistencia.obtenerPou();

    
    public Pou obtenerPou(){
        return pou;
    }

    
    /****************
     PANELES
     ****************/
    /**
     * Metodo utilizado para abrir la seccion Laboratorio
     */
    public void iniciarLaboratorio(){
        VistaLaboratorio ventana = new VistaLaboratorio();
        panelPrincipal.removeAll();
        panelPrincipal.add(ventana);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    /**
     * Metodo utilizado para abrir la seccion Cocina
     */
    public void iniciarCocina() {
        VistaCocina ventana = new VistaCocina();
        panelPrincipal.removeAll();
        panelPrincipal.add(ventana);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    /**
     * Metodo utilizado para abrir la seccion Cuarto
     */
    public void iniciarCuarto(){
        VistaCuarto ventana = new VistaCuarto();
        panelPrincipal.removeAll();
        panelPrincipal.add(ventana);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    /****************
     FRAMES
     ****************/
    /**
     * Metodo utilizado para abrir la Tienda dependiendo de la Seccion
     * @param seccion 
     */
    public void abrirTienda(Seccion seccion){
        Tienda tienda = new Tienda();
        tienda.setLocationRelativeTo(null);
        tienda.setVisible(true);
        tienda.obtenerProductosSeccion(seccion);
    }
    
    /**
     * Metodo utilizado para abrir el estante dependiendo de la Seccion
     * @param seccion 
     */
    public void abrirEstante(Seccion seccion){
        Estante est = new Estante();
        est.setLocationRelativeTo(null);
        est.setVisible(true);
        est.obtenerProductosSeccion(seccion);
    }

}
