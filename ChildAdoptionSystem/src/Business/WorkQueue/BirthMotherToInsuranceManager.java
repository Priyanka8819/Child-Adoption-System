/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Insurance.Insurance;
import Business.Insurance.InsuranceAccountDirectory;
import Business.People.BirthMother;
import Business.UserAccount.UserAccount;

/**
 *
 * @author devansh
 */
public class BirthMotherToInsuranceManager extends WorkRequest{
    
    private BirthMother birthMother;
    private UserAccount userAccount;
    private Insurance insurance;
    private InsuranceAccountDirectory insuranceDir;

    public BirthMotherToInsuranceManager(BirthMother birthMother, UserAccount userAccount, Insurance insurance, InsuranceAccountDirectory insur) {
        super();
        this.birthMother = birthMother;
        this.userAccount = userAccount;
        this.insurance = insurance;
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return birthMother.getFirstName();
    }
    
}
