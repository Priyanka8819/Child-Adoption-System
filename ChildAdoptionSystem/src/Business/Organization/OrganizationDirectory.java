/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Counselor.getValue())){
            organization = new CounselorOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BankManager.getValue())){
            organization = new BankManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.FinanceAdmin.getValue())){
            organization = new FinanceAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.HospitalAdmin.getValue())){
            organization = new HospitalAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.InsuranceManager.getValue())){
            organization = new InsuranceManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.BirthMotherOrg.getValue())){
            organization = new BirthMotherOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.ParentsOrg.getValue())){
            organization = new ParentsOrganization();
            organizationList.add(organization);
        }
        else if(type.getValue().equals(Type.OrphanageAdmin.getValue())){
        organization = new OrphanAdminOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
    public boolean containsType(Type type){
        for (Organization org : organizationList){
            if(org.getName().equals(type.getValue())){
                return true;
            }
        }
        return false;
    }
    
}