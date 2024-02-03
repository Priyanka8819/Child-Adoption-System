/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FinanceAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class FinanceAdminOrganization extends Organization{

    public FinanceAdminOrganization() {
        super(Type.FinanceAdmin.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FinanceAdminRole());
        return roles;
    }
     
}
