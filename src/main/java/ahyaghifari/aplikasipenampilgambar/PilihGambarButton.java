/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ahyaghifari.aplikasipenampilgambar;

import java.awt.CardLayout;
import javax.swing.JOptionPane;

/**
 *
 * @author Ahya Ghifari
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        buttonPanel = new javax.swing.JPanel();
        btnSuperman = new javax.swing.JButton();
        btnBatman = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnAquaman = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        lbSuperman = new javax.swing.JLabel();
        lbBatman = new javax.swing.JLabel();
        btnBlackAdam = new javax.swing.JLabel();
        lblAquaman = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSuperman.setBackground(new java.awt.Color(204, 0, 0));
        btnSuperman.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnSuperman.setForeground(new java.awt.Color(255, 255, 0));
        btnSuperman.setText("Superman");
        btnSuperman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupermanActionPerformed(evt);
            }
        });
        buttonPanel.add(btnSuperman);

        btnBatman.setBackground(new java.awt.Color(0, 0, 0));
        btnBatman.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnBatman.setForeground(new java.awt.Color(255, 255, 255));
        btnBatman.setText("Batman");
        btnBatman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatmanActionPerformed(evt);
            }
        });
        buttonPanel.add(btnBatman);

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Black Adam");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        buttonPanel.add(jButton1);

        btnAquaman.setBackground(new java.awt.Color(0, 0, 204));
        btnAquaman.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnAquaman.setForeground(new java.awt.Color(255, 255, 255));
        btnAquaman.setText("Aquaman");
        btnAquaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAquamanActionPerformed(evt);
            }
        });
        buttonPanel.add(btnAquaman);

        btnKeluar.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        buttonPanel.add(btnKeluar);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        lbSuperman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSuperman.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahyaghifari\\Documents\\NetBeansProjects\\AplikasiPenampilGambar\\superman.jpg")); // NOI18N
        imagePanel.add(lbSuperman, "0");

        lbBatman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBatman.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahyaghifari\\Documents\\NetBeansProjects\\AplikasiPenampilGambar\\batman.jpg")); // NOI18N
        imagePanel.add(lbBatman, "1");

        btnBlackAdam.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBlackAdam.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahyaghifari\\Documents\\NetBeansProjects\\AplikasiPenampilGambar\\blackadam.jpg")); // NOI18N
        imagePanel.add(btnBlackAdam, "2");

        lblAquaman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAquaman.setIcon(new javax.swing.ImageIcon("C:\\Users\\ahyaghifari\\Documents\\NetBeansProjects\\AplikasiPenampilGambar\\aquaman.jpg")); // NOI18N
        imagePanel.add(lblAquaman, "3");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupermanActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_btnSupermanActionPerformed

    private void btnBatmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatmanActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_btnBatmanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnAquamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAquamanActionPerformed
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "3");
    }//GEN-LAST:event_btnAquamanActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        int keluar = JOptionPane.showConfirmDialog(this, "Yakin ingin keluar", "KELUAR", JOptionPane.YES_NO_OPTION);
        if(keluar == 0){
            System.exit(0);
        }
                
    }//GEN-LAST:event_btnKeluarActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAquaman;
    private javax.swing.JButton btnBatman;
    private javax.swing.JLabel btnBlackAdam;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSuperman;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbBatman;
    private javax.swing.JLabel lbSuperman;
    private javax.swing.JLabel lblAquaman;
    // End of variables declaration//GEN-END:variables
}
