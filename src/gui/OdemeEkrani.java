
package gui;

import gui.settings.ActionSettings;
import gui.settings.IRegulator;


public class OdemeEkrani extends javax.swing.JFrame implements IRegulator{

    
    public OdemeEkrani() {
        initComponents();
        getEdits();
    }
    
    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        odemeEkraniLabel.setFocusable(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        odemeEkraniLabel = new javax.swing.JPanel();
        previousLabel = new javax.swing.JLabel();
        adSoyadLabel = new javax.swing.JLabel();
        mesajElektrikLabel = new javax.swing.JLabel();
        elektricBorc = new javax.swing.JLabel();
        elektrikOdeButton = new javax.swing.JButton();
        mesajQasLabel = new javax.swing.JLabel();
        qazBorc = new javax.swing.JLabel();
        qazOdeButton = new javax.swing.JButton();
        mesajSuLabel = new javax.swing.JLabel();
        suBorc = new javax.swing.JLabel();
        suOdeButton = new javax.swing.JButton();
        mesajNetLabel = new javax.swing.JLabel();
        netBorc = new javax.swing.JLabel();
        netOdeButton = new javax.swing.JButton();
        isiqIcon = new javax.swing.JLabel();
        qazIcon = new javax.swing.JLabel();
        suIcon = new javax.swing.JLabel();
        netIcon = new javax.swing.JLabel();
        paymentsIcon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Odeme Penceresi");

        odemeEkraniLabel.setBackground(new java.awt.Color(204, 255, 255));

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

        mesajElektrikLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajElektrikLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajElektrikLabel.setText("AzerIsiq :");

        elektricBorc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektricBorc.setForeground(new java.awt.Color(102, 0, 0));
        elektricBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektricBorc.setText("[ Elektrik Borc ]");

        elektrikOdeButton.setText("Ode");
        elektrikOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elektrikOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektrikOdeButtonActionPerformed(evt);
            }
        });

        mesajQasLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajQasLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajQasLabel.setText("AzeriQaz :");

        qazBorc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qazBorc.setForeground(new java.awt.Color(102, 0, 0));
        qazBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        qazBorc.setText("[ Qaz Borc ]");

        qazOdeButton.setText("Ode");
        qazOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        qazOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qazOdeButtonActionPerformed(evt);
            }
        });

        mesajSuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajSuLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajSuLabel.setText("AzerSu :");

        suBorc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suBorc.setForeground(new java.awt.Color(102, 0, 0));
        suBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        suBorc.setText("[ Su Borc ]");

        suOdeButton.setText("Ode");
        suOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suOdeButtonActionPerformed(evt);
            }
        });

        mesajNetLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mesajNetLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajNetLabel.setText("Internet :");

        netBorc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        netBorc.setForeground(new java.awt.Color(102, 0, 0));
        netBorc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        netBorc.setText("[ Net Borc ]");

        netOdeButton.setText("Ode");
        netOdeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        netOdeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                netOdeButtonActionPerformed(evt);
            }
        });

        isiqIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_idea_40px.png"))); // NOI18N

        qazIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_fire_40px.png"))); // NOI18N

        suIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_water_40px.png"))); // NOI18N

        netIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_internet_35px.png"))); // NOI18N

        paymentsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Icons/icons8_online_money_transfer_50px_1.png"))); // NOI18N

        javax.swing.GroupLayout odemeEkraniLabelLayout = new javax.swing.GroupLayout(odemeEkraniLabel);
        odemeEkraniLabel.setLayout(odemeEkraniLabelLayout);
        odemeEkraniLabelLayout.setHorizontalGroup(
            odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                        .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(netIcon)
                            .addComponent(suIcon)
                            .addComponent(qazIcon)
                            .addComponent(isiqIcon))
                        .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemeEkraniLabelLayout.createSequentialGroup()
                                .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(elektricBorc)
                                .addGap(18, 18, 18)
                                .addComponent(elektrikOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                                        .addComponent(mesajNetLabel)
                                        .addGap(18, 18, 18)
                                        .addComponent(netBorc)
                                        .addGap(18, 18, 18)
                                        .addComponent(netOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                                            .addComponent(mesajQasLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(qazBorc)
                                            .addGap(18, 18, 18)
                                            .addComponent(qazOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                                            .addComponent(mesajSuLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(suBorc)
                                            .addGap(18, 18, 18)
                                            .addComponent(suOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                        .addComponent(paymentsIcon)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGap(0, 27, Short.MAX_VALUE))
            .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                .addComponent(previousLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        odemeEkraniLabelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {mesajElektrikLabel, mesajNetLabel, mesajQasLabel, mesajSuLabel});

        odemeEkraniLabelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {elektricBorc, netBorc, qazBorc, suBorc});

        odemeEkraniLabelLayout.setVerticalGroup(
            odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                .addComponent(previousLabel)
                .addGap(18, 18, 18)
                .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paymentsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                        .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mesajElektrikLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elektricBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(elektrikOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(mesajSuLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(suBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, odemeEkraniLabelLayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(suOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mesajNetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(netBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(netOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                        .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(odemeEkraniLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mesajQasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qazBorc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qazOdeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(odemeEkraniLabelLayout.createSequentialGroup()
                                .addComponent(isiqIcon)
                                .addGap(18, 18, 18)
                                .addComponent(qazIcon)))
                        .addGap(18, 18, 18)
                        .addComponent(suIcon)
                        .addGap(18, 18, 18)
                        .addComponent(netIcon)))
                .addGap(0, 79, Short.MAX_VALUE))
        );

        odemeEkraniLabelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {elektricBorc, elektrikOdeButton, mesajElektrikLabel, netBorc, qazBorc, suBorc});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemeEkraniLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(odemeEkraniLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void previousLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousLabelMouseClicked
        ActionSettings.setVisible(this, new HesabEkrani());
    }//GEN-LAST:event_previousLabelMouseClicked

    private void elektrikOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektrikOdeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_elektrikOdeButtonActionPerformed

    private void qazOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qazOdeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qazOdeButtonActionPerformed

    private void suOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suOdeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_suOdeButtonActionPerformed

    private void netOdeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_netOdeButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_netOdeButtonActionPerformed

    
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
            java.util.logging.Logger.getLogger(OdemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JLabel elektricBorc;
    private javax.swing.JButton elektrikOdeButton;
    private javax.swing.JLabel isiqIcon;
    private javax.swing.JLabel mesajElektrikLabel;
    private javax.swing.JLabel mesajNetLabel;
    private javax.swing.JLabel mesajQasLabel;
    private javax.swing.JLabel mesajSuLabel;
    private javax.swing.JLabel netBorc;
    private javax.swing.JLabel netIcon;
    private javax.swing.JButton netOdeButton;
    private javax.swing.JPanel odemeEkraniLabel;
    private javax.swing.JLabel paymentsIcon;
    private javax.swing.JLabel previousLabel;
    private javax.swing.JLabel qazBorc;
    private javax.swing.JLabel qazIcon;
    private javax.swing.JButton qazOdeButton;
    private javax.swing.JLabel suBorc;
    private javax.swing.JLabel suIcon;
    private javax.swing.JButton suOdeButton;
    // End of variables declaration//GEN-END:variables

    
}
