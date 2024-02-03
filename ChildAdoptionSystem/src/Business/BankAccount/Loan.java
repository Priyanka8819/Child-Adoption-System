/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankAccount;

import java.util.Random;

/**
 *
 * @author kesha
 */
public class Loan {
    
    private String firstName;
    private String lastName;
    private String emailId;
    private int funds;
    private String address;
    private int bankAccountNumber;
    private int bankBalance;
    private String passportNumber;
    private String username;
    private int ownFunds;
    private String docPath;
    private String counselor;
    private String hospital;
    private int fundsApproved;

    public int getFundsApproved() {
        return fundsApproved;
    }

    public void setFundsApproved(int fundsApproved) {
        this.fundsApproved = fundsApproved;
    }

    public int getOwnFunds() {
        return ownFunds;
    }

    public void setOwnFunds(int ownFunds) {
        this.ownFunds = ownFunds;
    }

    

    public Loan(String firstName, String emailId) {
        this.firstName = firstName;
        this.emailId = emailId;
        Random rand =  new Random();
        this.bankAccountNumber = rand.nextInt(100000000);
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }


    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor;
    }
    

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }
    

    public Loan() {
        this.firstName = new String();
        this.emailId = new String();
        this.lastName = new String();
        this.address = new String();
        this.funds = 0;
        this.passportNumber = new String();
        this.docPath = new String();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDocPath() {
        return docPath;
    }

    public void setDocPath(String docPath) {
        this.docPath = docPath;
    }

    
    public void addValues(String emailId, int funds, String address, String passportNumber, String docPath) {
        this.emailId = emailId;
        this.funds = funds;
        this.address = address;
        this.passportNumber = passportNumber;
        this.docPath = docPath;
        
    }
    
    public void addValues1(String emailId, int funds, String address, String passportNumber, String docPath) {
        this.emailId = emailId;
        this.ownFunds = funds;
        this.address = address;
        this.passportNumber = passportNumber;
        this.docPath = docPath;
        
    }
    @Override
    public String toString() {
        return firstName;
    }
    
}