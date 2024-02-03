/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CounselorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class CounselorOrganization extends Organization{

    public CounselorOrganization() {
        super(Organization.Type.Counselor.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CounselorRole());
        return roles;
    }
     
}