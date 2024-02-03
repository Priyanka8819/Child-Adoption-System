/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author kesha
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    
   //Creating and initializing Enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type==Enterprise.EnterpriseType.Hospital){
            enterprise=new HospitalEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
            return enterprise;
        }
        if(type==Enterprise.EnterpriseType.FinancialEnterprise){

            enterprise=new FinancialEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
            return enterprise;
        }
         if(type==Enterprise.EnterpriseType.OrphanageEnterprise){
            enterprise=new OrphangeEnterprise(name);
            enterprise.setEnterpriseType(type);
            enterpriseList.add(enterprise);
            return enterprise;
        }
        return null;
    }
    public boolean containsName(String type){
        for (Enterprise org : enterpriseList){
            if(org.getName().equals(type)){
                return true;
            }
        }
        return false;
    }
    
}
