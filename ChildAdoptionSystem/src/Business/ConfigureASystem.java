package Business;

import Business.Enterprise.Enterprise;
import Business.Enterprise.FinancialEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.People.*;
import Business.Role.BankManagerRole;
import Business.Role.CounselorRole;
import Business.Role.FinanceAdminRole;
import Business.Role.HospitalAdminRole;
import Business.Role.InsuranceManagerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author priya
 */
public class ConfigureASystem {
    
    public static EcoSystem system; 
    
    public static EcoSystem configure(){
        system = EcoSystem.getInstance(); 
        System.out.println(system);
        Employee employee = system.getEmployeeDirectory().createandaddEmployee("sysadmin");
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", employee, new SystemAdminRole());
        ConfigureASystem configure = new ConfigureASystem();
        configure.configureNetwork();
        System.out.println(system);
        return system;
    }
    
    public void configureNetwork(){
        
        Network network = system.createAndAddNetwork();
        network.setCountry("United States");
        network.setState("Massachusetts");
        network.setCity("Boston");
        network.setName("Boston Network");
    // Boston   
        HospitalEnterprise hospital = (HospitalEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("Boston Public Hospital", Enterprise.EnterpriseType.Hospital);
        FinancialEnterprise financial = (FinancialEnterprise)network.getEnterpriseDirectory().createAndAddEnterprise("Boston Public Finance Center", Enterprise.EnterpriseType.FinancialEnterprise);
        
        Employee employee = hospital.getEmployeeDirectory().createandaddEmployee("Boston Hospital Admin");
        UserAccount account = hospital.getUserAccountDirectory().createUserAccount("hadmin", "hadmin", employee, new HospitalAdminRole(), network.getName());
        
        Organization organization = hospital.getOrganizationDirectory().createOrganization(Organization.Type.Counselor);
     
        
        Counsellor employee1 = organization.getEmployeeDirectory().createandaddCounselor("Counselor");
        account = organization.getUserAccountDirectory().createCounselorUserAccount("Counselor", "Counselor", employee1, new CounselorRole(),network.getName() );
        
        employee = financial.getEmployeeDirectory().createandaddEmployee("Boston Public Finance Admin"); 
        
        account = financial.getUserAccountDirectory().createUserAccount("fadmin", "fadmin", employee, new FinanceAdminRole(),network.getName());
     
        
        organization = financial.getOrganizationDirectory().createOrganization(Organization.Type.BankManager);
        
        BankManager employee2 = organization.getEmployeeDirectory().createandaddBankManager("Bank Manager");
        
        
        account = organization.getUserAccountDirectory().createBankManagerUserAccount("bmanager", "bmanager", employee2, new BankManagerRole(),network.getName());
        
    
        Organization organization1 = financial.getOrganizationDirectory().createOrganization(Organization.Type.InsuranceManager);
        
        
        InsuranceManager employee3 = organization1.getEmployeeDirectory().createandadInsuranceManager("Insurance Manager");
        account = organization1.getUserAccountDirectory().createInsuranceManagerUserAccount("imanager", "imanager", employee3, new InsuranceManagerRole(), network.getName());
        
        account.setNetwork(network.getName());
        
        hospital.getOrganizationDirectory().createOrganization(Organization.Type.BirthMotherOrg);
        hospital.getOrganizationDirectory().createOrganization(Organization.Type.ParentsOrg);
        
        
    }
    
}
