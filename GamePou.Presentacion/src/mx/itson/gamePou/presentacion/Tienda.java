/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.gamePou.presentacion;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import mx.itson.gamePou.entidades.Pou;
import mx.itson.gamePou.entidades.Producto;
import mx.itson.gamePou.entidades.RegistroInventario;
import mx.itson.gamePou.entidades.Seccion;
import mx.itson.gamePou.implementacion.NegocioPou;
import mx.itson.gamePou.implementacion.NegocioRegistroInventario;
import mx.itson.gamePou.implementacion.PersistenciaProducto;
import mx.itson.gamePou.implementacion.PersistenciaRegistroInventario;
import mx.itson.gamePou.interfaz.IPouNegocio;
import mx.itson.gamePou.interfaz.IProductoPersistencia;
import mx.itson.gamePou.interfaz.IRegistroInventarioNegocio;
import mx.itson.gamePou.interfaz.IRegistroInventarioPersistencia;

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
    IProductoPersistencia persistencia = new PersistenciaProducto();
    IPouNegocio negocioPou = new NegocioPou();
    IRegistroInventarioNegocio negocioRegistro = new NegocioRegistroInventario();
    
    Pou pou = cont.obtenerPou();
    
    List<Producto> productosbd = persistencia.obtenerProductos();
    List<Producto> productos = new ArrayList();
    
    IRegistroInventarioPersistencia persistenciaRegistro = new PersistenciaRegistroInventario();
    List<RegistroInventario> registrosbd = persistenciaRegistro.obtenerRegistrosInventario();
    List<RegistroInventario> registros = new ArrayList();
  
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
            llenarRegistros(seccion);
            mostrarProductos();
        }else if (seccion == Seccion.CUARTO){
            for (int i = 0; i < productosbd.size(); i++) {
                if (productosbd.get(i).getSeccion() == Seccion.CUARTO) {
                    productos.add(productosbd.get(i));
                }
            }
            for (int i = 0; i < registrosbd.size(); i++) {
                if (registrosbd.get(i).getProducro().getSeccion() == Seccion.CUARTO) {
                    registros.add(registrosbd.get(i));
                }
            }
            llenarRegistros(seccion);
            mostrarProductosCuarto();
        }else if (seccion == Seccion.LABORATORIO){
            for (int i = 0; i < productosbd.size(); i++) {
                if (productosbd.get(i).getSeccion() == Seccion.LABORATORIO) {
                    productos.add(productosbd.get(i));
                }
            }
            llenarRegistros(seccion);
            mostrarProductos();
        }
    }
    
    public void llenarRegistros(Seccion seccion){
        for (int i = 0; i < registrosbd.size(); i++) {
            if (registrosbd.get(i).getProducro().getSeccion() == seccion) {
                registros.add(registrosbd.get(i));
            }
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
            lblPrimera.setText(registros.get(0).getProducro().getNombre() + " $" + productos.get(0).getCosto());

            btn_Segundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(1).getNombre() + ".png")));
            lblSegunda.setText(registros.get(1).getProducro().getNombre() + " $" + productos.get(1).getCosto());

            btn_Tercero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(2).getNombre() + ".png")));
            lblTercera.setText(registros.get(2).getProducro().getNombre()+ " $" + productos.get(2).getCosto());

            btn_Cuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(3).getNombre() + ".png")));
            lblCuarto.setText(registros.get(3).getProducro().getNombre() + " $" + productos.get(3).getCosto());

            btn_Quinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(4).getNombre() + ".png")));
            lblQuinto.setText(registros.get(4).getProducro().getNombre() + " $" + productos.get(4).getCosto());

            btn_Sexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + productos.get(5).getNombre() + ".png")));
            lblSexto.setText(registros.get(5).getProducro().getNombre() + " $" + productos.get(5).getCosto());
        }

    }
    
    public void mostrarProductosCuarto(){
        lblImagenMoneda.setText("x" + pou.getDinero());
        
        if (registros.get(0).getCantidad() <= 0) {
            btn_Primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(0).getProducro().getNombre() + "64.png")));
            lblPrimera.setText(registros.get(0).getProducro().getNombre() + " $" + registros.get(0).getProducro().getCosto());
        } else {
            btn_Primero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(0).getProducro().getNombre() + "64.png")));
            btn_Primero.setEnabled(false);
            lblPrimera.setText("Skin Comprada");
        }
        if (registros.get(1).getCantidad() <= 0) {
            btn_Segundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(1).getProducro().getNombre() + "64.png")));
            lblSegunda.setText(registros.get(1).getProducro().getNombre() + " $" + registros.get(1).getProducro().getCosto());
        } else {
            btn_Segundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(1).getProducro().getNombre() + "64.png")));
            btn_Segundo.setEnabled(false);
            lblSegunda.setText("Skin Comprada");
        }
        if (registros.get(2).getCantidad() <= 0) {
            btn_Tercero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(2).getProducro().getNombre() + "64.png")));
            lblTercera.setText(registros.get(2).getProducro().getNombre() + " $" + registros.get(2).getProducro().getCosto());
        } else {
            btn_Tercero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(2).getProducro().getNombre() + "64.png")));
            btn_Tercero.setEnabled(false);
            lblTercera.setText("Skin Comprada");
        }
        if (registros.get(3).getCantidad() <= 0) {
            btn_Cuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(3).getProducro().getNombre() + "64.png")));
            lblCuarto.setText(registros.get(3).getProducro().getNombre() + " $" + registros.get(3).getProducro().getCosto());
        } else {
            btn_Cuarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(3).getProducro().getNombre() + "64.png")));
            btn_Cuarto.setEnabled(false);
            lblCuarto.setText("Skin Comprada");
        }
        if (registros.get(4).getCantidad() <= 0) {
            btn_Quinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(4).getProducro().getNombre() + "64.png")));
            lblQuinto.setText(registros.get(4).getProducro().getNombre() + " $" + registros.get(4).getProducro().getCosto());
        } else {
            btn_Quinto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(4).getProducro().getNombre() + "64.png")));
            btn_Quinto.setEnabled(false);
            lblQuinto.setText("Skin Comprada");
        }
        if (registros.get(5).getCantidad() <= 0) {
            btn_Sexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(5).getProducro().getNombre() + "64.png")));
            lblSexto.setText(registros.get(5).getProducro().getNombre() + " $" + registros.get(5).getProducro().getCosto());
        } else {
            btn_Sexto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/" + registros.get(5).getProducro().getNombre() + "64.png")));
            btn_Sexto.setEnabled(false);
            lblSexto.setText("Skin Comprada");
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
        Producto producto = registros.get(0).getProducro();
        RegistroInventario registro = registros.get(0);
        negocioPou.comprar(producto, pou);
        negocioRegistro.comprar(registro, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());
    }//GEN-LAST:event_btn_PrimeroActionPerformed

    private void btn_SegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SegundoActionPerformed
        Producto producto = registros.get(1).getProducro();
        RegistroInventario registro = registros.get(1);
        negocioPou.comprar(producto, pou);
        negocioRegistro.comprar(registro, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());
    }//GEN-LAST:event_btn_SegundoActionPerformed

    private void btn_TerceroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TerceroActionPerformed
        Producto producto = registros.get(2).getProducro();
        RegistroInventario registro = registros.get(2);
        negocioPou.comprar(producto, pou);
        negocioRegistro.comprar(registro, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());

    }//GEN-LAST:event_btn_TerceroActionPerformed

    private void btn_QuintoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_QuintoActionPerformed
        Producto producto = registros.get(4).getProducro();
        RegistroInventario registro = registros.get(4);
        negocioPou.comprar(producto, pou);
        negocioRegistro.comprar(registro, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());
    }//GEN-LAST:event_btn_QuintoActionPerformed

    private void btn_SextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SextoActionPerformed
        Producto producto = registros.get(5).getProducro();
        RegistroInventario registro = registros.get(5);
        negocioPou.comprar(producto, pou);
        negocioRegistro.comprar(registro, pou);
        lblImagenMoneda.setText("x" + pou.getDinero());
    }//GEN-LAST:event_btn_SextoActionPerformed

    private void btn_CuartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CuartoActionPerformed
        Producto producto = registros.get(3).getProducro();
        RegistroInventario registro = registros.get(3);
        negocioPou.comprar(producto, pou);
        negocioRegistro.comprar(registro, pou);
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
