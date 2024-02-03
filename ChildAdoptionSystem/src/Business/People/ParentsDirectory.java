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
public class ParentsDirectory {
    
    private ArrayList<Parents> parentsList;

    public ParentsDirectory() {
        parentsList = new ArrayList();
    }

    public ArrayList<Parents> getParentsList() {
        return parentsList;
    }
    
    
    public Parents createParents(String name){
        Parents parents = new Parents();
        parents.setUsername(name);
        parentsList.add(parents);
        return parents;
    }
    
    public Parents addParents(Parents parent){
        parentsList.add(parent);
        return parent;
    }
}