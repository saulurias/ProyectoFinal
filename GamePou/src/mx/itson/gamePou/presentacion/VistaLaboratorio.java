/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.presentacion;

import java.util.ArrayList;
import java.util.List;
import mx.itson.libreriaPou.entidades.Pou;
import mx.itson.libreriaPou.entidades.Producto;
import mx.itson.libreriaPou.entidades.Seccion;
import mx.itson.libreriaPou.implementacion.IProductoNegocio;
import mx.itson.libreriaPou.implementacion.IProductoPersistencia;
import mx.itson.libreriaPou.interfaz.NegocioProducto;
import mx.itson.libreriaPou.interfaz.PersistenciaProducto;


/**
 * Panel utilizado para mostrar la vista de la seccion Laboratorio
 * @author SaulUrias
 */
public class VistaLaboratorio extends javax.swing.JPanel {

    /**
     * Creates new form vistaLaboratorio
     */
    public VistaLaboratorio() {
        initComponents();
        mostrarValoresPou();
        obtenerPociones();
        this.setSize(Principal.panelPrincipal.getSize());
        this.setVisible(true);
    }
    
    /**
     * Variables a utilizar durante la ejecucion de la vista
     */
    Controlador cont = new Controlador();
    Pou pou = cont.obtenerPou();
    int posicionProducto = 1;
    
    PersistenciaProducto persistencia = new IProductoPersistencia();
    List<Producto> productosbd = persistencia.obtenerProductos();
    NegocioProducto negocio = new IProductoNegocio();
    List<Producto> productos = new ArrayList();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Estante = new javax.swing.JButton();
        lblRefrigerador = new javax.swing.JLabel();
        btn_Beber = new javax.swing.JButton();
        btn_Pocion = new javax.swing.JButton();
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

        setBackground(new java.awt.Color(0, 51, 255));

