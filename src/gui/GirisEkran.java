/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.DBConnection;
import gui.settings.ButtonSettings;
import gui.settings.IRegulator;
import gui.settings.TextSettings;
import gui.settings.ActionSettings;
import java.awt.Color;

/**
 *
 * @author User
 */
public class GirisEkran extends javax.swing.JFrame implements IRegulator{

    private final String SexsiyyetNo_Text_Original = "SexsiyyetNo Aze No";
    private final String Password_Text_Original = "Password";
    
    public GirisEkran() {
        initComponents();
        getEdits();
        new DBConnection();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        girisPanel = new javax.swing.JPanel();
        xosgeldinizMesaj = new javax.swing.JLabel();
        kimlikText = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        girisButton = new javax.swing.JButton();
        joinQuestion = new javax.swing.JLabel();
        joinButton = new javax.swing.JButton();
        sifremiUnutdumLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bizim Bank");

        girisPanel.setBackground(new java.awt.Color(204, 255, 204));

        xosgeldinizMesaj.setFont(new java.awt.Font("Bauhaus 93", 0, 24)); // NOI18N
        xosgeldinizMesaj.setForeground(new java.awt.Color(255, 51, 51));
        xosgeldinizMesaj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        xosgeldinizMesaj.setText("Bizim Banka Xos Geldiniz");
        xosgeldinizMesaj.setToolTipText("");

        kimlikText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        kimlikText.setForeground(new java.awt.Color(102, 102, 102));
        kimlikText.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                kimlikTextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                kimlikTextFocusLost(evt);
            }
        });

        passwordField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        passwordField.setForeground(new java.awt.Color(102, 102, 102));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFieldFocusLost(evt);
            }
        });

        girisButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        girisButton.setText("Giris");
        girisButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        girisButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                girisButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                girisButtonMouseExited(evt);
            }
        });
        girisButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisButtonActionPerformed(evt);
            }
        });

        joinQuestion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        joinQuestion.setText("Do you want to join us?");

        joinButton.setBackground(new java.awt.Color(0, 153, 102));
        joinButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        joinButton.setText("Join");
        joinButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        joinButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                joinButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                joinButtonMouseExited(evt);
            }
        });
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });

        sifremiUnutdumLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        sifremiUnutdumLabel.setForeground(new java.awt.Color(0, 102, 102));
        sifremiUnutdumLabel.setText("Sifremi Unutdum?!");
        sifremiUnutdumLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifremiUnutdumLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifremiUnutdumLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout girisPanelLayout = new javax.swing.GroupLayout(girisPanel);
        girisPanel.setLayout(girisPanelLayout);
        girisPanelLayout.setHorizontalGroup(
            girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisPanelLayout.createSequentialGroup()
                .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(girisPanelLayout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(xosgeldinizMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(girisPanelLayout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(girisPanelLayout.createSequentialGroup()
                                .addComponent(joinQuestion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(joinButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(girisPanelLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(girisButton, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(99, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, girisPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sifremiUnutdumLabel)
                .addGap(191, 191, 191))
        );

        girisPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {kimlikText, passwordField});

        girisPanelLayout.setVerticalGroup(
            girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(girisPanelLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(xosgeldinizMesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(kimlikText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(girisButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sifremiUnutdumLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(girisPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(joinQuestion)
                    .addComponent(joinButton))
                .addGap(104, 104, 104))
        );

        girisPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {girisButton, passwordField});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(girisPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        girisPanel.setFocusable(true);
        kimlikText.setText(SexsiyyetNo_Text_Original);
        passwordField.setText(Password_Text_Original);
        TextSettings.setOnlyNumber(kimlikText);
    }
    
    
    /*
    button renglendirmeleri
    */
       
    private void girisButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseEntered
        ButtonSettings.setBgFg(girisButton, Color.LIGHT_GRAY, Color.BLACK);
    }//GEN-LAST:event_girisButtonMouseEntered

    private void girisButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_girisButtonMouseExited
        ButtonSettings.setOriginalBgFg(girisButton);
    }//GEN-LAST:event_girisButtonMouseExited

    private void joinButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinButtonMouseEntered
        ButtonSettings.setBgFg(joinButton, Color.green, Color.BLACK);
    }//GEN-LAST:event_joinButtonMouseEntered

    private void joinButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_joinButtonMouseExited
        ButtonSettings.setOriginalBgFg(joinButton);
    }//GEN-LAST:event_joinButtonMouseExited

    /*
    Text settings
    */
    private void kimlikTextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusGained
        TextSettings.checkTheTextFocusGained(kimlikText, SexsiyyetNo_Text_Original);
        
    }//GEN-LAST:event_kimlikTextFocusGained

    private void kimlikTextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_kimlikTextFocusLost
        TextSettings.checkTheTextFocusLost(kimlikText);
    }//GEN-LAST:event_kimlikTextFocusLost

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        TextSettings.checkTheTextFocusGained(passwordField, Password_Text_Original);
    }//GEN-LAST:event_passwordFieldFocusGained

    private void passwordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusLost
        TextSettings.checkTheTextFocusLost(passwordField);
    }//GEN-LAST:event_passwordFieldFocusLost

    /*
    Button Actions
    */
    private void girisButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisButtonActionPerformed
        ActionSettings.setVisible(this, new HesabEkrani());
    }//GEN-LAST:event_girisButtonActionPerformed

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        ActionSettings.setVisible(this, new RegistrationEkran());
    }//GEN-LAST:event_joinButtonActionPerformed

    private void sifremiUnutdumLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifremiUnutdumLabelMouseClicked
        passwordUpdateEkrani passwordUpdateEkrani = new passwordUpdateEkrani();
        ActionSettings.setVisible(this, passwordUpdateEkrani);
        passwordUpdateEkrani.getEvvelkiSifreTextfield().setEnabled(false);
    }//GEN-LAST:event_sifremiUnutdumLabelMouseClicked

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
            java.util.logging.Logger.getLogger(GirisEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton girisButton;
    private javax.swing.JPanel girisPanel;
    private javax.swing.JButton joinButton;
    private javax.swing.JLabel joinQuestion;
    private javax.swing.JTextField kimlikText;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel sifremiUnutdumLabel;
    private javax.swing.JLabel xosgeldinizMesaj;
    // End of variables declaration//GEN-END:variables
}
