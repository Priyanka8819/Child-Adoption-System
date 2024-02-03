/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class EmployeeDirectory {
 
    private ArrayList<Employee> employeeList;
    private ArrayList<Counsellor> counselorlist;
    private ArrayList<BankManager> bankManagerList;
    private ArrayList<InsuranceManager> insuranceManagerList;
    
    

    public EmployeeDirectory() {
        counselorlist = new ArrayList<>();
        bankManagerList = new ArrayList<>();
        insuranceManagerList = new ArrayList<>();
                
                
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    
    public Employee createandaddEmployee (String name){
        Employee em = new Employee();
        em.setName(name);
        employeeList.add(em);
        return em;
    }
    
    public Counsellor createandaddCounselor (String name){
        Counsellor em = new Counsellor();
        em.setName(name);
        counselorlist.add(em);
        return em;
    }
    public InsuranceManager createandadInsuranceManager (String name){
        InsuranceManager em = new InsuranceManager();
        em.setName(name);
        insuranceManagerList.add(em);
        return em;
    }

    public BankManager createandaddBankManager (String name){
        BankManager em = new BankManager();
        em.setName(name);
        bankManagerList.add(em);
        return em;
    }

    public ArrayList<Counsellor> getCounselorlist() {
        return counselorlist;
    }

    public void setCounselorlist(ArrayList<Counsellor> counselorlist) {
        this.counselorlist = counselorlist;
    }

    public ArrayList<BankManager> getBankManagerList() {
        return bankManagerList;
    }

    public void setBankManagerList(ArrayList<BankManager> bankManagerList) {
        this.bankManagerList = bankManagerList;
    }

    public ArrayList<InsuranceManager> getInsuranceManagerList() {
        return insuranceManagerList;
    }

    public void setInsuranceManagerList(ArrayList<InsuranceManager> insuranceManagerList) {
        this.insuranceManagerList = insuranceManagerList;
    }
       
    
}
