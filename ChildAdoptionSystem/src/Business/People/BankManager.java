/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.WorkQueue.BirthMotherToLoan;
import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class BankManager extends Employee{

   public String BankName;
   public int workRequestcount;
   public int maxFunding;
   public String location;
   
   private ArrayList<BirthMotherToLoan> acceptedWorkRequests;
   private ArrayList<BirthMotherToLoan> rejectedWorkRequests;
   

    public BankManager(String BankName, int workRequestcount, int maxFunding, String location) {
        super();
        this.BankName = BankName;
        this.workRequestcount = workRequestcount;
        this.maxFunding = maxFunding;
        this.location = location;
    }
    
    public BankManager() {
        super();
        this.BankName = new String();
        this.workRequestcount = new Integer(100);
        this.maxFunding = new Integer(100);
        this.location = location;
    }

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public int getWorkRequestcount() {
        return workRequestcount;
    }

    public void setWorkRequestcount(int workRequestcount) {
        this.workRequestcount = workRequestcount;
    }

    public int getMaxFunding() {
        return maxFunding;
    }

    public void setMaxFunding(int maxFunding) {
        this.maxFunding = maxFunding;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


  
   
   

    
}
