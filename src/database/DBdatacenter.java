
package database;


public class DBdatacenter extends DBConnection{
    
    protected int userid = 0;
    protected String nameSurname, phoneNo, idNo, customerNo;
    protected double balance;
    protected double azerisiqBill, azeriqazBill, azersuBill, internetBill;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAzerisiqBill() {
        return azerisiqBill;
    }

    public void setAzerisiqBill(double azerisiqBill) {
        this.azerisiqBill = azerisiqBill;
    }

    public double getAzeriqazBill() {
        return azeriqazBill;
    }

    public void setAzeriqazBill(double azeriqazBill) {
        this.azeriqazBill = azeriqazBill;
    }

    public double getAzersuBill() {
        return azersuBill;
    }

    public void setAzersuBill(double azersuBill) {
        this.azersuBill = azersuBill;
    }

    public double getInternetBill() {
        return internetBill;
    }

    public void setInternetBill(double internetBill) {
        this.internetBill = internetBill;
    }
    
    
    
}
