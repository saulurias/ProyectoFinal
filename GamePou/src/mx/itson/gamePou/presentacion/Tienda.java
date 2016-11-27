/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.libreriaPou.entidades.Pou;
import mx.itson.libreriaPou.entidades.Producto;
import mx.itson.libreriaPou.entidades.Seccion;
import mx.itson.libreriaPou.implementacion.IProductoNegocio;
import mx.itson.libreriaPou.implementacion.IProductoPersistencia;
import mx.itson.libreriaPou.interfaz.NegocioProducto;
import mx.itson.libreriaPou.interfaz.PersistenciaProducto;

/**
 * Frame utilizado para mostrar los produtos que el usuario puede comprar dependiendo la seccion
 * @author soygo
 */
public class Tienda extends javax.swing.JFrame {

    /**
     * Creates new form Tienda
     */
    public Tienda() {
        initComponents();
        this.setSize(502, 335);  
    }
    
    /**
     * Variables utilizadas durante la ejecucion de la Tienda
     */
    Controlador cont = new Controlador();
    PersistenciaProducto persistencia = new IProductoPersistencia();
    NegocioProducto negocio = new IProductoNegocio();;
    
    Pou pou = cont.obtenerPou();
    
    List<Producto> productosbd = persistencia.obtenerProductos();
    List<Producto> productos = new ArrayList();
    
  
    /**
     * Metodo utilizado para obtener los productos dependiendo la seccion
     * @param seccion 
     */
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
    
