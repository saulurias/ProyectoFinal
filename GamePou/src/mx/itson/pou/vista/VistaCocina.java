/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.vista;

import java.util.List;
import mx.itson.pou.entidades.Pou;
import mx.itson.pou.entidades.Producto;
import mx.itson.pou.persistencia.Persistencia;
import static mx.itson.pou.vista.Principal.panelPrincipal;

/**
 *
 * @author SaulUrias
 */
public class VistaCocina extends javax.swing.JPanel {

    /**
     * Creates new form vistaCocina
     */
    public VistaCocina() {
        initComponents();
        this.setSize(Principal.panelPrincipal.getSize());
        this.setVisible(true);
    }
    
    Persistencia persistencia = new Persistencia();
    Pou pou = persistencia.obtenerPou();
    List<Producto> productos = persistencia.obtenerComida();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Refrigerador = new javax.swing.JButton();
        lblRefrigerador = new javax.swing.JLabel();
        btn_Comer = new javax.swing.JButton();
        btn_Comida = new javax.swing.JButton();
        lblCantidadComida = new javax.swing.JLabel();
        lblTienda = new javax.swing.JLabel();
        btn_Tienda = new javax.swing.JButton();
        btn_Siguiente = new javax.swing.JButton();
        lblImagePou = new javax.swing.JLabel();
        btn_Anterior = new javax.swing.JButton();
        lblImagenMoneda = new javax.swing.JLabel();
        lblImagenHambrePou = new javax.swing.JLabel();
        progressHambre = new javax.swing.JProgressBar();
        progressSalud = new javax.swing.JProgressBar();
        lblImagenSalud = new javax.swing.JLabel();
        lblImagenEnergia = new javax.swing.JLabel();
        progressEnergia = new javax.swing.JProgressBar();
        progressFelicidad = new javax.swing.JProgressBar();
        lblImagenFelicidad = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 153, 153));

        btn_Refrigerador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/refri.png"))); // NOI18N
        btn_Refrigerador.setBorderPainted(false);
        btn_Refrigerador.setContentAreaFilled(false);
        btn_Refrigerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefrigeradorActionPerformed(evt);
            }
        });

        lblRefrigerador.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblRefrigerador.setText("Refrigerador");

        btn_Comer.setBackground(new java.awt.Color(255, 153, 153));
        btn_Comer.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        btn_Comer.setText("Comer");
        btn_Comer.setOpaque(true);
        btn_Comer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComerActionPerformed(evt);
            }
        });

        btn_Comida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hamburguesa.png"))); // NOI18N
        btn_Comida.setBorderPainted(false);
        btn_Comida.setContentAreaFilled(false);
        btn_Comida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ComidaActionPerformed(evt);
            }
        });

        lblCantidadComida.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblCantidadComida.setText("Hamburguesa X 5");

        lblTienda.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblTienda.setText("Tienda");

        btn_Tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shop.png"))); // NOI18N
        btn_Tienda.setBorderPainted(false);
        btn_Tienda.setContentAreaFilled(false);
        btn_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TiendaActionPerformed(evt);
            }
        });

        btn_Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right_arrow.png"))); // NOI18N
        btn_Siguiente.setBorderPainted(false);
        btn_Siguiente.setContentAreaFilled(false);
        btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiguienteActionPerformed(evt);
            }
        });

        lblImagePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pou_estudiante.png"))); // NOI18N

        btn_Anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left_arrow.png"))); // NOI18N
        btn_Anterior.setBorderPainted(false);
        btn_Anterior.setContentAreaFilled(false);
        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });

        lblImagenMoneda.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblImagenMoneda.setForeground(new java.awt.Color(255, 255, 0));
        lblImagenMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coin.png"))); // NOI18N
        lblImagenMoneda.setText("x 5000");

        lblImagenHambrePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hambre.png"))); // NOI18N

        progressHambre.setToolTipText("");
        progressHambre.setValue(20);

        progressSalud.setValue(100);

        lblImagenSalud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N

        lblImagenEnergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/energy.png"))); // NOI18N

        progressEnergia.setValue(100);

        progressFelicidad.setValue(100);

        lblImagenFelicidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felicidad.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(lblImagenMoneda)
                            .addGap(18, 18, 18)
                            .addComponent(lblImagenHambrePou, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(lblImagenSalud)
                            .addGap(15, 15, 15)
                            .addComponent(lblImagenEnergia)
                            .addGap(21, 21, 21)
                            .addComponent(lblImagenFelicidad))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(progressHambre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(progressSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(progressEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(progressFelicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_Anterior)
                            .addGap(20, 20, 20)
                            .addComponent(lblImagePou)
                            .addGap(25, 25, 25)
                            .addComponent(btn_Siguiente))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblRefrigerador, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Refrigerador, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(btn_Comida))
                                .addComponent(lblCantidadComida, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btn_Comer, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btn_Tienda)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(lblTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(lblImagenMoneda))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblImagenHambrePou))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblImagenSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblImagenEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(lblImagenFelicidad)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(progressHambre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(progressSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(progressEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(progressFelicidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(70, 70, 70)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(89, 89, 89)
                            .addComponent(btn_Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblImagePou)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(btn_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(66, 66, 66)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_Comida)
                            .addGap(2, 2, 2)
                            .addComponent(lblCantidadComida)
                            .addGap(2, 2, 2)
                            .addComponent(btn_Comer))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(lblRefrigerador))
                                .addComponent(btn_Refrigerador, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btn_Tienda)
                                    .addGap(4, 4, 4)
                                    .addComponent(lblTienda)))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RefrigeradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefrigeradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_RefrigeradorActionPerformed

    private void btn_ComerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComerActionPerformed

        /*
        if (posicionProducto > 3 || posicionProducto == 0) {
            AlimentarPou(productos.get(0));
        }else {
            AlimentarPou(productos.get(posicionProducto-1));
        }
    */
    }//GEN-LAST:event_btn_ComerActionPerformed

    private void btn_ComidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ComidaActionPerformed
        //AlimentarPou();
        //obtenerProductos();
    }//GEN-LAST:event_btn_ComidaActionPerformed

    private void btn_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TiendaActionPerformed
        EstanteRefrigerador er = new EstanteRefrigerador();
        er.setSize(369, 297);
        er.setVisible(true);
    }//GEN-LAST:event_btn_TiendaActionPerformed

    private void btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiguienteActionPerformed
       iniciarLaboratorio();
    }//GEN-LAST:event_btn_SiguienteActionPerformed

    private void btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnteriorActionPerformed
        iniciarSalaDeJuego();
    }//GEN-LAST:event_btn_AnteriorActionPerformed

    
    public void iniciarLaboratorio(){
        VistaLaboratorio ventana = new VistaLaboratorio();
        panelPrincipal.removeAll();
        panelPrincipal.add(ventana);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }
    
    public void iniciarSalaDeJuego(){
        VistaSalaDeJuego ventana = new VistaSalaDeJuego();
        panelPrincipal.removeAll();
        panelPrincipal.add(ventana);
        panelPrincipal.revalidate();
        panelPrincipal.repaint();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Comer;
    private javax.swing.JButton btn_Comida;
    private javax.swing.JButton btn_Refrigerador;
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JButton btn_Tienda;
    private javax.swing.JLabel lblCantidadComida;
    private javax.swing.JLabel lblImagePou;
    private javax.swing.JLabel lblImagenEnergia;
    private javax.swing.JLabel lblImagenFelicidad;
    private javax.swing.JLabel lblImagenHambrePou;
    private javax.swing.JLabel lblImagenMoneda;
    private javax.swing.JLabel lblImagenSalud;
    private javax.swing.JLabel lblRefrigerador;
    private javax.swing.JLabel lblTienda;
    private javax.swing.JProgressBar progressEnergia;
    private javax.swing.JProgressBar progressFelicidad;
    private javax.swing.JProgressBar progressHambre;
    private javax.swing.JProgressBar progressSalud;
    // End of variables declaration//GEN-END:variables
}
