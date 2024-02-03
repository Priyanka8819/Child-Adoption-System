/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class EcoSystem extends Organization{
    
    public static EcoSystem system;
    public ArrayList<Network> networkList;
    public static EcoSystem getInstance(){
//        if(system==null){
            system=new EcoSystem();
//        }
    System.out.println("system");
    System.out.println(system);

        return system;
    }
    
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public Network addNetwork()
    {
        Network network = new Network();
        networkList.add(network);
        return network;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
        return true;
    }
}
