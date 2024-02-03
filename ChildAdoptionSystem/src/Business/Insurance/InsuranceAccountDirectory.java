/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Insurance;

import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class InsuranceAccountDirectory {
        private ArrayList<Insurance> insuranceList;

    public InsuranceAccountDirectory() {
        insuranceList = new ArrayList();
    }

    public ArrayList<Insurance> getInsuranceList() {
        return insuranceList;
    }
 
    public Insurance addInsurance(Insurance ins){
        insuranceList.add(ins);
        return ins;
    }
}
