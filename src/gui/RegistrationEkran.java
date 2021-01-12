package gui;

import database.IInfoController;
import database.transActions.AccountInfos;
import database.transActions.UserApply;
import gui.settings.ButtonSettings;
import gui.settings.IRegulator;
import gui.settings.TextSettings;
import gui.settings.ActionSettings;
import gui.settings.Dialogs;
import java.awt.Color;
import javax.swing.JOptionPane;

public class RegistrationEkran extends javax.swing.JFrame implements IRegulator, IInfoController {

    private UserApply userApplyObject = null;

    /**
     * Creates new form RegistrationEkran
     */
    public RegistrationEkran() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        QeydiyyatPanel.setFocusable(true);
        TextSettings.setOnlyAlphabetic(adSoyadTextfield);
        TextSettings.setOnlyNumber(phoneNoTextfield);
        TextSettings.setOnlyNumber(sexsiyyetNoTextfield);
        TextSettings.setMaxLimit(sexsiyyetNoTextfield, 8);
        TextSettings.setMaxLimit(phoneNoTextfield, 11);

    }

    public UserApply getUserApplyObject() {
        if (this.userApplyObject == null) {
            userApplyObject = new UserApply();
        }
        return userApplyObject;
    }

    @Override
    public boolean isInfoTrue() {

        return TextSettings.textFieldImports(QeydiyyatPanel);
    }

    @Override
    public AccountInfos getAccountInfos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        QeydiyyatPanel = new javax.swing.JPanel();
        securityInfoLabel = new javax.swing.JLabel();
        adSoyadLabel = new javax.swing.JLabel();
        adSoyadTextfield = new javax.swing.JTextField();
        sexsiyyetNoTextfield = new javax.swing.JTextField();
        sexsiyyetNoLabel = new javax.swing.JLabel();
        phoneNoTextfield = new javax.swing.JTextField();
        phoneNoLabel = new javax.swing.JLabel();
        privateINfoLabel = new javax.swing.JLabel();
        securityQuestionLabel = new javax.swing.JLabel();
        questionCombobox = new javax.swing.JComboBox<>();
        answerTextfield = new javax.swing.JTextField();
        seciurityAnswerLabel = new javax.swing.JLabel();
        applyButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bizim Bank Qeydiyyat Ekranı");

        QeydiyyatPanel.setBackground(new java.awt.Color(255, 255, 204));

        securityInfoLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        securityInfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        securityInfoLabel.setText("Security Info");

        adSoyadLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        adSoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        adSoyadLabel.setText("Name Surname :");

        sexsiyyetNoLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        sexsiyyetNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        sexsiyyetNoLabel.setText("Sexsiyyet No :");

        phoneNoLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        phoneNoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        phoneNoLabel.setText("Phone Number :");

        privateINfoLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        privateINfoLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        privateINfoLabel.setText("Private Info ");

        securityQuestionLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        securityQuestionLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        securityQuestionLabel.setText("Security question :");

        questionCombobox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        questionCombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "What is your pet's name?", "What is yout teacher's name?", "Where are you from?", "Your favorite place?", "Or your random question?" }));

        seciurityAnswerLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        seciurityAnswerLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        seciurityAnswerLabel.setText("Answer :");

        applyButton.setBackground(new java.awt.Color(204, 255, 204));
        applyButton.setText("Apply");
        applyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        applyButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                applyButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                applyButtonMouseExited(evt);
            }
        });
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout QeydiyyatPanelLayout = new javax.swing.GroupLayout(QeydiyyatPanel);
        QeydiyyatPanel.setLayout(QeydiyyatPanelLayout);
        QeydiyyatPanelLayout.setHorizontalGroup(
            QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QeydiyyatPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QeydiyyatPanelLayout.createSequentialGroup()
                        .addComponent(seciurityAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(answerTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(QeydiyyatPanelLayout.createSequentialGroup()
                        .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(phoneNoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(QeydiyyatPanelLayout.createSequentialGroup()
                        .addComponent(sexsiyyetNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sexsiyyetNoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(QeydiyyatPanelLayout.createSequentialGroup()
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(adSoyadTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(securityInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(QeydiyyatPanelLayout.createSequentialGroup()
                        .addComponent(securityQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(questionCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QeydiyyatPanelLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(privateINfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(274, Short.MAX_VALUE)))
        );

        QeydiyyatPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {phoneNoTextfield, questionCombobox});

        QeydiyyatPanelLayout.setVerticalGroup(
            QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QeydiyyatPanelLayout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adSoyadTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sexsiyyetNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sexsiyyetNoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNoTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(securityInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(securityQuestionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(questionCombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(seciurityAnswerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(answerTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(QeydiyyatPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(QeydiyyatPanelLayout.createSequentialGroup()
                    .addGap(53, 53, 53)
                    .addComponent(privateINfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(418, Short.MAX_VALUE)))
        );

        QeydiyyatPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adSoyadLabel, adSoyadTextfield});

        QeydiyyatPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {sexsiyyetNoLabel, sexsiyyetNoTextfield});

        QeydiyyatPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {answerTextfield, phoneNoLabel, phoneNoTextfield, questionCombobox});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QeydiyyatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(QeydiyyatPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void applyButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyButtonMouseEntered
        ButtonSettings.setBgFg(applyButton, Color.GREEN, Color.BLACK);
    }//GEN-LAST:event_applyButtonMouseEntered

    private void applyButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_applyButtonMouseExited
        ButtonSettings.setOriginalBgFg(applyButton);
    }//GEN-LAST:event_applyButtonMouseExited

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed

        if (this.isInfoTrue()) {
            this.confirmRegister();

        } else {

            Dialogs.bosOlaBilmezMesajGoster(this);
        }

    }//GEN-LAST:event_applyButtonActionPerformed

    private void confirmRegister() {
        
        
        //personal infos
        this.getUserApplyObject().setNameSurname(this.adSoyadTextfield.getText().trim());
        this.getUserApplyObject().setIdNo(this.sexsiyyetNoTextfield.getText().trim());
        this.getUserApplyObject().setPhoneNo(this.phoneNoTextfield.getText().trim());
        
        //security infos
        this.getUserApplyObject().setSecurityQuestion(String.valueOf(this.questionCombobox.getSelectedItem()));
        this.getUserApplyObject().setSecurityAnswer(this.answerTextfield.getText().trim());
        
        //sistem terefinden verilecek reqemler
        this.getUserApplyObject().setCustomerNo(this.randomGetCustomerNo());
        this.getUserApplyObject().setPassword(this.randomPassword());
        
        if(this.getUserApplyObject().isConfirmApply()){
             Dialogs.ozelMesajGoster(this, "Succes");
        ActionSettings.setVisible(this, new GirisEkran());
        }else{
            
        }
        
        
    }
    
    private String randomGetCustomerNo(){
        String customerNo;
        customerNo = String.valueOf(1000000 +(int)(Math.random()*9000000));
        return customerNo; 
    }
    
    private String randomPassword(){
        String password;
        password = String.valueOf(1000 + (int)(Math.random()*9000));
        return password;
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
            java.util.logging.Logger.getLogger(RegistrationEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrationEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrationEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrationEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrationEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel QeydiyyatPanel;
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JTextField adSoyadTextfield;
    private javax.swing.JTextField answerTextfield;
    private javax.swing.JButton applyButton;
    private javax.swing.JLabel logoutLabel1;
    private javax.swing.JLabel phoneNoLabel;
    private javax.swing.JTextField phoneNoTextfield;
    private javax.swing.JLabel previousLabel;
    private javax.swing.JLabel previousLabel1;
    private javax.swing.JLabel previousLabel2;
    private javax.swing.JLabel previousLabel3;
    private javax.swing.JLabel privateINfoLabel;
    private javax.swing.JComboBox<String> questionCombobox;
    private javax.swing.JLabel seciurityAnswerLabel;
    private javax.swing.JLabel securityInfoLabel;
    private javax.swing.JLabel securityQuestionLabel;
    private javax.swing.JLabel sexsiyyetNoLabel;
    private javax.swing.JTextField sexsiyyetNoTextfield;
    // End of variables declaration//GEN-END:variables
}
