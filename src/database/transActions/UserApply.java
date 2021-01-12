
package database.transActions;

import database.DBConnection;
import database.IInfoController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserApply extends DBConnection implements IInfoController{
    
    //apply information
    private String nameSurname = null, phoneNo = null, idNo = null;
    private String securityQuestion = null, securityAnswer = null;
    
    //sistem terefinder verilecek random reqemler
    private String customerNo = null;
    private String password = null;
    
    public boolean isConfirmApply(){
        if(this.isInfoTrue()){
            if(this.idNoVarmi()){
                return false;
            }else{
                this.confirmApply();
                return true;
            }
        }else{
            return false;
        }
    }
    private boolean idNoVarmi(){
        String query = "SELECT id_no FROM users WHERE id_no = '" + this.idNo +"'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while(rs.next()){
                return true; //eger table da varsa true qaytaracaq
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserApply.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    private void confirmApply(){
        
        
        
    }

    @Override
    public boolean isInfoTrue() {

        return !(this.nameSurname == null
                ||this.idNo == null
                ||this.phoneNo == null
                ||this.customerNo == null 
                ||this.securityQuestion == null
                ||this.securityAnswer == null
                ||this.password == null);
    }
    
    

    @Override
    public AccountInfos getAccountInfos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }

    public String getSecurityAnswer() {
        return securityAnswer;
    }

    public void setSecurityAnswer(String securityAnswer) {
        this.securityAnswer = securityAnswer;
    }

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void getSecurityQuestion(String valueOf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
