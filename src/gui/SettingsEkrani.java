
package gui;

import gui.settings.ActionSettings;
import gui.settings.IRegulator;
import gui.settings.IconSettings;
import gui.settings.TextSettings;


public class SettingsEkrani extends javax.swing.JFrame implements IRegulator{

    
    public SettingsEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        settingsEkranPaneli.setFocusable(true);
        TextSettings.setOnlyNumber(telNoTextfield);
        TextSettings.setMaxLimit(telNoTextfield, 11);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        settingsEkranPaneli = new javax.swing.JPanel();
        previousLabel = new javax.swing.JLabel();
        adSoyadLabel = new javax.swing.JLabel();
        defaultSettingIcon = new javax.swing.JLabel();
        telNoLabel = new javax.swing.JLabel();
        telNoTextfield = new javax.swing.JTextField();
        telUpdateIcon = new javax.swing.JLabel();
        sifreLabel = new javax.swing.JLabel();
        sifreTextfield = new javax.swing.JTextField();
        sifreUpdateIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Settings Ekrani");

        settingsEkranPaneli.setBackground(new java.awt.Color(204, 204, 204));

        previousLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/previousIcon.png"))); // NOI18N
        previousLabel.setToolTipText("Back");
        previousLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        previousLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousLabelMouseClicked(evt);
            }
        });

        adSoyadLabel.setFont(new java.awt.Font("Niagara Engraved", 1, 28)); // NOI18N
        adSoyadLabel.setForeground(new java.awt.Color(0, 0, 51));
        adSoyadLabel.setText("[ Istifadeci Ad soyad ]");

        defaultSettingIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_settings_60px_3.png"))); // NOI18N

        telNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        telNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        telNoLabel.setText("Telefon No :");

        telNoTextfield.setEnabled(false);

        telUpdateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/telUpdateIcon.png"))); // NOI18N
        telUpdateIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telUpdateIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telUpdateIconMouseClicked(evt);
            }
        });

        sifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sifreLabel.setText("Sifre :");

        sifreTextfield.setEnabled(false);

        sifreUpdateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/telUpdateIcon.png"))); // NOI18N
        sifreUpdateIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifreUpdateIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifreUpdateIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout settingsEkranPaneliLayout = new javax.swing.GroupLayout(settingsEkranPaneli);
        settingsEkranPaneli.setLayout(settingsEkranPaneliLayout);
        settingsEkranPaneliLayout.setHorizontalGroup(
            settingsEkranPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsEkranPaneliLayout.createSequentialGroup()
                .addComponent(previousLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(settingsEkranPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsEkranPaneliLayout.createSequentialGroup()
                        .addComponent(sifreLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sifreTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sifreUpdateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsEkranPaneliLayout.createSequentialGroup()
                        .addComponent(telNoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telNoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telUpdateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(settingsEkranPaneliLayout.createSequentialGroup()
                        .addComponent(defaultSettingIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 78, Short.MAX_VALUE))
        );

        settingsEkranPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {sifreLabel, telNoLabel});

        settingsEkranPaneliLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {sifreTextfield, telNoTextfield});

        settingsEkranPaneliLayout.setVerticalGroup(
            settingsEkranPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(settingsEkranPaneliLayout.createSequentialGroup()
                .addComponent(previousLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(settingsEkranPaneliLayout.createSequentialGroup()
                .addGroup(settingsEkranPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(settingsEkranPaneliLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(defaultSettingIcon))
                    .addGroup(settingsEkranPaneliLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(settingsEkranPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(telNoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telUpdateIcon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(telNoTextfield))
                .addGap(18, 18, 18)
                .addGroup(settingsEkranPaneliLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sifreTextfield)
                    .addComponent(sifreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sifreUpdateIcon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(128, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsEkranPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(settingsEkranPaneli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousLabelMouseClicked
        ActionSettings.setVisible(this, new HesabEkrani());
    }//GEN-LAST:event_previousLabelMouseClicked

    private int clickCounter = 0;
    private void telUpdateIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telUpdateIconMouseClicked
        if(this.clickCounter == 0){  //eger daha evvel tiklanmayibsa
        
            telNoTextfield.setEnabled(true);
            IconSettings.changeIcon(telUpdateIcon, "telUpdateIcon2");
            clickCounter++;
        }else      {//eger daha evvel tiklanibsa
        
            telNoTextfield.setEnabled(false);
            IconSettings.setOriginalIcon(telUpdateIcon);
            clickCounter = 0;
        }
    }//GEN-LAST:event_telUpdateIconMouseClicked

    private void sifreUpdateIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifreUpdateIconMouseClicked
        ActionSettings.setVisible(this, new passwordUpdateEkrani());
    }//GEN-LAST:event_sifreUpdateIconMouseClicked

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
            java.util.logging.Logger.getLogger(SettingsEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JLabel defaultSettingIcon;
    private javax.swing.JLabel previousLabel;
    private javax.swing.JPanel settingsEkranPaneli;
    private javax.swing.JLabel sifreLabel;
    private javax.swing.JTextField sifreTextfield;
    private javax.swing.JLabel sifreUpdateIcon;
    private javax.swing.JLabel telNoLabel;
    private javax.swing.JTextField telNoTextfield;
    private javax.swing.JLabel telUpdateIcon;
    // End of variables declaration//GEN-END:variables

    
}
