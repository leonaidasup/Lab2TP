/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.superhumanos.view;
import com.mycompany.superhumanos.view.HumansInput;

/**
 *
 * @author Leonardo.amaris
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form menu
     */
    public Menu() {
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

        Guerra = new javax.swing.JButton();
        LlegadaAlFis = new javax.swing.JButton();
        MostrarAlFIs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Admitidos = new javax.swing.JButton();
        Rechazados = new javax.swing.JButton();
        FormarEscuadrones = new javax.swing.JButton();
        IngresarHumanos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Guerra.setText("Guerra");
        Guerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuerraActionPerformed(evt);
            }
        });

        LlegadaAlFis.setText("Llegada");

        MostrarAlFIs.setText("Mostrar");

        jLabel2.setText("Llegada de AlFIs");

        Admitidos.setText("Admitidos");

        Rechazados.setText("Rechazados");
        Rechazados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RechazadosActionPerformed(evt);
            }
        });

        FormarEscuadrones.setText("Escuadrones");
        FormarEscuadrones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormarEscuadronesActionPerformed(evt);
            }
        });

        IngresarHumanos.setText("Ingresar");
        IngresarHumanos.setHideActionText(true);
        IngresarHumanos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        IngresarHumanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarHumanosActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingresar Humano o SuperHumano");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(IngresarHumanos))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Admitidos)
                        .addGap(18, 18, 18)
                        .addComponent(Rechazados)
                        .addGap(18, 18, 18)
                        .addComponent(FormarEscuadrones))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Guerra)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LlegadaAlFis)
                                .addGap(18, 18, 18)
                                .addComponent(MostrarAlFIs)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IngresarHumanos))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Admitidos)
                    .addComponent(Rechazados)
                    .addComponent(FormarEscuadrones))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(LlegadaAlFis)
                    .addComponent(MostrarAlFIs))
                .addGap(34, 34, 34)
                .addComponent(Guerra)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GuerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuerraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GuerraActionPerformed

    private void RechazadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RechazadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RechazadosActionPerformed

    private void FormarEscuadronesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormarEscuadronesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormarEscuadronesActionPerformed

    private void IngresarHumanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarHumanosActionPerformed
        HumansInput humanInputPanel = new HumansInput();
        
    }//GEN-LAST:event_IngresarHumanosActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Admitidos;
    private javax.swing.JButton FormarEscuadrones;
    private javax.swing.JButton Guerra;
    private javax.swing.JButton IngresarHumanos;
    private javax.swing.JButton LlegadaAlFis;
    private javax.swing.JButton MostrarAlFIs;
    private javax.swing.JButton Rechazados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
