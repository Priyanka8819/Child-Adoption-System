/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.BankManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class BankManagerOrganization extends Organization{

    public BankManagerOrganization() {
        super(Organization.Type.BankManager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BankManagerRole());
        return roles;
    }
     
   
    
    
}
