/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.BankAccount.LoanAccountDirectory;
import Business.Insurance.InsuranceAccountDirectory;
import Business.People.BirthMotherDirectory;
import Business.People.EmployeeDirectory;
import Business.People.OrphanageDirectory;
import Business.People.ParentsDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author priya
 */
public abstract class Organization {

    private String name;

    private WorkQueue workQueue;
    private ParentsDirectory parentDirectory;
    private BirthMotherDirectory birthMotherDirectory;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private LoanAccountDirectory loanDirectory;
    private InsuranceAccountDirectory insuranceAccountDirectory;
    private OrphanageDirectory orphanageDirectory;

   
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        HospitalAdmin("HospitalAdmin Organization"), 
        Counselor("Counselor Organization"), 
        BankManager("BankManager Organization"),
        InsuranceManager("InsuranceManager Organization"),
        FinanceAdmin("FinanceAdmin Organization"),
        BirthMotherOrg("BirthMother Organization"),
        ParentsOrg("Parents Organization"),
        OrphanageAdmin("OrphanageAdmin Organization");
        
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
      
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        parentDirectory = new ParentsDirectory();
        birthMotherDirectory = new BirthMotherDirectory();
        userAccountDirectory = new UserAccountDirectory();
        loanDirectory = new LoanAccountDirectory();
        insuranceAccountDirectory = new InsuranceAccountDirectory();
        orphanageDirectory = new OrphanageDirectory();
        organizationID = counter;
        ++counter;
    }

    public LoanAccountDirectory getLoanDirectory() {
        return loanDirectory;
    }

    public void setLoanDirectory(LoanAccountDirectory loanDirectory) {
        this.loanDirectory = loanDirectory;
    }

    public ParentsDirectory getParentDirectory() {
        return parentDirectory;
    }

    public void setParentDirectory(ParentsDirectory parentDirectory) {
        this.parentDirectory = parentDirectory;
    }

    public BirthMotherDirectory getBirthMotherDirectory() {
        return birthMotherDirectory;
    }

    public void setBirthMotherDirectory(BirthMotherDirectory birthMotherDirectory) {
        this.birthMotherDirectory = birthMotherDirectory;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public InsuranceAccountDirectory getInsuranceAccountDirectory() {
        return insuranceAccountDirectory;
    }

    public void setInsuranceAccountDirectory(InsuranceAccountDirectory insuranceAccountDirectory) {
        this.insuranceAccountDirectory = insuranceAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

     public OrphanageDirectory getOrphanageDirectory() {
        return orphanageDirectory;
    }

    public void setOrphanageDirectory(OrphanageDirectory orphanageDirectory) {
        this.orphanageDirectory = orphanageDirectory;
    }
    @Override
    public String toString() {
        return name;
    }
    

}
