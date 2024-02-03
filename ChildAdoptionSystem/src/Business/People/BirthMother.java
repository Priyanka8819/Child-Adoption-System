/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.BankAccount.Loan;
import Business.Insurance.Insurance;
import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author priya
 */
public class BirthMother {
   
    private String username;
    private int id;
    private static int count = new Random().nextInt(100);
    private String emailId;
      private String imgPath;
    private String firstName;
    private String lastName;
    
    
    private String password;
    
    private String Hospital;
  
    private String bloodGroup;
    private int typeL = 0;
    

    private String address;
    private String counselor;
    private ArrayList<Parents> acceptedParents;
    private Insurance insurance;
    private Parents finalizedParent;
   
    
 
    private int bankBalance;
    private int parentAidfund;
    private int netfunding; 

    
    private int loanRequestAmount;
    private int loanAmountApproved;
    private int requiredFund;
    private int insuranceAmount;
    private int ownFunds;

    private String contactMother;

    public String getContactMother() {
        return contactMother;
    }

    public void setContactMother(String contactMother) {
        this.contactMother = contactMother;
    }
    
    private Loan loanaccount;

    public int getRequiredFund() {
        return requiredFund;
    }

    public int getOwnFunds() {
        return ownFunds;
    }

    public int getTypeL() {
        return typeL;
    }

    public void setTypeL(int typeL) {
        this.typeL = typeL;
    }

    public void setOwnFunds(int ownFunds) {
        this.ownFunds = ownFunds;
    }

    public void setRequiredFund(int requiredFund) {
        this.requiredFund = requiredFund;
    }

    public int getNetFunding(){
        if (requiredFund !=0 && bankBalance!=0){
            netfunding = requiredFund - (bankBalance + parentAidfund);
        }
        return netfunding;
    }

    public int getLoanRequestAmount() {
        return loanRequestAmount;
    }

    public int getLoanAmountApproved() {
        return loanAmountApproved;
    }


    public void setLoanRequestAmount(int loanRequestAmount) {
        this.loanRequestAmount = loanRequestAmount;
    }

    public void setLoanAmountApproved(int loanAmountApproved) {
        this.loanAmountApproved = loanAmountApproved;
    }

    public void setNetfunding(int netfunding) {
        this.netfunding = netfunding;
    }
    
   
    public int getBankBalance() {
        return bankBalance;
    }

    public void setBankBalance(int bankBalance) {
        this.bankBalance = bankBalance;
    }

    public int getParentAidfund() {
        return parentAidfund;
    }

    public void setParentAidfund(int parentAidfund) {
        this.parentAidfund = parentAidfund;
    }

    public Loan getLoanaccount() {
        return loanaccount;
    }

    public Parents getFinalizedParent() {
        return finalizedParent;
    }

    public void setFinalizedParent(Parents finalizedParent) {
        this.finalizedParent = finalizedParent;
    }

    public void setLoanaccount(Loan loanaccount) {
        this.loanaccount = loanaccount;
    }

    public ArrayList<Parents> getAcceptedParents() {
        return acceptedParents;
    }

    public void setAcceptedParents(ArrayList<Parents> acceptedParents) {
        this.acceptedParents = acceptedParents;
    }


    public String getAddress() {
        return address;
    }

    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public int getInsuranceAmount() {
        return insuranceAmount;
    }

    public void setInsuranceAmount(int insuranceAmount) {
        this.insuranceAmount = insuranceAmount;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    
    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }
    

    public BirthMother() {
        id = count;
        count++;
        this.Hospital =new String();
        this.emailId =new String();
        this.password =new String();
        this.username =new String();
        this.loanaccount = new Loan();
        this.insurance = new Insurance();
        acceptedParents = new ArrayList<>();
     this.requiredFund =0;
     this.insuranceAmount =0;
     this.bankBalance = 0;
     this.parentAidfund =0;
     this.netfunding = 0;
                
    }


    public int getId() {
        return id;
    }

    public void setUsername(String name) {
        this.username = name;
    }
    
    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return username;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHospital() {
        return Hospital;
    }

    public void setHospital(String Hospital) {
        this.Hospital = Hospital;
    }

  

    public void setAllValues(String username, String firstName, String LastName, String email, String blood, String contact, String address, String imgPath) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = LastName;
        this.emailId = email;
        this.bloodGroup = blood;
        //this.bankBalance = fund;
        this.contactMother = contact;
        this.address = address;
        this.imgPath = imgPath;
       
    }
//    public void setValues(String firstName, String LastName, String email, int bankBalance, String address) {
//        this.firstName = firstName;
//        this.lastName = LastName;
//        this.emailId = email;
//        this.ownFunds = bankBalance;
//        this.bankBalance = bankBalance;
//        this.address = address;
//        this.imgPath = imgPath;
//    } 
//    
}
