/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.presentacion;

import mx.itson.pou.entidades.Pou;
import mx.itson.pou.persistencia.Persistencia;
import static mx.itson.pou.presentacion.Principal.panelPrincipal;

/**
 *
 * @author soygo
 */
public class Controlador {
    Persistencia persistencia = new Persistencia();
    Pou pou = persistencia.obtenerPou();
    
    public Pou obtenerPou(){
        return pou;
    }
    
    /****************
     PANELES
     ****************/
    public void IniciarLaboratorio(){
        VistaLaboratorio ventana = new VistaLaboratorio();
        panelPrincipal.removeAll();
        panelPrincipal.add(ventana);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    public void IniciarSalaDeJuego(){
        VistaSalaDeJuego ventana = new VistaSalaDeJuego();
        panelPrincipal.removeAll();
        panelPrincipal.add(ventana);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
        
    }
    
    public void IniciarCocina() {
        VistaCocina ventana = new VistaCocina();
        panelPrincipal.removeAll();
        panelPrincipal.add(ventana);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    public void IniciarCuarto(){
        VistaCuarto ventana = new VistaCuarto();
        panelPrincipal.removeAll();
        panelPrincipal.add(ventana);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    /****************
     FRAMES
     ****************/
    public void AbrirTienda(){
        Tienda tienda = new Tienda();
        tienda.setLocationRelativeTo(null);
        tienda.setSize(500, 500);
        tienda.setVisible(true);
    }
    
    public void AbrirRefrigerador(){
        EstanteRefrigerador est = new EstanteRefrigerador();
        est.setLocationRelativeTo(null);
        est.setSize(369, 297);
        est.setVisible(true);
    }
}
