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
import mx.itson.gamePou.entidades.RegistroInventario;
import mx.itson.gamePou.entidades.Seccion;
import mx.itson.gamePou.implementacion.NegocioPou;
import mx.itson.gamePou.implementacion.NegocioRegistroInventario;
import mx.itson.gamePou.implementacion.PersistenciaRegistroInventario;
import mx.itson.gamePou.interfaz.IPouNegocio;
import mx.itson.gamePou.interfaz.IRegistroInventarioNegocio;
import mx.itson.gamePou.interfaz.IRegistroInventarioPersistencia;


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
    
    //PersistenciaProducto persistencia = new PersistenciaProducto();
    //List<Producto> productosbd = persistencia.obtenerProductos();
    //NegocioPou negocio = new NegocioPou();
    //List<Producto> productos = new ArrayList();
    
    IRegistroInventarioPersistencia registroInventarioPersistencia = new PersistenciaRegistroInventario();
    List<RegistroInventario> registrosbd = registroInventarioPersistencia.obtenerRegistrosInventario();
    List<RegistroInventario> registros = new ArrayList();
    
    IPouNegocio negocioPou = new NegocioPou();
    IRegistroInventarioNegocio negocioRegistroInventario = new NegocioRegistroInventario();
    
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
        setLayout(null);

        btn_Estante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/botiquin.png"))); // NOI18N
        btn_Estante.setBorderPainted(false);
        btn_Estante.setBounds(new java.awt.Rectangle(6, 388, 80, 76));
        btn_Estante.setContentAreaFilled(false);
        btn_Estante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EstanteActionPerformed(evt);
            }
        });
        add(btn_Estante);
        btn_Estante.setBounds(0, 400, 80, 76);

        lblRefrigerador.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblRefrigerador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRefrigerador.setText("Botiquin");
        lblRefrigerador.setBounds(new java.awt.Rectangle(6, 476, 90, 18));
        add(lblRefrigerador);
        lblRefrigerador.setBounds(0, 480, 90, 18);

        btn_Beber.setBackground(new java.awt.Color(204, 255, 255));
        btn_Beber.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        btn_Beber.setText("Beber");
        btn_Beber.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btn_Beber.setBounds(new java.awt.Rectangle(131, 478, 96, 22));
        btn_Beber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BeberActionPerformed(evt);
            }
        });
        add(btn_Beber);
        btn_Beber.setBounds(140, 480, 96, 22);

        btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/pocionFelicidad.png"))); // NOI18N
        btn_Pocion.setBorderPainted(false);
        btn_Pocion.setBounds(new java.awt.Rectangle(139, 372, 80, 76));
        btn_Pocion.setContentAreaFilled(false);
        btn_Pocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PocionActionPerformed(evt);
            }
        });
        add(btn_Pocion);
        btn_Pocion.setBounds(140, 380, 80, 76);

        lblCantidadComida.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblCantidadComida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCantidadComida.setText("pocionSalud X 5");
        lblCantidadComida.setBounds(new java.awt.Rectangle(100, 450, 160, 18));
        add(lblCantidadComida);
        lblCantidadComida.setBounds(120, 460, 130, 18);

        lblTienda.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblTienda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTienda.setText("Tienda");
        lblTienda.setBounds(new java.awt.Rectangle(289, 476, 50, 18));
        add(lblTienda);
        lblTienda.setBounds(300, 480, 50, 18);

        btn_Tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/tienda.png"))); // NOI18N
        btn_Tienda.setBorderPainted(false);
        btn_Tienda.setBounds(new java.awt.Rectangle(274, 396, 80, 76));
        btn_Tienda.setContentAreaFilled(false);
        btn_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TiendaActionPerformed(evt);
            }
        });
        add(btn_Tienda);
        btn_Tienda.setBounds(280, 400, 80, 76);

        btn_Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/right_arrow.png"))); // NOI18N
        btn_Siguiente.setBorderPainted(false);
        btn_Siguiente.setBounds(new java.awt.Rectangle(274, 208, 80, 40));
        btn_Siguiente.setContentAreaFilled(false);
        btn_Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SiguienteActionPerformed(evt);
            }
        });
        add(btn_Siguiente);
        btn_Siguiente.setBounds(260, 200, 80, 40);

        lblImagePou.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/Pou.png"))); // NOI18N
        add(lblImagePou);
        lblImagePou.setBounds(120, 120, 128, 194);

        btn_Anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/left_arrow.png"))); // NOI18N
        btn_Anterior.setBorderPainted(false);
        btn_Anterior.setBounds(new java.awt.Rectangle(6, 215, 80, 40));
        btn_Anterior.setContentAreaFilled(false);
        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });
        add(btn_Anterior);
        btn_Anterior.setBounds(10, 210, 80, 40);

        lblImagenMoneda.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblImagenMoneda.setForeground(new java.awt.Color(255, 204, 0));
        lblImagenMoneda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/Coin.png"))); // NOI18N
        lblImagenMoneda.setText("x 5000");
        add(lblImagenMoneda);
        lblImagenMoneda.setBounds(6, 6, 90, 39);

        lblImagenHambrePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/hambre.png"))); // NOI18N
        add(lblImagenHambrePou);
        lblImagenHambrePou.setBounds(114, 17, 32, 39);

        progressHambre.setToolTipText("");
        progressHambre.setValue(100);
        add(progressHambre);
        progressHambre.setBounds(104, 58, 42, 20);

        progressSalud.setValue(100);
        add(progressSalud);
        progressSalud.setBounds(164, 58, 42, 20);

        lblImagenSalud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/salud.png"))); // NOI18N
        add(lblImagenSalud);
        lblImagenSalud.setBounds(169, 17, 35, 32);

        lblImagenEnergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/energia.png"))); // NOI18N
        add(lblImagenEnergia);
        lblImagenEnergia.setBounds(234, 6, 32, 50);

        progressEnergia.setValue(100);
        add(progressEnergia);
        progressEnergia.setBounds(224, 58, 42, 20);

        progressFelicidad.setValue(100);
        add(progressFelicidad);
        progressFelicidad.setBounds(284, 58, 42, 20);

        lblImagenFelicidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/felicidad.png"))); // NOI18N
        add(lblImagenFelicidad);
        lblImagenFelicidad.setBounds(286, 20, 40, 32);
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
        registros.clear();
        for (int i = 0; i < registrosbd.size(); i++) {
            if (registrosbd.get(i).getCantidad() > 0 && registrosbd.get(i).getProducto().getSeccion() == Seccion.LABORATORIO) {
                registros.add(registrosbd.get(i));
            }
        }
        if (registros.size() == 0) {
            JOptionPane.showMessageDialog(null, "No fue posible encontrar los productos de cocina");
        }else{
            mostrarProducto();
        }
    }
    
   /**
     * Metodo utilizado para mostrar el producto dentro de la vista
     */
    public void mostrarProducto(){
        if (posicionProducto <= 0) {
            lblCantidadComida.setText(registros.get(0).getProducto().getNombre() + " X " + registros.get(0).getCantidad());
            btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(0).getProducto().getNombre()+".png")));
        }else {
            lblCantidadComida.setText(registros.get(posicionProducto-1).getProducto().getNombre() + " X " + registros.get(posicionProducto-1).getCantidad());
            btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(posicionProducto-1).getProducto().getNombre()+".png")));
        } 
    } 
    /**
     * Metodo para mostrar los valores de hambrem, salud, energia, felicidad y dinero de Pou
     */
    public void mostrarValoresPou(){
        progressHambre.setValue(pou.getValorHambre());
        progressSalud.setValue(pou.getValorSalud());
        progressEnergia.setValue(pou.getValorEnergia());
        progressFelicidad.setValue(pou.getValorFelicidad());
        lblImagenMoneda.setText("x" + pou.getDinero() );
    }
    
    
    /**
     * Metodo utilizado para cambiar el producto dentro de la vista
     */
    public void cambiarProducto(){
        if (posicionProducto > registros.size()-1) {
            lblCantidadComida.setText(registros.get(0).getProducto().getNombre() + " X " + registros.get(0).getCantidad());
        
            btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(0).getProducto().getNombre()+".png")));
            posicionProducto = 0;
        }else{
            lblCantidadComida.setText(registros.get(posicionProducto).getProducto().getNombre() + " X " + registros.get(posicionProducto).getCantidad());
        
            btn_Pocion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mx/itson/gamePouimages/"+registros.get(posicionProducto).getProducto().getNombre()+".png")));
            
            posicionProducto++;
        }  
    }
    
    /**
     * Metodo utilizado para consumir el producto dentro de la vista
     */
    public void consumir(){
        if (posicionProducto > registros.size() || posicionProducto == 0) {
            negocioPou.consumir(registros.get(0), pou);
            negocioRegistroInventario.consumir(registros.get(0));
            mostrarValoresPou();
            obtenerPociones();
        }else {
            negocioPou.consumir(registros.get(posicionProducto-1), pou);
            negocioRegistroInventario.consumir(registros.get(posicionProducto-1));
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
