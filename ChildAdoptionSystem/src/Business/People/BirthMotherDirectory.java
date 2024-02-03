/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class BirthMotherDirectory {
    
    private ArrayList<BirthMother> birthMotherList;

    public BirthMotherDirectory() {
        birthMotherList = new ArrayList();
    }

    public ArrayList<BirthMother> getBirthMotherList() {
        return birthMotherList;
    }
    
    public BirthMother createBirthMother(String name){
        BirthMother birthMother = new BirthMother();
        birthMother.setUsername(name);
        birthMotherList.add(birthMother);
        return birthMother;
    }
    
    public void addBirthMother(BirthMother BM){
        this.birthMotherList.add(BM);
    }

  
}