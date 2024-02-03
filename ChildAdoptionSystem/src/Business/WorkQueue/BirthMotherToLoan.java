/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.BankAccount.Loan;
import Business.People.BirthMother;
import Business.People.Parents;

/**
 *
 * @author devansh
 */
public class BirthMotherToLoan extends WorkRequest{
    private BirthMother birthMother;
    private Loan loan;

    public BirthMotherToLoan(String message, Loan loan, BirthMother bm) {
        super();
        super.setMessage(message);
        super.setStatus("Pending");
        this.loan = loan;
        this.birthMother =bm;
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }
    
    public Loan getLoan() {
        return loan;
    }

    public void setLoan(Loan loan) {
        this.loan = loan;
    }

    @Override
    public String toString() {
        return super.getSender().getName();
    }
    
    
}
