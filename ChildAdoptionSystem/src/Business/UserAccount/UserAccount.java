/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.People.*;
import Business.Role.Role;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author devansh
 */
public class UserAccount {
    
    private String name;
    private String username;
    private String password;
    private Employee employee;
    private BirthMother birthmother;
    private InsuranceManager insuranceManager;
    private Counsellor counselor;
    private BankManager bankManager;
    private Parents parent;
    private Role role;
    private WorkQueue workQueue;
    private String network;

    public BirthMother getBirthmother() {
        return birthmother;
    }

    public void setBirthmother(BirthMother birthmother) {
        this.birthmother = birthmother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InsuranceManager getInsuranceManager() {
        return insuranceManager;
    }

    public void setInsuranceManager(InsuranceManager insuranceManager) {
        this.insuranceManager = insuranceManager;
    }

    public Counsellor getCounselor() {
        return counselor;
    }

    public void setCounselor(Counsellor counselor) {
        this.counselor = counselor;
    }

    public BankManager getBankManager() {
        return bankManager;
    }

    public void setBankManager(BankManager bankManager) {
        this.bankManager = bankManager;
    }

    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents parent) {
        this.parent = parent;
    }

    public UserAccount() {
        workQueue = new WorkQueue();
        username =  new String();
        network = new String();
        name  = new String();
        
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Employee getEmployee() {
        return employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    
    
    @Override
    public String toString() {
        return username;
    }
   
    
}