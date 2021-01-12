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


public class GonderEkrani extends javax.swing.JFrame implements IRegulator{

    private final String Musteri_No_Text_Original = "Musteri No";
    private int gonderilecekMiqdar =0;
    public GonderEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        gonderEkraniPaneli.setFocusable(true);
        TextSettings.setOnlyNumber(gonderilenMiqdarTextfield);
        TextSettings.setOnlyNumber(gonderilenIstifadeciTextfield);
        TextSettings.setMaxLimit(gonderilenIstifadeciTextfield, 10);
        gonderilenIstifadeciTextfield.setText(Musteri_No_Text_Original);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gonderEkraniPaneli = new javax.swing.JPanel();
        adSoyadLabel = new javax.swing.JLabel();
        limitWarningLabel = new javax.swing.JLabel();
        toplamHesabLabel = new javax.swing.JLabel();
        miqdarLabel = new javax.swing.JLabel();
        gonderilenMeblegLabel = new javax.swing.JLabel();
        gonderilenMiqdarTextfield = new javax.swing.JTextField();
        pulKocurButton = new javax.swing.JButton();
        previousLabel = new javax.swing.JLabel();
        gonderilenIstifadeciTextfield = new javax.swing.JTextField();
        gonderilenIstifadeciLabel = new javax.swing.JLabel();
        defaultGonderIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Transfer Penceresi");

        gonderEkraniPaneli.setBackground(new java.awt.Color(0, 153, 102));
        gonderEkraniPaneli.setToolTipText("");

        adSoyadLabel.setFont(new java.awt.Font("Niagara Engraved", 1, 28)); // NOI18N
        adSoyadLabel.setForeground(new java.awt.Color(0, 0, 51));
        adSoyadLabel.setText("[ Istifadeci Ad soyad ]");

        limitWarningLabel.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        limitWarningLabel.setForeground(new java.awt.Color(102, 0, 0));
        limitWarningLabel.setText("Birdefelik max 20000 ve alti gondere bilersiz! ");

        toplamHesabLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        toplamHesabLabel.setText("Toplam hesabiniz :");

        miqdarLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        miqdarLabel.setText("[ Miqdar ]");

        gonderilenMeblegLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        gonderilenMeblegLabel.setText("Gondereceyiniz mebleg :");

        gonderilenMiqdarTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderilenMiqdarTextfieldActionPerformed(evt);
            }
        });
        gonderilenMiqdarTextfield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gonderilenMiqdarTextfieldKeyReleased(evt);
            }
        });

        pulKocurButton.setBackground(new java.awt.Color(255, 255, 204));
        pulKocurButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pulKocurButton.setText("Gonder");
        pulKocurButton.setToolTipText("Pul Kocur");
        pulKocurButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pulKocurButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pulKocurButtonActionPerformed(evt);
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

        gonderilenIstifadeciTextfield.setForeground(new java.awt.Color(153, 153, 153));
        gonderilenIstifadeciTextfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                gonderilenIstifadeciTextfieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gonderilenIstifadeciTextfieldFocusLost(evt);
            }
        });
        gonderilenIstifadeciTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gonderilenIstifadeciTextfieldActionPerformed(evt);
            }
        });

        gonderilenIstifadeciLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        gonderilenIstifadeciLabel.setText("Gondereceyiniz istifadeci :");

        defaultGonderIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_exchange_50px_1.png"))); // NOI18N

        javax.swing.GroupLayout gonderEkraniPaneliLayout = new javax.swing.GroupLayout(gonderEkraniPaneli);
        gonderEkraniPaneli.setLayout(gonderEkraniPaneliLayout);
        gonderEkraniPaneliLayout.setHorizontalGroup(
            gonderEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gonderEkraniPaneliLayout.createSequentialGroup()
                .addGroup(gonderEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(gonderEkraniPaneliLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(defaultGonderIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(previousLabel)
                    .addGroup(gonderEkraniPaneliLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(limitWarningLabel))
                    .addGroup(gonderEkraniPaneliLayout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(toplamHesabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(miqdarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(gonderEkraniPaneliLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(gonderEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(gonderEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(gonderilenIstifadeciLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gonderilenIstifadeciTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(gonderEkraniPaneliLayout.createSequentialGroup()
                                .addComponent(gonderilenMeblegLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(gonderilenMiqdarTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gonderEkraniPaneliLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pulKocurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
        );

        gonderEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {gonderilenIstifadeciLabel, gonderilenMeblegLabel, toplamHesabLabel});

        gonderEkraniPaneliLayout.setVerticalGroup(
            gonderEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gonderEkraniPaneliLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(previousLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(gonderEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(defaultGonderIcon))
                .addGap(29, 29, 29)
                .addComponent(limitWarningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(gonderEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(miqdarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(toplamHesabLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(gonderEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gonderilenMiqdarTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gonderilenMeblegLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gonderEkraniPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gonderilenIstifadeciLabel)
                    .addComponent(gonderilenIstifadeciTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pulKocurButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        gonderEkraniPaneliLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {gonderilenIstifadeciLabel, gonderilenIstifadeciTextfield, gonderilenMeblegLabel, gonderilenMiqdarTextfield, toplamHesabLabel});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gonderEkraniPaneli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gonderEkraniPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gonderilenMiqdarTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderilenMiqdarTextfieldActionPerformed

    }//GEN-LAST:event_gonderilenMiqdarTextfieldActionPerformed

    private void gonderilenMiqdarTextfieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gonderilenMiqdarTextfieldKeyReleased

        this.gonderilecekMiqdar = TextSettings.checkTheTextReleased(gonderilenMiqdarTextfield, 20000);
    }//GEN-LAST:event_gonderilenMiqdarTextfieldKeyReleased

    private void pulKocurButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pulKocurButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Success \n"+
            "Cekilen Miqdar "+ gonderilecekMiqdar + " $");
        ActionSettings.setVisible(this, new HesabEkrani());
    }//GEN-LAST:event_pulKocurButtonActionPerformed

    private void previousLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousLabelMouseClicked
        ActionSettings.setVisible(this, new HesabEkrani());
    }//GEN-LAST:event_previousLabelMouseClicked

    private void gonderilenIstifadeciTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gonderilenIstifadeciTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gonderilenIstifadeciTextfieldActionPerformed

    private void gonderilenIstifadeciTextfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gonderilenIstifadeciTextfieldFocusGained
        TextSettings.checkTheTextFocusGained(gonderilenIstifadeciTextfield, Musteri_No_Text_Original);
    }//GEN-LAST:event_gonderilenIstifadeciTextfieldFocusGained

    private void gonderilenIstifadeciTextfieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gonderilenIstifadeciTextfieldFocusLost
        TextSettings.checkTheTextFocusLost(gonderilenIstifadeciTextfield);
    }//GEN-LAST:event_gonderilenIstifadeciTextfieldFocusLost

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
            java.util.logging.Logger.getLogger(GonderEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GonderEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GonderEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GonderEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GonderEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JLabel defaultGonderIcon;
    private javax.swing.JPanel gonderEkraniPaneli;
    private javax.swing.JLabel gonderilenIstifadeciLabel;
    private javax.swing.JTextField gonderilenIstifadeciTextfield;
    private javax.swing.JLabel gonderilenMeblegLabel;
    private javax.swing.JTextField gonderilenMiqdarTextfield;
    private javax.swing.JLabel limitWarningLabel;
    private javax.swing.JLabel miqdarLabel;
    private javax.swing.JLabel previousLabel;
    private javax.swing.JButton pulKocurButton;
    private javax.swing.JLabel toplamHesabLabel;
    // End of variables declaration//GEN-END:variables
}
