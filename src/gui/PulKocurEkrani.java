/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import gui.settings.ActionSettings;
import gui.settings.IRegulator;
import gui.settings.TextSettings;
import javax.swing.JOptionPane;


public class PulKocurEkrani extends javax.swing.JFrame implements IRegulator{

    private int kocurulenMiqdar = 0;
    public PulKocurEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        pulKocurEkraniiPanel.setFocusable(true);
        TextSettings.setOnlyNumber(kocurulenMiqdarTextfield);
        TextSettings.setMaxLimit(kocurulenMiqdarTextfield, 5);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pulKocurEkraniiPanel = new javax.swing.JPanel();
        adSoyadLabel = new javax.swing.JLabel();
        limitWarningLabel = new javax.swing.JLabel();
        toplamHesabLabel = new javax.swing.JLabel();
        miqdarLabel = new javax.swing.JLabel();
        kocuruluenMeblegLabel = new javax.swing.JLabel();
        kocurulenMiqdarTextfield = new javax.swing.JTextField();
        gonderButton = new javax.swing.JButton();
        previousLabel = new javax.swing.JLabel();
        defaultPulkocurIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pul Kocurme Penceresi");

        pulKocurEkraniiPanel.setBackground(new java.awt.Color(153, 204, 255));
        pulKocurEkraniiPanel.setToolTipText("");

        adSoyadLabel.setFont(new java.awt.Font("Niagara Engraved", 1, 28)); // NOI18N
        adSoyadLabel.setForeground(new java.awt.Color(0, 0, 51));
        adSoyadLabel.setText("[ Istifadeci Ad soyad ]");

        limitWarningLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        limitWarningLabel.setForeground(new java.awt.Color(102, 0, 0));
        limitWarningLabel.setText("Gunluk max 40000 kocurme icaze verilir!");

        toplamHesabLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toplamHesabLabel.setText("Toplam hesabiniz :");

        miqdarLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        miqdarLabel.setText("[ Miqdar ]");

        kocuruluenMeblegLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        kocuruluenMeblegLabel.setText("Kocureceyiniz mebleg :");

        kocurulenMiqdarTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kocurulenMiqdarTextfieldActionPerformed(evt);
            }
        });
        kocurulenMiqdarTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                kocurulenMiqdarTextfieldKeyReleased(evt);
            }
        });

        gonderButton.setBackground(new java.awt.Color(255, 255, 204));
        gonderButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gonderButton.setText("Gonder");
        gonderButton.setToolTipText("Gonder");
        gonderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        gonderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderButtonActionPerformed(evt);
            }
        });

        previousLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/previousIcon.png"))); // NOI18N
        previousLabel.setToolTipText("Back");
        previousLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousLabelMouseClicked(evt);
            }
        });

        defaultPulkocurIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_money_50px.png"))); // NOI18N

        javax.swing.GroupLayout pulKocurEkraniiPanelLayout = new javax.swing.GroupLayout(pulKocurEkraniiPanel);
        pulKocurEkraniiPanel.setLayout(pulKocurEkraniiPanelLayout);
        pulKocurEkraniiPanelLayout.setHorizontalGroup(
            pulKocurEkraniiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pulKocurEkraniiPanelLayout.createSequentialGroup()
                .addGroup(pulKocurEkraniiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pulKocurEkraniiPanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(limitWarningLabel))
                    .addGroup(pulKocurEkraniiPanelLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(pulKocurEkraniiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(kocuruluenMeblegLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(toplamHesabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pulKocurEkraniiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(miqdarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(kocurulenMiqdarTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pulKocurEkraniiPanelLayout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(gonderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pulKocurEkraniiPanelLayout.createSequentialGroup()
                        .addComponent(previousLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(defaultPulkocurIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        pulKocurEkraniiPanelLayout.setVerticalGroup(
            pulKocurEkraniiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pulKocurEkraniiPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(pulKocurEkraniiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pulKocurEkraniiPanelLayout.createSequentialGroup()
                        .addComponent(previousLabel)
                        .addGap(16, 16, 16)
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(defaultPulkocurIcon))
                .addGap(38, 38, 38)
                .addComponent(limitWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(pulKocurEkraniiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miqdarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toplamHesabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(pulKocurEkraniiPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kocuruluenMeblegLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(kocurulenMiqdarTextfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(gonderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pulKocurEkraniiPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {kocurulenMiqdarTextfield, kocuruluenMeblegLabel, toplamHesabLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pulKocurEkraniiPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pulKocurEkraniiPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kocurulenMiqdarTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kocurulenMiqdarTextfieldActionPerformed

    }//GEN-LAST:event_kocurulenMiqdarTextfieldActionPerformed

    private void kocurulenMiqdarTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_kocurulenMiqdarTextfieldKeyReleased

        this.kocurulenMiqdar = TextSettings.checkTheTextReleased(kocurulenMiqdarTextfield, 40000);

    }//GEN-LAST:event_kocurulenMiqdarTextfieldKeyReleased

    private void gonderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Success \n"+
            "Cekilen Miqdar "+ kocurulenMiqdar + " $");
        ActionSettings.setVisible(this, new HesabEkrani());
    }//GEN-LAST:event_gonderButtonActionPerformed

    private void previousLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousLabelMouseClicked
        ActionSettings.setVisible(this, new HesabEkrani());
    }//GEN-LAST:event_previousLabelMouseClicked

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
            java.util.logging.Logger.getLogger(PulKocurEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PulKocurEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PulKocurEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PulKocurEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PulKocurEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JLabel defaultPulkocurIcon;
    private javax.swing.JButton gonderButton;
    private javax.swing.JTextField kocurulenMiqdarTextfield;
    private javax.swing.JLabel kocuruluenMeblegLabel;
    private javax.swing.JLabel limitWarningLabel;
    private javax.swing.JLabel miqdarLabel;
    private javax.swing.JLabel previousLabel;
    private javax.swing.JPanel pulKocurEkraniiPanel;
    private javax.swing.JLabel toplamHesabLabel;
    // End of variables declaration//GEN-END:variables
}
