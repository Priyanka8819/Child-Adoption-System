/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.People.BankManager;
import Business.People.BirthMother;
import Business.People.Counsellor;
import Business.People.Employee;
import Business.People.InsuranceManager;
import Business.People.Parents;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author devansh
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
  
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccount(String username, String password, Employee employee, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createCounselorUserAccount(String username, String password, Counsellor employee, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setCounselor(employee);
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createBankManagerUserAccount(String username, String password, BankManager employee, Role role,String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setBankManager(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public UserAccount createInsuranceManagerUserAccount(String username, String password, InsuranceManager employee, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setInsuranceManager(employee);
        userAccount.setRole(role);
         userAccount.setNetwork(network);
        userAccountList.add(userAccount);
        return userAccount;
    }

    public UserAccount createUserAccountParents(String username, String password, Parents parent, Role role, String network){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setParent(parent);
        
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public UserAccount createUserAccountMother(String name,String username, String password, BirthMother mother, Role role, String network){
        UserAccount userAccount = new UserAccount();
            userAccount.setName(name);
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setBirthmother(mother);
        
        userAccount.setNetwork(network);
        userAccount.setRole(role);
        userAccountList.add(userAccount);
        return userAccount;
    }
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    public void deleteUserAccount(UserAccount userAccount)
    {
        userAccountList.remove(userAccount);
    }
}
