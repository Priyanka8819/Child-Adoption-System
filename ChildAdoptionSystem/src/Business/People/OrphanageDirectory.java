/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class OrphanageDirectory {
     private ArrayList<Orphanage> orphanageList;

    public OrphanageDirectory() {
        orphanageList = new ArrayList();
    }

    public ArrayList<Orphanage> getorphanageList() {
        return orphanageList;
    }
    
    public Orphanage createOrphanage(String name){
        Orphanage orphanage = new Orphanage();
        orphanage.setUsername(name);
        orphanageList.add(orphanage);
        return orphanage;
    }
    
    public void addOrphanage(Orphanage o){
        this.orphanageList.add(o);
    }
public ArrayList<Orphanage> getPendingOrphanages() {

    ArrayList<Orphanage> pending = new ArrayList<>();

    for(Orphanage orphanage : orphanageList){
      if(orphanage.status == Orphanage.Status.PENDING){
        pending.add(orphanage);
      }
    }

    return pending;
  }

  public ArrayList<Orphanage> getApprovedOrphanages() {

    ArrayList<Orphanage> approved = new ArrayList<>();

    for(Orphanage orphanage : orphanageList){
      if(orphanage.status == Orphanage.Status.APPROVED){
        approved.add(orphanage);
      }
    }

    return approved;
  }
  
  public ArrayList<Orphanage> getAllPendingFirstOrphanages() {

    ArrayList<Orphanage> all = new ArrayList<>();
    all.addAll(getPendingOrphanages());
    all.addAll(getApprovedOrphanages());
    return all;
  }
  

}
