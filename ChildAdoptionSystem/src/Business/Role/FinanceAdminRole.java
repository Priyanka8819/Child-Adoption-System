/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import userinterface.FinanceAdministrativeRole.FinanceAdminWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author devansh
 */
public class FinanceAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
        return new FinanceAdminWorkAreaJPanel(userProcessContainer, enterprise, account);
    }

    
    
}
