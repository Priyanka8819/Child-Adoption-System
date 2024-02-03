/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.BirthMother;
import Business.People.Parents;

/**
 *
 * @author devansh
 */
public class BirthMotherToParent extends WorkRequest{
   
    private String requestResult;
    private BirthMother mother;
 
    private Parents parent;
 
    public BirthMotherToParent(BirthMother BM, Parents p) {

        super();
        this.requestResult = new String();
        this.mother = BM;
        this.parent = p;
    }

    public BirthMother getBirthMother() {
        return mother;
    }

    public void setBirthMother(BirthMother m) {
        this.mother = m;
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Parents getParent() {
        return parent;
    }

    public void setParent(Parents parent) {
        this.parent = parent;
    }
 @Override
    public String toString() {
        return mother.getUsername();
    }
   
    
 
}
