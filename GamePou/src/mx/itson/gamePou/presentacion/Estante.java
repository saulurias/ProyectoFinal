/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.presentacion;

import java.util.ArrayList;
import java.util.List;
import mx.itson.gamePou.entidades.RegistroInventario;
import mx.itson.gamePou.entidades.Seccion;
import mx.itson.gamePou.implementacion.PersistenciaRegistroInventario;
import mx.itson.gamePou.interfaz.IRegistroInventarioPersistencia;

/**
 * Frame utilizado para mostrar los productos que contiene el jugador en una Seccion
 * @author soygo
 */
public class Estante extends javax.swing.JFrame {

    /**
     * Creates new form EstanteRefrigerador
     */
    public Estante() {
        initComponents();
    }
    
    /**
     * Variables utilizadas en la ejecución del Estante
     */
   
    //NUEVOS ATRIBUTOS
    
    IRegistroInventarioPersistencia registroInventarioPersistencia = new PersistenciaRegistroInventario();
    List<RegistroInventario> registrosbd = registroInventarioPersistencia.obtenerRegistrosInventario();
    List<RegistroInventario> registros = new ArrayList();
    /**
     * Metodo utilizado para obtener los productos dependiendo la seccion
     * @param seccion 
     */
    public void obtenerProductosSeccion(Seccion seccion) {
        if (seccion == Seccion.COCINA) {
            for (int i = 0; i < registrosbd.size(); i++) {
                if (registrosbd.get(i).getProducro().getSeccion() == Seccion.COCINA) {
                    registros.add(registrosbd.get(i));
                }
            }
            mostrarProductos();
        }else if (seccion == Seccion.CUARTO){
            for (int i = 0; i < registrosbd.size(); i++) {
                if (registrosbd.get(i).getProducro().getSeccion() == Seccion.CUARTO) {
                    registros.add(registrosbd.get(i));
                }
            }
            mostrarProductosCuarto();
        }else if (seccion == Seccion.LABORATORIO){
            for (int i = 0; i < registrosbd.size(); i++) {
                if (registrosbd.get(i).getProducro().getSeccion() == Seccion.LABORATORIO) {
                    registros.add(registrosbd.get(i));
                }
            }
            mostrarProductos();
        }
    }
    