        btn_Estante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/botiquin.png"))); // NOI18N
        btn_Estante.setBorderPainted(false);
        btn_Estante.setContentAreaFilled(false);
        btn_Estante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EstanteActionPerformed(evt);
            }
        });

        lblRefrigerador.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblRefrigerador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRefrigerador.setText("Botiquin");

        btn_Beber.setBackground(new java.awt.Color(204, 255, 255));
        btn_Beber.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        btn_Beber.setText("Beber");
        btn_Beber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Beber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BeberActionPerformed(evt);
            }
        });

        btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/pocionFelicidad.png"))); // NOI18N
        btn_Pocion.setBorderPainted(false);
        btn_Pocion.setContentAreaFilled(false);
        btn_Pocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PocionActionPerformed(evt);
            }
        });

        lblCantidadComida.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblCantidadComida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadComida.setText("pocionSalud X 5");

        lblTienda.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienda.setText("Tienda");

        btn_Tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/tienda.png"))); // NOI18N
        btn_Tienda.setBorderPainted(false);
        btn_Tienda.setContentAreaFilled(false);
        btn_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TiendaActionPerformed(evt);
            }
        });

        btn_Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/right_arrow.png"))); // NOI18N
        btn_Siguiente.setBorderPainted(false);
        btn_Siguiente.setContentAreaFilled(false);
        btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiguienteActionPerformed(evt);
            }
        });

        lblImagePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/Pou.png"))); // NOI18N

        btn_Anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/left_arrow.png"))); // NOI18N
        btn_Anterior.setBorderPainted(false);
        btn_Anterior.setContentAreaFilled(false);
        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });

        lblImagenMoneda.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblImagenMoneda.setForeground(new java.awt.Color(255, 204, 0));
        lblImagenMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/Coin.png"))); // NOI18N
        lblImagenMoneda.setText("x 5000");

        lblImagenHambrePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/hambre.png"))); // NOI18N

        progressHambre.setToolTipText("");
        progressHambre.setValue(100);

        progressSalud.setValue(100);

        lblImagenSalud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/salud.png"))); // NOI18N

        lblImagenEnergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/energia.png"))); // NOI18N

        progressEnergia.setValue(100);

        progressFelicidad.setValue(100);

        lblImagenFelicidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/felicidad.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblImagenMoneda)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(progressHambre, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImagenHambrePou))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(progressSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(progressEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(lblImagenSalud, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(lblImagenEnergia)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(progressFelicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblImagenFelicidad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRefrigerador, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_Estante)
                            .addComponent(btn_Anterior))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(lblCantidadComida)
                                    .addComponent(btn_Pocion)
                                    .addComponent(btn_Beber, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblImagePou)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                                    .addComponent(btn_Tienda)
                                    .addComponent(lblTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Siguiente)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(lblImagenEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblImagenHambrePou, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblImagenSalud))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblImagenMoneda, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblImagenFelicidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(progressHambre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressEnergia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressFelicidad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(progressSalud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(lblImagePou, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(111, 111, 111)
                                .addComponent(btn_Siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_Pocion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCantidadComida)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Beber))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Estante)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblRefrigerador))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btn_Tienda)
                                .addGap(4, 4, 4)
                                .addComponent(lblTienda)))
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EstanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EstanteActionPerformed
        cont.abrirEstante(Seccion.LABORATORIO);
    }//GEN-LAST:event_btn_EstanteActionPerformed

    private void btn_BeberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BeberActionPerformed
        consumir();
    }//GEN-LAST:event_btn_BeberActionPerformed

    private void btn_PocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PocionActionPerformed
        cambiarProducto();
    }//GEN-LAST:event_btn_PocionActionPerformed

    private void btn_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TiendaActionPerformed
        cont.abrirTienda(Seccion.LABORATORIO);
    }//GEN-LAST:event_btn_TiendaActionPerformed

    private void btn_SiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SiguienteActionPerformed
        cont.iniciarCocina();
    }//GEN-LAST:event_btn_SiguienteActionPerformed

    private void btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnteriorActionPerformed
        cont.iniciarCuarto();
    }//GEN-LAST:event_btn_AnteriorActionPerformed
 
    
    public void obtenerPociones(){
        productos.clear();
        for (int i = 0; i < productosbd.size(); i++) {
            if (productosbd.get(i).getSeccion() == Seccion.LABORATORIO) {
                productos.add(productosbd.get(i));
            }
        }
        mostrarProducto();
    }
    
   
    
    /**
     * Metodo utilizado para mostrar el producto dentro de la vista
     */
    public void mostrarProducto(){
        if (posicionProducto <= 0) {
            lblCantidadComida.setText(productos.get(0).getNombre() + " X " + productos.get(0).getCantidad());
            btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(0).getNombre()+".png")));
        }else {
            lblCantidadComida.setText(productos.get(posicionProducto-1).getNombre() + " X " + productos.get(posicionProducto-1).getCantidad());
            btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(posicionProducto-1).getNombre()+".png")));
        } 
    } 
    
    
    /**
     * Metodo a utilizar para mostrar los valores de Pou dentro de la vista
     */
    public void mostrarValoresPou() {
        progressHambre.setValue(pou.getValorHambre());
        progressSalud.setValue(pou.getValorSalud());
        progressEnergia.setValue(pou.getValorEnergia());
        progressFelicidad.setValue(pou.getValorFelicidad());
        lblImagenMoneda.setText("x" + pou.getDinero());
    }
    
    /**
     * Metodo a utilizar para cambiar el producto que puede ser consumido por Pou dentro de la vista
     */
    public void cambiarProducto(){
        if (posicionProducto > productos.size()-1) {
            lblCantidadComida.setText(productos.get(0).getNombre() + " X " + productos.get(0).getCantidad());
        
            btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(0).getNombre()+".png")));
            posicionProducto = 0;
        }else{
            lblCantidadComida.setText(productos.get(posicionProducto).getNombre() + " X " + productos.get(posicionProducto).getCantidad());
        
            btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+productos.get(posicionProducto).getNombre()+".png")));
            
            posicionProducto++;
        }  
    }
    
    /**
     * Metodo utilizado para consumir el producto dentro de la vista
     */
    public void consumir(){
        if (posicionProducto > 6 || posicionProducto == 0) {
            negocio.Consumir(productos.get(0), pou);
            mostrarValoresPou();
            obtenerPociones();
        }else {
            negocio.Consumir(productos.get(posicionProducto-1), pou);
            mostrarValoresPou();
            obtenerPociones();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Beber;
    private javax.swing.JButton btn_Estante;
    private javax.swing.JButton btn_Pocion;
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
