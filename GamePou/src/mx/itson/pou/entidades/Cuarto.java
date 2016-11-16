/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pou.entidades;

/**
 *
 * @author SaulUrias
 */
public class Cuarto extends javax.swing.JFrame {

    /**
     * Creates new form Cuarto
     */
    public Cuarto() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCuarto = new javax.swing.JPanel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cuarto");

        panelCuarto.setBackground(new java.awt.Color(204, 100, 206));
        panelCuarto.setLayout(null);

        btn_Anterior.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/left_arrow.png"))); // NOI18N
        btn_Anterior.setBorderPainted(false);
        btn_Anterior.setContentAreaFilled(false);
        panelCuarto.add(btn_Anterior);
        btn_Anterior.setBounds(0, 229, 80, 40);

        lblImageCoin.setFont(new java.awt.Font("Seravek", 1, 14)); // NOI18N
        lblImageCoin.setForeground(new java.awt.Color(255, 255, 0));
        lblImageCoin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/coin.png"))); // NOI18N
        lblImageCoin.setText("x 5000");
        panelCuarto.add(lblImageCoin);
        lblImageCoin.setBounds(6, 14, 86, 34);

        lblImagenHambrePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/hambre.png"))); // NOI18N
        panelCuarto.add(lblImagenHambrePou);
        lblImagenHambrePou.setBounds(110, 10, 30, 33);

        progressHambre.setToolTipText("");
        progressHambre.setValue(20);
        panelCuarto.add(progressHambre);
        progressHambre.setBounds(100, 50, 40, 20);

        lblImagenSalud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/heart.png"))); // NOI18N
        panelCuarto.add(lblImagenSalud);
        lblImagenSalud.setBounds(160, 10, 35, 30);

        progressSalud.setValue(100);
        panelCuarto.add(progressSalud);
        progressSalud.setBounds(160, 50, 40, 20);

        lblImagenEnergia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/energy.png"))); // NOI18N
        panelCuarto.add(lblImagenEnergia);
        lblImagenEnergia.setBounds(210, 0, 49, 50);

        progressEnergia.setValue(100);
        panelCuarto.add(progressEnergia);
        progressEnergia.setBounds(220, 50, 40, 20);

        lblImagenFelicidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/felicidad.png"))); // NOI18N
        panelCuarto.add(lblImagenFelicidad);
        lblImagenFelicidad.setBounds(280, 10, 40, 40);

        progressFelicidad.setValue(100);
        panelCuarto.add(progressFelicidad);
        progressFelicidad.setBounds(280, 50, 40, 20);

        lblImagePou.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pou_estudiante.png"))); // NOI18N
        panelCuarto.add(lblImagePou);
        lblImagePou.setBounds(100, 140, 155, 174);

        btn_Siguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/right_arrow.png"))); // NOI18N
        btn_Siguiente.setBorderPainted(false);
        btn_Siguiente.setContentAreaFilled(false);
        panelCuarto.add(btn_Siguiente);
        btn_Siguiente.setBounds(280, 230, 80, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCuarto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Cuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cuarto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cuarto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Anterior;
    private javax.swing.JButton btn_Siguiente;
    private javax.swing.JLabel lblImageCoin;
    private javax.swing.JLabel lblImagePou;
    private javax.swing.JLabel lblImagenEnergia;
    private javax.swing.JLabel lblImagenFelicidad;
    private javax.swing.JLabel lblImagenHambrePou;
    private javax.swing.JLabel lblImagenSalud;
    private javax.swing.JPanel panelCuarto;
    private javax.swing.JProgressBar progressEnergia;
    private javax.swing.JProgressBar progressFelicidad;
    private javax.swing.JProgressBar progressHambre;
    private javax.swing.JProgressBar progressSalud;
    // End of variables declaration//GEN-END:variables
}
