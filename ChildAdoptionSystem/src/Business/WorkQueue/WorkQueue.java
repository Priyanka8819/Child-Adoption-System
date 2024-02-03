/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.BirthMother;
import java.util.ArrayList;

/**
 *
 * @author devansh
 */
public class WorkQueue {
    
    private ArrayList<BirthMotherToCounselor> birthMotherToCounselor;
    private ArrayList<ParentToCounselor> parentToCounselor;
    private ArrayList<CounselorToAdmin> counselorToAdmin;
    private ArrayList<BirthMotherToParent> birthMotherToParent;
    private ArrayList<BirthMotherToLoan> birthMotherToLoan; 
    private ArrayList<HospitalAdminToBank> hospitalAdminToBank;
    private ArrayList<BirthMotherToInsuranceManager> birthMotherToInsurance;
    private ArrayList<OrphanageToCounselor> orphanageToCounselor;

    public WorkQueue() {
        birthMotherToCounselor = new ArrayList();
        parentToCounselor = new ArrayList();
        counselorToAdmin = new ArrayList();
        birthMotherToParent =  new ArrayList();
        birthMotherToLoan = new ArrayList();
        hospitalAdminToBank = new ArrayList<>();
        birthMotherToInsurance = new ArrayList<>();
        orphanageToCounselor= new ArrayList<>();
               
    }  

    public ArrayList<BirthMotherToInsuranceManager> getBirthMotherToInsurance() {
        return birthMotherToInsurance;
    }

    public void setBirthMotherToInsurance(ArrayList<BirthMotherToInsuranceManager> birthMotherToInsurance) {
        this.birthMotherToInsurance = birthMotherToInsurance;
    }
    
    public ArrayList<BirthMotherToLoan> getBirthMotherToLoan() {
        return birthMotherToLoan;
    }

    public void setBirthMotherToLoan(ArrayList<BirthMotherToLoan> birthMotherToLoan) {
        this.birthMotherToLoan = birthMotherToLoan;
    }

    public ArrayList<BirthMotherToParent> getBirthMotherToParent() {
        return birthMotherToParent;
    }

    public void setBirthMotherToParent(ArrayList<BirthMotherToParent> birthMotherToParent) {
        this.birthMotherToParent = birthMotherToParent;
    }

    public ArrayList<BirthMotherToCounselor> getBirthMotherToCounsellor() {
        return birthMotherToCounselor;
    }

    public ArrayList<ParentToCounselor> getParentToCounselor() {
        return parentToCounselor;
    }

    public ArrayList<OrphanageToCounselor> getOrphanageToCounselor() {
        return orphanageToCounselor;
    }

    public void setOrphanageToCounselor(ArrayList<OrphanageToCounselor> orphanageToCounselor) {
        this.orphanageToCounselor = orphanageToCounselor;
    }


    public void setBirthMotherToCounselor(ArrayList<BirthMotherToCounselor> birthMotherToCounselor) {
        this.birthMotherToCounselor = birthMotherToCounselor;
    }
    public void addBirthMotherToCounselor(BirthMotherToCounselor bMC) {
       birthMotherToCounselor.add(bMC);

    }

    public void addOrphanageToCounselor(OrphanageToCounselor oc){
        orphanageToCounselor.add(oc);
    }
    public void setParentCounsellor(ArrayList<ParentToCounselor> parentToCounselor) {
        this.parentToCounselor = parentToCounselor;
    }

    public void setCounselorToAdmin(ArrayList<CounselorToAdmin> counselorToAdmin) {
        this.counselorToAdmin = counselorToAdmin;
    }

    public ArrayList<CounselorToAdmin> getCounselorToAdmin() {
        return counselorToAdmin;
    }

    public ArrayList<HospitalAdminToBank> getHospitalAdminToBank() {
        return hospitalAdminToBank;
    }

    public void setHospitalAdminToBank(ArrayList<HospitalAdminToBank> hospitalAdminToBank) {
        this.hospitalAdminToBank = hospitalAdminToBank;
    }
    
}