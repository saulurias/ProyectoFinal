/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.presentacion;

import java.util.ArrayList;
import java.util.List;
import mx.itson.libreriaPou.entidades.Producto;
import mx.itson.libreriaPou.entidades.Seccion;
import mx.itson.libreriaPou.implementacion.IProductoNegocio;
import mx.itson.libreriaPou.implementacion.IProductoPersistencia;
import mx.itson.libreriaPou.interfaz.NegocioProducto;
import mx.itson.libreriaPou.interfaz.PersistenciaProducto;

/**
 *
 * @author soygo
 */
public class Estante extends javax.swing.JFrame {

    /**
     * Creates new form EstanteRefrigerador
     */
    public Estante() {
        initComponents();
    }
    
    PersistenciaProducto persistencia = new IProductoPersistencia();
    List<Producto> productosbd = persistencia.obtenerProductos();
    NegocioProducto negocio = new IProductoNegocio();
    
    List<Producto> productos = new ArrayList();
    
    public void obtenerProductosSeccion(Seccion seccion) {
        if (seccion == Seccion.COCINA) {
            for (int i = 0; i < productosbd.size(); i++) {
                if (productosbd.get(i).getSeccion() == Seccion.COCINA) {
                    productos.add(productosbd.get(i));
                }
            }
            mostrarProductos();
        }else if (seccion == Seccion.CUARTO){
            for (int i = 0; i < productosbd.size(); i++) {
                if (productosbd.get(i).getSeccion() == Seccion.CUARTO) {
                    productos.add(productosbd.get(i));
                }
            }
            mostrarProductos();
        }else if (seccion == Seccion.LABORATORIO){
            for (int i = 0; i < productosbd.size(); i++) {
                if (productosbd.get(i).getSeccion() == Seccion.LABORATORIO) {
                    productos.add(productosbd.get(i));
                }
            }
            mostrarProductos();
        }
    }
    
    public void mostrarProductos(){
        
        lblPrimeraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(0).getNombre()+".png")));
        lblPrimera.setText(productos.get(0).getNombre() + " X " + productos.get(0).getCantidad());
        
        lblSegundaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(1).getNombre()+".png")));
        lblSegunda.setText(productos.get(1).getNombre() + " X " + productos.get(1).getCantidad());
        
        lblTerceraImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(2).getNombre()+".png")));
        lblTercera.setText(productos.get(2).getNombre() + " X " + productos.get(2).getCantidad());
        
        lblCuartaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(3).getNombre()+".png")));
        lblCuarta.setText(productos.get(3).getNombre() + " X " + productos.get(3).getCantidad());
        
        lblQuintaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(4).getNombre()+".png")));
        lblQuinta.setText(productos.get(4).getNombre() + " X " + productos.get(4).getCantidad());
        
        lblSextaImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(5).getNombre()+".png")));
        lblSexta.setText(productos.get(5).getNombre() + " X " + productos.get(5).getCantidad());
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