    /**
     * Metodo utilizado para mostrar los productos dentro del Estante
     */
    public void mostrarProductos(){
        
        lblPrimeraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(0).getProducro().getNombre()+".png")));
        lblPrimera.setText(registros.get(0).getProducro().getNombre() + " X " + registros.get(0).getCantidad());
        
        lblSegundaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(1).getProducro().getNombre()+".png")));
        lblSegunda.setText(registros.get(1).getProducro().getNombre() + " X " + registros.get(1).getCantidad());
        
        lblTerceraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(2).getProducro().getNombre()+".png")));
        lblTercera.setText(registros.get(2).getProducro().getNombre() + " X " + registros.get(2).getCantidad());
        
        lblCuartaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(3).getProducro().getNombre()+".png")));
        lblCuarta.setText(registros.get(3).getProducro().getNombre() + " X " + registros.get(3).getCantidad());
        
        lblQuintaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(4).getProducro().getNombre()+".png")));
        lblQuinta.setText(registros.get(4).getProducro().getNombre() + " X " + registros.get(4).getCantidad());
        
        lblSextaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(5).getProducro().getNombre()+".png")));
        lblSexta.setText(registros.get(5).getProducro().getNombre() + " X " + registros.get(5).getCantidad());
    }
    
    public void mostrarProductosCuarto(){
        lblPrimeraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(0).getProducro().getNombre()+"64.png")));
        lblPrimera.setText(registros.get(0).getProducro().getNombre());
        
        lblSegundaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(1).getProducro().getNombre()+"64.png")));
        lblSegunda.setText(registros.get(1).getProducro().getNombre());
        
        lblTerceraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(2).getProducro().getNombre()+"64.png")));
        lblTercera.setText(registros.get(2).getProducro().getNombre());
        
        lblCuartaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(3).getProducro().getNombre()+"64.png")));
        lblCuarta.setText(registros.get(3).getProducro().getNombre());
        
        lblQuintaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(4).getProducro().getNombre()+"64.png")));
        lblQuinta.setText(registros.get(4).getProducro().getNombre());
        
        lblSextaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(5).getProducro().getNombre()+"64.png")));
        lblSexta.setText(registros.get(5).getProducro().getNombre());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEstante = new javax.swing.JPanel();
        lblSegundaImagen = new javax.swing.JLabel();
        lblTerceraImagen = new javax.swing.JLabel();
        lblPrimeraImagen = new javax.swing.JLabel();
        lblPrimera = new javax.swing.JLabel();
        lblQuinta = new javax.swing.JLabel();
        lblTercera = new javax.swing.JLabel();
        lblSegunda = new javax.swing.JLabel();
        lblCuarta = new javax.swing.JLabel();
        lblSexta = new javax.swing.JLabel();
        lblCuartaImagen = new javax.swing.JLabel();
        lblQuintaImagen = new javax.swing.JLabel();
        lblSextaImagen = new javax.swing.JLabel();
        lblImageEstante = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(502, 335));

        panelEstante.setBackground(new java.awt.Color(255, 255, 255));
        panelEstante.setLayout(null);

        lblSegundaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/hamburguesa.png"))); // NOI18N
        lblSegundaImagen.setToolTipText("");
        panelEstante.add(lblSegundaImagen);
        lblSegundaImagen.setBounds(290, 10, 70, 70);

        lblTerceraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/hamburguesa.png"))); // NOI18N
        lblTerceraImagen.setToolTipText("");
        panelEstante.add(lblTerceraImagen);
        lblTerceraImagen.setBounds(170, 100, 70, 70);

        lblPrimeraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/hamburguesa.png"))); // NOI18N
        lblPrimeraImagen.setToolTipText("");
        panelEstante.add(lblPrimeraImagen);
        lblPrimeraImagen.setBounds(70, 10, 70, 70);

        lblPrimera.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblPrimera.setForeground(new java.awt.Color(0, 0, 255));
        lblPrimera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrimera.setText("texto 1");
        panelEstante.add(lblPrimera);
        lblPrimera.setBounds(20, 100, 170, 20);

        lblQuinta.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblQuinta.setForeground(new java.awt.Color(0, 0, 255));
        lblQuinta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuinta.setText("texto 5");
        panelEstante.add(lblQuinta);
        lblQuinta.setBounds(10, 270, 170, 20);

        lblTercera.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblTercera.setForeground(new java.awt.Color(0, 0, 255));
        lblTercera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTercera.setText("Texto 3");
        panelEstante.add(lblTercera);
        lblTercera.setBounds(110, 180, 190, 20);

        lblSegunda.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblSegunda.setForeground(new java.awt.Color(0, 0, 255));
        lblSegunda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSegunda.setText("Texto 2");
        panelEstante.add(lblSegunda);
        lblSegunda.setBounds(230, 100, 180, 20);

        lblCuarta.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblCuarta.setForeground(new java.awt.Color(0, 0, 255));
        lblCuarta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuarta.setText("texto 4");
        panelEstante.add(lblCuarta);
        lblCuarta.setBounds(310, 180, 170, 20);

        lblSexta.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblSexta.setForeground(new java.awt.Color(0, 0, 255));
        lblSexta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSexta.setText("texto 6");
        panelEstante.add(lblSexta);
        lblSexta.setBounds(230, 270, 170, 20);

        lblCuartaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/hamburguesa.png"))); // NOI18N
        lblCuartaImagen.setToolTipText("");
        panelEstante.add(lblCuartaImagen);
        lblCuartaImagen.setBounds(370, 100, 70, 70);

        lblQuintaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/hamburguesa.png"))); // NOI18N
        lblQuintaImagen.setToolTipText("");
        panelEstante.add(lblQuintaImagen);
        lblQuintaImagen.setBounds(60, 190, 70, 70);

        lblSextaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/hamburguesa.png"))); // NOI18N
        lblSextaImagen.setToolTipText("");
        panelEstante.add(lblSextaImagen);
        lblSextaImagen.setBounds(280, 190, 70, 70);

        lblImageEstante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/estante.png"))); // NOI18N
        panelEstante.add(lblImageEstante);
        lblImageEstante.setBounds(0, 0, 500, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 502, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelEstante, javax.swing.GroupLayout.DEFAULT_SIZE, 502, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelEstante, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCuarta;
    private javax.swing.JLabel lblCuartaImagen;
    private javax.swing.JLabel lblImageEstante;
    private javax.swing.JLabel lblPrimera;
    private javax.swing.JLabel lblPrimeraImagen;
    private javax.swing.JLabel lblQuinta;
    private javax.swing.JLabel lblQuintaImagen;
    private javax.swing.JLabel lblSegunda;
    private javax.swing.JLabel lblSegundaImagen;
    private javax.swing.JLabel lblSexta;
    private javax.swing.JLabel lblSextaImagen;
    private javax.swing.JLabel lblTercera;
    private javax.swing.JLabel lblTerceraImagen;
    private javax.swing.JPanel panelEstante;
    // End of variables declaration//GEN-END:variables
}
