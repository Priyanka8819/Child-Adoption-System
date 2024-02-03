/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.BankAccount;

import java.util.ArrayList;

/**
 *
 * @author kesha
 */
public class LoanAccountDirectory {
        private ArrayList<Loan> loanList;

    public LoanAccountDirectory() {
        loanList = new ArrayList();
    }

    public ArrayList<Loan> getLoanAccountList() {
        return loanList;
    }
    
    
    public Loan addLoan(Loan loan){
        loanList.add(loan);
        return loan;
    }
}
