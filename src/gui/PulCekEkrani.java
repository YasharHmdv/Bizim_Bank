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



public class PulCekEkrani extends javax.swing.JFrame implements IRegulator{

    
    private int cekilecekMiqdar = 0;
    
    public PulCekEkrani() {
        initComponents();
        getEdits();
        
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        pulCekEkraniPanel.setFocusable(true);
        TextSettings.setOnlyNumber(cekilenMiqdarTextfield);
        TextSettings.setMaxLimit(cekilenMiqdarTextfield, 4);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pulCekEkraniPanel = new javax.swing.JPanel();
        adSoyadLabel = new javax.swing.JLabel();
        limitWarningLabel = new javax.swing.JLabel();
        toplamHesabLabel = new javax.swing.JLabel();
        miqdarLabel = new javax.swing.JLabel();
        cekilenMiqdarLabel = new javax.swing.JLabel();
        cekilenMiqdarTextfield = new javax.swing.JTextField();
        pulCekButton = new javax.swing.JButton();
        previousLabel = new javax.swing.JLabel();
        deafultPulkocurIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pul Cekme Penceresi");

        pulCekEkraniPanel.setBackground(new java.awt.Color(204, 204, 255));
        pulCekEkraniPanel.setToolTipText("");

        adSoyadLabel.setFont(new java.awt.Font("Niagara Engraved", 1, 28)); // NOI18N
        adSoyadLabel.setForeground(new java.awt.Color(0, 0, 51));
        adSoyadLabel.setText("[ Istifadeci Ad soyad ]");

        limitWarningLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        limitWarningLabel.setForeground(new java.awt.Color(102, 0, 0));
        limitWarningLabel.setText("Gunluk max 5000 icaze verilir!");

        toplamHesabLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toplamHesabLabel.setText("Toplam hesabiniz :");

        miqdarLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        miqdarLabel.setText("[ Miqdar ]");

        cekilenMiqdarLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        cekilenMiqdarLabel.setText("Cekeceyiniz miqdar :");

        cekilenMiqdarTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cekilenMiqdarTextfieldActionPerformed(evt);
            }
        });
        cekilenMiqdarTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cekilenMiqdarTextfieldKeyReleased(evt);
            }
        });

        pulCekButton.setText("Pul Cek");
        pulCekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pulCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulCekButtonActionPerformed(evt);
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

        deafultPulkocurIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_money_transfer_50px_1.png"))); // NOI18N

        javax.swing.GroupLayout pulCekEkraniPanelLayout = new javax.swing.GroupLayout(pulCekEkraniPanel);
        pulCekEkraniPanel.setLayout(pulCekEkraniPanelLayout);
        pulCekEkraniPanelLayout.setHorizontalGroup(
            pulCekEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pulCekEkraniPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pulCekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(pulCekEkraniPanelLayout.createSequentialGroup()
                .addGroup(pulCekEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pulCekEkraniPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(pulCekEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pulCekEkraniPanelLayout.createSequentialGroup()
                                .addComponent(cekilenMiqdarLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cekilenMiqdarTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pulCekEkraniPanelLayout.createSequentialGroup()
                                .addGroup(pulCekEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(limitWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pulCekEkraniPanelLayout.createSequentialGroup()
                                        .addComponent(toplamHesabLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(miqdarLabel)))
                                .addGap(37, 37, 37))))
                    .addComponent(previousLabel)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pulCekEkraniPanelLayout.createSequentialGroup()
                        .addComponent(deafultPulkocurIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pulCekEkraniPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cekilenMiqdarLabel, cekilenMiqdarTextfield, miqdarLabel, toplamHesabLabel});

        pulCekEkraniPanelLayout.setVerticalGroup(
            pulCekEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pulCekEkraniPanelLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(previousLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pulCekEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deafultPulkocurIcon))
                .addGap(32, 32, 32)
                .addComponent(limitWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(pulCekEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toplamHesabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(miqdarLabel))
                .addGap(18, 18, 18)
                .addGroup(pulCekEkraniPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cekilenMiqdarLabel)
                    .addComponent(cekilenMiqdarTextfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pulCekButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pulCekEkraniPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cekilenMiqdarLabel, cekilenMiqdarTextfield, miqdarLabel, toplamHesabLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pulCekEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pulCekEkraniPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cekilenMiqdarTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cekilenMiqdarTextfieldActionPerformed
        
    }//GEN-LAST:event_cekilenMiqdarTextfieldActionPerformed

    private void cekilenMiqdarTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cekilenMiqdarTextfieldKeyReleased
        
        this.cekilecekMiqdar = TextSettings.checkTheTextReleased(cekilenMiqdarTextfield, 5000);
        
    }//GEN-LAST:event_cekilenMiqdarTextfieldKeyReleased

    private void previousLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousLabelMouseClicked
        ActionSettings.setVisible(this, new HesabEkrani());
    }//GEN-LAST:event_previousLabelMouseClicked

    private void pulCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulCekButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Success \n"+
                "Cekilen Miqdar "+ cekilecekMiqdar + "$");
        ActionSettings.setVisible(this, new HesabEkrani());
    }//GEN-LAST:event_pulCekButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PulCekEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PulCekEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PulCekEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PulCekEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PulCekEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JLabel cekilenMiqdarLabel;
    private javax.swing.JTextField cekilenMiqdarTextfield;
    private javax.swing.JLabel deafultPulkocurIcon;
    private javax.swing.JLabel limitWarningLabel;
    private javax.swing.JLabel miqdarLabel;
    private javax.swing.JLabel previousLabel;
    private javax.swing.JButton pulCekButton;
    private javax.swing.JPanel pulCekEkraniPanel;
    private javax.swing.JLabel toplamHesabLabel;
    // End of variables declaration//GEN-END:variables
}
