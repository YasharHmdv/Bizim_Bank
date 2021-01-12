
package gui;

import gui.settings.ActionSettings;
import gui.settings.IRegulator;
import gui.settings.TextSettings;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class passwordUpdateEkrani extends javax.swing.JFrame implements IRegulator{

    
    public passwordUpdateEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
       
        this.setLocationRelativeTo(null);
        passwordUpdatePanel.setFocusable(true);
        TextSettings.setOnlyNumber(sexsiyyetTextfield);
        TextSettings.setMaxLimit(telefonTextfield, 11);
        TextSettings.setOnlyNumber(telefonTextfield);
    }

    private boolean isEnabledEvvelkiSifre(){
        return this.getEvvelkiSifreTextfield().isEnabled();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        passwordUpdatePanel = new javax.swing.JPanel();
        previousLabel = new javax.swing.JLabel();
        mesajTelLabel = new javax.swing.JLabel();
        mesajSexsiyyetLabel = new javax.swing.JLabel();
        sexsiyyetTextfield = new javax.swing.JTextField();
        telefonTextfield = new javax.swing.JTextField();
        securityAnswerTextfield = new javax.swing.JTextField();
        securityQuestionLabel = new javax.swing.JLabel();
        evvelkiSifreTextfield = new javax.swing.JTextField();
        evvelkiSifreLabel = new javax.swing.JLabel();
        yeniSifreLabel = new javax.swing.JLabel();
        yeniSifreTekrarLabel = new javax.swing.JLabel();
        yenileButton = new javax.swing.JButton();
        sifreYenileMesaj = new javax.swing.JLabel();
        sifreYenileIcon = new javax.swing.JLabel();
        yeniSifreTextfield = new javax.swing.JPasswordField();
        yeniSifreTekrarTextfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sifre Yenileme Ekrani");

        passwordUpdatePanel.setBackground(new java.awt.Color(204, 204, 204));

        previousLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/previousIcon.png"))); // NOI18N
        previousLabel.setToolTipText("Back");
        previousLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousLabelMouseClicked(evt);
            }
        });

        mesajTelLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajTelLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajTelLabel.setText("Telefon :");

        mesajSexsiyyetLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSexsiyyetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSexsiyyetLabel.setText("Sexsiyyet No :");

        sexsiyyetTextfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        telefonTextfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telefonTextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonTextfieldActionPerformed(evt);
            }
        });

        securityAnswerTextfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        securityQuestionLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        securityQuestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        securityQuestionLabel.setText("Security question :");

        evvelkiSifreTextfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        evvelkiSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        evvelkiSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        evvelkiSifreLabel.setText("Evvelki sifre :");

        yeniSifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yeniSifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreLabel.setText("Yeni sifre :");

        yeniSifreTekrarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yeniSifreTekrarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yeniSifreTekrarLabel.setText("Yeni sifrenin tekrari :");

        yenileButton.setText("Yenile");
        yenileButton.setToolTipText("Yenile");
        yenileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        yenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yenileButtonActionPerformed(evt);
            }
        });

        sifreYenileMesaj.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sifreYenileMesaj.setForeground(new java.awt.Color(153, 0, 0));
        sifreYenileMesaj.setText("Sifre Yenileme ");

        sifreYenileIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_password_reset_60px.png"))); // NOI18N

        javax.swing.GroupLayout passwordUpdatePanelLayout = new javax.swing.GroupLayout(passwordUpdatePanel);
        passwordUpdatePanel.setLayout(passwordUpdatePanelLayout);
        passwordUpdatePanelLayout.setHorizontalGroup(
            passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordUpdatePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(yenileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
            .addGroup(passwordUpdatePanelLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordUpdatePanelLayout.createSequentialGroup()
                        .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(mesajTelLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(mesajSexsiyyetLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(securityQuestionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(securityAnswerTextfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefonTextfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexsiyyetTextfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(passwordUpdatePanelLayout.createSequentialGroup()
                        .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yeniSifreTekrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addGroup(passwordUpdatePanelLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(yeniSifreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(evvelkiSifreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(10, 10, 10)
                        .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(evvelkiSifreTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(yeniSifreTextfield)
                            .addComponent(yeniSifreTekrarTextfield))))
                .addGap(52, 52, 52))
            .addGroup(passwordUpdatePanelLayout.createSequentialGroup()
                .addComponent(previousLabel)
                .addGap(27, 27, 27)
                .addComponent(sifreYenileIcon)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sifreYenileMesaj)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        passwordUpdatePanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {evvelkiSifreTextfield, yeniSifreTextfield});

        passwordUpdatePanelLayout.setVerticalGroup(
            passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(passwordUpdatePanelLayout.createSequentialGroup()
                .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(previousLabel)
                    .addGroup(passwordUpdatePanelLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(sifreYenileIcon))
                    .addGroup(passwordUpdatePanelLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(sifreYenileMesaj)))
                .addGap(39, 39, 39)
                .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajSexsiyyetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexsiyyetTextfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mesajTelLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonTextfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(securityQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(securityAnswerTextfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(evvelkiSifreTextfield)
                    .addComponent(evvelkiSifreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(passwordUpdatePanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(yeniSifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, passwordUpdatePanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(yeniSifreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(passwordUpdatePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(yeniSifreTekrarLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(yeniSifreTekrarTextfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yenileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordUpdatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(passwordUpdatePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousLabelMouseClicked
        if(isEnabledEvvelkiSifre()){
        ActionSettings.setVisible(this, new HesabEkrani());
        }else {
            ActionSettings.setVisible(this, new GirisEkran());
        }
    }//GEN-LAST:event_previousLabelMouseClicked

    private void telefonTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonTextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonTextfieldActionPerformed

    private void yenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yenileButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Succes");
        if(isEnabledEvvelkiSifre()){
        ActionSettings.setVisible(this, new HesabEkrani());
        }else {
            ActionSettings.setVisible(this, new GirisEkran());
        }
    }//GEN-LAST:event_yenileButtonActionPerformed

    public JTextField getEvvelkiSifreTextfield() {
        return evvelkiSifreTextfield;
    }

    
    
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
            java.util.logging.Logger.getLogger(passwordUpdateEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(passwordUpdateEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(passwordUpdateEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(passwordUpdateEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new passwordUpdateEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel evvelkiSifreLabel;
    private javax.swing.JTextField evvelkiSifreTextfield;
    private javax.swing.JLabel mesajSexsiyyetLabel;
    private javax.swing.JLabel mesajTelLabel;
    private javax.swing.JPanel passwordUpdatePanel;
    private javax.swing.JLabel previousLabel;
    private javax.swing.JTextField securityAnswerTextfield;
    private javax.swing.JLabel securityQuestionLabel;
    private javax.swing.JTextField sexsiyyetTextfield;
    private javax.swing.JLabel sifreYenileIcon;
    private javax.swing.JLabel sifreYenileMesaj;
    private javax.swing.JTextField telefonTextfield;
    private javax.swing.JLabel yeniSifreLabel;
    private javax.swing.JLabel yeniSifreTekrarLabel;
    private javax.swing.JPasswordField yeniSifreTekrarTextfield;
    private javax.swing.JPasswordField yeniSifreTextfield;
    private javax.swing.JButton yenileButton;
    // End of variables declaration//GEN-END:variables
}
