/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import Business.People.BirthMother;



/**
 *
 * @author priya
 */
public class Insurance {
    
    private String firstName;
    private String lastName;
    private String emailId;
    private String policyNumber;
    private String address;
    private String counselor;
    private String hospital;
    private int fundsApproved;
    private BirthMother birthmother;

   
    private String username;
    private String docPath;


    public Insurance(String firstName, String lastName, String emailId, String policynumber, String address, String docPath) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.policyNumber = policynumber;
        this.address = address;
        this.hospital = new String();
        this.fundsApproved = 0;
        
        this.docPath = docPath;
    }

    public Insurance() {
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

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor;
    } 

    public BirthMother getBirthmother() {
        return birthmother;
    }

    public void setBirthmother(BirthMother birthmother) {
        this.birthmother = birthmother;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getFundsApproved() {
        return fundsApproved;
    }

    public void setFundsApproved(int fundsApproved) {
        
        this.fundsApproved = fundsApproved;
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
 
    @Override
    public String toString() {
        return username;
    }
    
    
    
}