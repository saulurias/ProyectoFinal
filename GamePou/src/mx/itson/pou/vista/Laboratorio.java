/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.vista;
import mx.itson.pou.vista.Cocina;
/**
 *
 * @author SaulUrias
 */
public class Laboratorio extends javax.swing.JFrame {

    /**
     * Creates new form Laboratorio
     */
    public Laboratorio() {
        initComponents();
         
        Cocina cocina = new Cocina();
        this.setSize(cocina.getWidth(), cocina.getHeight());
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelLaboratorio = new javax.swing.JPanel();
        btn_Anterior = new javax.swing.JButton();
        lblImageCoin = new javax.swing.JLabel();
        lblImagenHambrePou = new javax.swing.JLabel();
        progressHambre = new javax.swing.JProgressBar();
        lblImagenSalud = new javax.swing.JLabel();
        progressSalud = new javax.swing.JProgressBar();
        lblImagenEnergia = new javax.swing.JLabel();
        progressEnergia = new javax.swing.JProgressBar();
        lblImagenFelicidad = new javax.swing.JLabel();
        progressFelicidad = new javax.swing.JProgressBar();
        lblImagePou = new javax.swing.JLabel();
        btn_Siguiente = new javax.swing.JButton();
        lblBotiquin = new javax.swing.JLabel();
        btn_botiquin = new javax.swing.JButton();
        btn_Posion = new javax.swing.JButton();
        lblCantidadPosion = new javax.swing.JLabel();
        btn_Tienda = new javax.swing.JButton();
        lblTienda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Laboratorio");
        setMinimumSize(new java.awt.Dimension(358, 500));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 500));

        panelLaboratorio.setBackground(new java.awt.Color(0, 51, 255));
        panelLaboratorio.setPreferredSize(new java.awt.Dimension(0, 0));
        panelLaboratorio.setLayout(null);

        btn_Anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left_arrow.png"))); // NOI18N
        btn_Anterior.setBorderPainted(false);
        btn_Anterior.setContentAreaFilled(false);
        btn_Anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AnteriorActionPerformed(evt);
            }
        });
        panelLaboratorio.add(btn_Anterior);
        btn_Anterior.setBounds(0, 229, 80, 40);

        lblImageCoin.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblImageCoin.setForeground(new java.awt.Color(255, 255, 0));
        lblImageCoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coin.png"))); // NOI18N
        lblImageCoin.setText("x 5000");
        panelLaboratorio.add(lblImageCoin);
        lblImageCoin.setBounds(6, 14, 86, 34);

        lblImagenHambrePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hambre.png"))); // NOI18N
        panelLaboratorio.add(lblImagenHambrePou);
        lblImagenHambrePou.setBounds(110, 10, 30, 33);

        progressHambre.setToolTipText("");
        progressHambre.setValue(20);
        panelLaboratorio.add(progressHambre);
        progressHambre.setBounds(100, 50, 40, 20);

        lblImagenSalud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        panelLaboratorio.add(lblImagenSalud);
        lblImagenSalud.setBounds(160, 10, 35, 30);

        progressSalud.setValue(100);
        panelLaboratorio.add(progressSalud);
        progressSalud.setBounds(160, 50, 40, 20);

        lblImagenEnergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/energy.png"))); // NOI18N
        panelLaboratorio.add(lblImagenEnergia);
        lblImagenEnergia.setBounds(210, 0, 49, 50);

        progressEnergia.setValue(100);
        panelLaboratorio.add(progressEnergia);
        progressEnergia.setBounds(220, 50, 40, 20);

        lblImagenFelicidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felicidad.png"))); // NOI18N
        panelLaboratorio.add(lblImagenFelicidad);
        lblImagenFelicidad.setBounds(280, 10, 40, 40);

        progressFelicidad.setValue(100);
        panelLaboratorio.add(progressFelicidad);
        progressFelicidad.setBounds(280, 50, 40, 20);

        lblImagePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pou_estudiante.png"))); // NOI18N
        panelLaboratorio.add(lblImagePou);
        lblImagePou.setBounds(100, 140, 155, 174);

        btn_Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right_arrow.png"))); // NOI18N
        btn_Siguiente.setBorderPainted(false);
        btn_Siguiente.setContentAreaFilled(false);
        panelLaboratorio.add(btn_Siguiente);
        btn_Siguiente.setBounds(280, 230, 80, 40);

        lblBotiquin.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblBotiquin.setText("Botiquin");
        panelLaboratorio.add(lblBotiquin);
        lblBotiquin.setBounds(10, 480, 60, 20);

        btn_botiquin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cofre.png"))); // NOI18N
        btn_botiquin.setBorderPainted(false);
        btn_botiquin.setContentAreaFilled(false);
        btn_botiquin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_botiquinActionPerformed(evt);
            }
        });
        panelLaboratorio.add(btn_botiquin);
        btn_botiquin.setBounds(10, 390, 82, 91);

        btn_Posion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pildora_verde.png"))); // NOI18N
        btn_Posion.setBorderPainted(false);
        btn_Posion.setContentAreaFilled(false);
        btn_Posion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PosionActionPerformed(evt);
            }
        });
        panelLaboratorio.add(btn_Posion);
        btn_Posion.setBounds(140, 410, 73, 67);

        lblCantidadPosion.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblCantidadPosion.setText("Pildora Verde X 5");
        panelLaboratorio.add(lblCantidadPosion);
        lblCantidadPosion.setBounds(120, 480, 110, 18);

        btn_Tienda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/shop.png"))); // NOI18N
        btn_Tienda.setBorderPainted(false);
        btn_Tienda.setContentAreaFilled(false);
        btn_Tienda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TiendaActionPerformed(evt);
            }
        });
        panelLaboratorio.add(btn_Tienda);
        btn_Tienda.setBounds(250, 390, 93, 86);

        lblTienda.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblTienda.setText("Tienda");
        panelLaboratorio.add(lblTienda);
        lblTienda.setBounds(280, 480, 50, 18);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelLaboratorio, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_botiquinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_botiquinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_botiquinActionPerformed

    private void btn_PosionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PosionActionPerformed
        
    }//GEN-LAST:event_btn_PosionActionPerformed

    private void btn_TiendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TiendaActionPerformed
        EstanteRefrigerador er = new EstanteRefrigerador();
        er.setSize(369, 297);
        er.setVisible(true);
    }//GEN-LAST:event_btn_TiendaActionPerformed

    private void btn_AnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AnteriorActionPerformed
        Cocina cocina = new Cocina();
        cocina.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_AnteriorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Laboratorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Laboratorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Posion;
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JButton btn_Tienda;
    private javax.swing.JButton btn_botiquin;
    private javax.swing.JLabel lblBotiquin;
    private javax.swing.JLabel lblCantidadPosion;
    private javax.swing.JLabel lblImageCoin;
    private javax.swing.JLabel lblImagePou;
    private javax.swing.JLabel lblImagenEnergia;
    private javax.swing.JLabel lblImagenFelicidad;
    private javax.swing.JLabel lblImagenHambrePou;
    private javax.swing.JLabel lblImagenSalud;
    private javax.swing.JLabel lblTienda;
    private javax.swing.JPanel panelLaboratorio;
    private javax.swing.JProgressBar progressEnergia;
    private javax.swing.JProgressBar progressFelicidad;
    private javax.swing.JProgressBar progressHambre;
    private javax.swing.JProgressBar progressSalud;
    // End of variables declaration//GEN-END:variables
}
