/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.People.Counsellor;
import Business.People.Orphanage;

/**
 *
 * @author priya
 */
public class OrphanageToCounselor extends WorkRequest{
    
    private String requestResult;
    private Orphanage orphanage;
    private String counsellorFeeback;
    private Counsellor counsellor;

    public OrphanageToCounselor() {
        super();
    }

    public OrphanageToCounselor(Orphanage orphanage) {
        super();
        this.requestResult = new String();
        this.orphanage = orphanage;
        this.counsellorFeeback = new String();
    }

    public String getRequestResult() {
        return requestResult;
    }

    public void setRequestResult(String requestResult) {
        this.requestResult = requestResult;
    }

    public Orphanage getOrphanage() {
        return orphanage;
    }

    public void setOrphanage(Orphanage orphanage) {
        this.orphanage = orphanage;
    }

    public String getCounsellorFeeback() {
        return counsellorFeeback;
    }

    public void setCounsellorFeeback(String counsellorFeeback) {
        this.counsellorFeeback = counsellorFeeback;
    }

    public Counsellor getCounsellor() {
        return counsellor;
    }

    public void setCounsellor(Counsellor counsellor) {
        this.counsellor = counsellor;
    }
    
     public void selectCounsellor(){
        
      //TODO: Function to allot the Counsellor to BirthMother  
    }
 
}
