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
public class InsuranceManager extends Employee {
    public String InsuranceName;
   public int workRequestcount;
   public int maxFunding;
   public String location;
   
   private ArrayList<BirthMotherToLoan> acceptedWorkRequests;
   private ArrayList<BirthMotherToLoan> rejectedWorkRequests;

    public String getInsuranceName() {
        return InsuranceName;
    }

    public void setInsuranceName(String InsuranceName) {
        this.InsuranceName = InsuranceName;
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

    public ArrayList<BirthMotherToLoan> getAcceptedWorkRequests() {
        return acceptedWorkRequests;
    }

    public void setAcceptedWorkRequests(ArrayList<BirthMotherToLoan> acceptedWorkRequests) {
        this.acceptedWorkRequests = acceptedWorkRequests;
    }

    public ArrayList<BirthMotherToLoan> getRejectedWorkRequests() {
        return rejectedWorkRequests;
    }

    public void setRejectedWorkRequests(ArrayList<BirthMotherToLoan> rejectedWorkRequests) {
        this.rejectedWorkRequests = rejectedWorkRequests;
    }
     
    
}
