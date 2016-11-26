/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.presentacion;

import java.util.List;
import mx.itson.pou.entidades.Pou;
import mx.itson.pou.entidades.Producto;
import mx.itson.pou.negocio.Negocio;
import mx.itson.pou.persistencia.Persistencia;

/**
 *
 * @author SaulUrias
 */
public class Shop extends javax.swing.JPanel {

    /**
     * Creates new form Shop
     */
    public Shop() {
        initComponents();
        MostrarProductos();
    }
    
    Persistencia persistencia = new Persistencia();
    List<Producto> productos = persistencia.obtenerProductos();
    Negocio negocio = new Negocio();
    Pou pou = new Pou();
    
    public void MostrarProductos(){
        btn_Primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+productos.get(0).getNombre()+".png")));
        lblPrimera.setText(productos.get(0).getNombre() + " $" + productos.get(0).getCosto());
        
        btn_Segundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+productos.get(1).getNombre()+".png")));
        lblSegunda.setText(productos.get(1).getNombre() + " $" + productos.get(1).getCosto());
        
        btn_Tercero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagesc/"+productos.get(2).getNombre()+".png")));
        lblTercera.setText(productos.get(2).getNombre() + " $" + productos.get(2).getCosto());
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
        lblSegunda = new javax.swing.JLabel();
        lblPrimera = new javax.swing.JLabel();
        lblTercera = new javax.swing.JLabel();
        btn_Primero = new javax.swing.JButton();
        btn_Segundo = new javax.swing.JButton();
        btn_Tercero = new javax.swing.JButton();
        lblImageEstante = new javax.swing.JLabel();

        panelEstante.setLayout(null);

        lblSegunda.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblSegunda.setForeground(new java.awt.Color(255, 255, 255));
        lblSegunda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelEstante.add(lblSegunda);
        lblSegunda.setBounds(180, 130, 180, 0);

        lblPrimera.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblPrimera.setForeground(new java.awt.Color(255, 255, 255));
        lblPrimera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelEstante.add(lblPrimera);
        lblPrimera.setBounds(10, 130, 170, 0);

        lblTercera.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblTercera.setForeground(new java.awt.Color(255, 255, 255));
        lblTercera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelEstante.add(lblTercera);
        lblTercera.setBounds(0, 210, 190, 0);

        btn_Primero.setBorderPainted(false);
        btn_Primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrimeroActionPerformed(evt);
            }
        });
        panelEstante.add(btn_Primero);
        btn_Primero.setBounds(40, 100, 75, 29);

        btn_Segundo.setBorderPainted(false);
        btn_Segundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SegundoActionPerformed(evt);
            }
        });
        panelEstante.add(btn_Segundo);
        btn_Segundo.setBounds(230, 100, 75, 29);

        btn_Tercero.setBorderPainted(false);
        btn_Tercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TerceroActionPerformed(evt);
            }
        });
        panelEstante.add(btn_Tercero);
        btn_Tercero.setBounds(40, 190, 75, 29);

        lblImageEstante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/estante.jpg"))); // NOI18N
        panelEstante.add(lblImageEstante);
        lblImageEstante.setBounds(0, 0, 370, 300);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(panelEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_TerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TerceroActionPerformed
        Producto producto = productos.get(2);
        negocio.Comprar(producto, pou);
        
    }//GEN-LAST:event_btn_TerceroActionPerformed

    private void btn_PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrimeroActionPerformed
        Producto producto = productos.get(0);
        negocio.Comprar(producto, pou);
    }//GEN-LAST:event_btn_PrimeroActionPerformed

    private void btn_SegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SegundoActionPerformed
        Producto producto = productos.get(1);
        negocio.Comprar(producto, pou);
    }//GEN-LAST:event_btn_SegundoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Primero;
    private javax.swing.JButton btn_Segundo;
    private javax.swing.JButton btn_Tercero;
    private javax.swing.JLabel lblImageEstante;
    private javax.swing.JLabel lblPrimera;
    private javax.swing.JLabel lblSegunda;
    private javax.swing.JLabel lblTercera;
    private javax.swing.JPanel panelEstante;
    // End of variables declaration//GEN-END:variables
}