    /**
     * Metodo utilizado para mostrar los productos dentro de la Tienda
     */
    public void mostrarProductos() {
        if (productos.size() == 0) {
            JOptionPane.showMessageDialog(null, "No Hay productos para mostrar");
        } else {

            lblImagenMoneda.setText("x" + pou.getDinero());

            btn_Primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(0).getNombre() + ".png")));
            lblPrimera.setText(productos.get(0).getNombre() + " $" + productos.get(0).getCosto());

            btn_Segundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(1).getNombre() + ".png")));
            lblSegunda.setText(productos.get(1).getNombre() + " $" + productos.get(1).getCosto());

            btn_Tercero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(2).getNombre() + ".png")));
            lblTercera.setText(productos.get(2).getNombre() + " $" + productos.get(2).getCosto());

            btn_Cuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(3).getNombre() + ".png")));
            lblCuarto.setText(productos.get(3).getNombre() + " $" + productos.get(3).getCosto());

            btn_Quinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(4).getNombre() + ".png")));
            lblQuinto.setText(productos.get(4).getNombre() + " $" + productos.get(4).getCosto());

            btn_Sexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(5).getNombre() + ".png")));
            lblSexto.setText(productos.get(5).getNombre() + " $" + productos.get(5).getCosto());
        }

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
        btn_Quinto = new javax.swing.JButton();
        lblQuinto = new javax.swing.JLabel();
        btn_Sexto = new javax.swing.JButton();
        lblSexto = new javax.swing.JLabel();
        btn_Cuarto = new javax.swing.JButton();
        lblCuarto = new javax.swing.JLabel();
        lblImagenMoneda = new javax.swing.JLabel();
        lblImageEstante = new javax.swing.JLabel();
        lblClicParaComprar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(502, 335));
        setMinimumSize(new java.awt.Dimension(502, 335));
        setSize(new java.awt.Dimension(502, 335));

        panelEstante.setBackground(new java.awt.Color(255, 255, 255));
        panelEstante.setLayout(null);

        lblSegunda.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblSegunda.setForeground(new java.awt.Color(0, 0, 255));
        lblSegunda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSegunda.setText("Texto 2");
        panelEstante.add(lblSegunda);
        lblSegunda.setBounds(230, 110, 180, 20);

        lblPrimera.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblPrimera.setForeground(new java.awt.Color(0, 0, 255));
        lblPrimera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPrimera.setText("texto 1");
        panelEstante.add(lblPrimera);
        lblPrimera.setBounds(20, 110, 170, 20);

        lblTercera.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblTercera.setForeground(new java.awt.Color(0, 0, 255));
        lblTercera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTercera.setText("Texto 3");
        panelEstante.add(lblTercera);
        lblTercera.setBounds(110, 200, 190, 20);

        btn_Primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/manzana.png"))); // NOI18N
        btn_Primero.setBorderPainted(false);
        btn_Primero.setContentAreaFilled(false);
        btn_Primero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PrimeroActionPerformed(evt);
            }
        });
        panelEstante.add(btn_Primero);
        btn_Primero.setBounds(60, 30, 100, 70);

        btn_Segundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/manzana.png"))); // NOI18N
        btn_Segundo.setBorderPainted(false);
        btn_Segundo.setContentAreaFilled(false);
        btn_Segundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SegundoActionPerformed(evt);
            }
        });
        panelEstante.add(btn_Segundo);
        btn_Segundo.setBounds(280, 30, 80, 70);

        btn_Tercero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/manzana.png"))); // NOI18N
        btn_Tercero.setBorderPainted(false);
        btn_Tercero.setContentAreaFilled(false);
        btn_Tercero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TerceroActionPerformed(evt);
            }
        });
        panelEstante.add(btn_Tercero);
        btn_Tercero.setBounds(160, 120, 80, 70);

        btn_Quinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/manzana.png"))); // NOI18N
        btn_Quinto.setBorderPainted(false);
        btn_Quinto.setContentAreaFilled(false);
        btn_Quinto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_QuintoActionPerformed(evt);
            }
        });
        panelEstante.add(btn_Quinto);
        btn_Quinto.setBounds(50, 200, 100, 70);

        lblQuinto.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblQuinto.setForeground(new java.awt.Color(0, 0, 255));
        lblQuinto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuinto.setText("texto 5");
        panelEstante.add(lblQuinto);
        lblQuinto.setBounds(10, 280, 170, 20);

        btn_Sexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/manzana.png"))); // NOI18N
        btn_Sexto.setBorderPainted(false);
        btn_Sexto.setContentAreaFilled(false);
        btn_Sexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SextoActionPerformed(evt);
            }
        });
        panelEstante.add(btn_Sexto);
        btn_Sexto.setBounds(260, 200, 100, 70);

        lblSexto.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblSexto.setForeground(new java.awt.Color(0, 0, 255));
        lblSexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSexto.setText("texto 6");
        panelEstante.add(lblSexto);
        lblSexto.setBounds(220, 280, 170, 20);

        btn_Cuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/manzana.png"))); // NOI18N
        btn_Cuarto.setBorderPainted(false);
        btn_Cuarto.setContentAreaFilled(false);
        btn_Cuarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CuartoActionPerformed(evt);
            }
        });
        panelEstante.add(btn_Cuarto);
        btn_Cuarto.setBounds(350, 120, 100, 70);

        lblCuarto.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblCuarto.setForeground(new java.awt.Color(0, 0, 255));
        lblCuarto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCuarto.setText("texto 4");
        panelEstante.add(lblCuarto);
        lblCuarto.setBounds(300, 190, 200, 20);

        lblImagenMoneda.setFont(new java.awt.Font("Seravek", 1, 24)); // NOI18N
        lblImagenMoneda.setForeground(new java.awt.Color(255, 204, 0));
        lblImagenMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/Coin.png"))); // NOI18N
        lblImagenMoneda.setText("x 5000");
        panelEstante.add(lblImagenMoneda);
        lblImagenMoneda.setBounds(10, 0, 130, 39);

        lblImageEstante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/estante.png"))); // NOI18N
        lblImageEstante.setMaximumSize(new java.awt.Dimension(502, 295));
        lblImageEstante.setMinimumSize(new java.awt.Dimension(502, 295));
        panelEstante.add(lblImageEstante);
        lblImageEstante.setBounds(10, 30, 490, 300);

        lblClicParaComprar.setFont(new java.awt.Font("Seravek", 1, 18)); // NOI18N
        lblClicParaComprar.setText("Clic Sobre El Producto Para Comprar");
        panelEstante.add(lblClicParaComprar);
        lblClicParaComprar.setBounds(150, 0, 310, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelEstante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PrimeroActionPerformed
        Producto producto = productos.get(0);
        negocio.Comprar(producto, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());
    }//GEN-LAST:event_btn_PrimeroActionPerformed

    private void btn_SegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SegundoActionPerformed
        Producto producto = productos.get(1);
        negocio.Comprar(producto, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());
    }//GEN-LAST:event_btn_SegundoActionPerformed

    private void btn_TerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TerceroActionPerformed
        Producto producto = productos.get(2);
        negocio.Comprar(producto, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());

    }//GEN-LAST:event_btn_TerceroActionPerformed

    private void btn_QuintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuintoActionPerformed
        Producto producto = productos.get(3);
        negocio.Comprar(producto, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());
    }//GEN-LAST:event_btn_QuintoActionPerformed

    private void btn_SextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SextoActionPerformed
        Producto producto = productos.get(4);
        negocio.Comprar(producto, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());
    }//GEN-LAST:event_btn_SextoActionPerformed

    private void btn_CuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CuartoActionPerformed
        Producto producto = productos.get(5);
        negocio.Comprar(producto, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());
    }//GEN-LAST:event_btn_CuartoActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Cuarto;
    private javax.swing.JButton btn_Primero;
    private javax.swing.JButton btn_Quinto;
    private javax.swing.JButton btn_Segundo;
    private javax.swing.JButton btn_Sexto;
    private javax.swing.JButton btn_Tercero;
    private javax.swing.JLabel lblClicParaComprar;
    private javax.swing.JLabel lblCuarto;
    private javax.swing.JLabel lblImageEstante;
    private javax.swing.JLabel lblImagenMoneda;
    private javax.swing.JLabel lblPrimera;
    private javax.swing.JLabel lblQuinto;
    private javax.swing.JLabel lblSegunda;
    private javax.swing.JLabel lblSexto;
    private javax.swing.JLabel lblTercera;
    private javax.swing.JPanel panelEstante;
    // End of variables declaration//GEN-END:variables
}
