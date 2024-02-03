/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.Random;



/**
 *
 * @author priya
 */
public class Parents {
    
    private String imgPath;
    private String firstName;
    private String lastName;
    private String bloodGroup;
    private int funds;
    private int remainingFunds;

    private String address;
    private String counselor;
    private int currentFunds;
    private String username;
    private BirthMother birthMother;
    private int parentId;
    private boolean isAvailable;
    private static int count = new Random().nextInt(100);
    private String email;
    private String password;
    private boolean worstCaseScenerio;
    private boolean finChild;
    private boolean bigChanges;
    private boolean comSituation;
    private boolean currChildrenOnBoard;
    private boolean eduRealities;
    private boolean promises;
    private boolean guilt;
    private String contactParent;

    public int getRemainingFunds() {
        return remainingFunds;
    }

    public void setRemainingFunds(int remainingFunds) {
        this.remainingFunds = remainingFunds;
    }
    
    public String getContactParent() {
        return contactParent;
    }

    public void setContactParent(String contactParent) {
        this.contactParent = contactParent;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public BirthMother getBirthMother() {
        return birthMother;
    }

    public void setBirthMother(BirthMother birthMother) {
        this.birthMother = birthMother;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public int getCurrentFunds() {
        return currentFunds;
    }

    public void setCurrentFunds(int currentFunds) {
        this.currentFunds = currentFunds;
    }

    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public Parents(String username, String email, String password, boolean worstCaseScenerio, boolean finChild, boolean bigChanges, boolean comSituation, boolean currChildrenOnBoard, boolean eduRealities, boolean promises, boolean guilt) {
        parentId = count;
        count++;
        this.email = email;
        this.password = password;
        this.username = username;
        this.bigChanges = bigChanges;
        this.comSituation = comSituation;
        this.currChildrenOnBoard = currChildrenOnBoard;
        this.eduRealities = eduRealities;
        this.finChild = finChild;
        this.guilt = guilt;
        this.promises = promises;
        this.worstCaseScenerio = worstCaseScenerio;
        this.counselor = new String();
        this.isAvailable = false;
    }

    public String getEmail() {
        return email;
    }

    public String getCounselor() {
        return counselor;
    }

    public void setCounselor(String counselor) {
        this.counselor = counselor;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isWorstCaseScenerio() {
        return worstCaseScenerio;
    }

    public void setWorstCaseScenerio(boolean worstCaseScenerio) {
        this.worstCaseScenerio = worstCaseScenerio;
    }

    public boolean isFinChild() {
        return finChild;
    }

    public void setFinChild(boolean finChild) {
        this.finChild = finChild;
    }

    public boolean isBigChanges() {
        return bigChanges;
    }

    public void setBigChanges(boolean bigChanges) {
        this.bigChanges = bigChanges;
    }

    public boolean isComSituation() {
        return comSituation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setComSituation(boolean comSituation) {
        this.comSituation = comSituation;
    }

    public boolean isCurrChildrenOnBoard() {
        return currChildrenOnBoard;
    }

    public void setCurrChildrenOnBoard(boolean currChildrenOnBoard) {
        this.currChildrenOnBoard = currChildrenOnBoard;
    }

    public boolean isEduRealities() {
        return eduRealities;
    }

    public void setEduRealities(boolean eduRealities) {
        this.eduRealities = eduRealities;
    }

    public boolean isPromises() {
        return promises;
    }

    public void setPromises(boolean promises) {
        this.promises = promises;
    }

    public boolean isGuilt() {
        return guilt;
    }

    public void setGuilt(boolean guilt) {
        this.guilt = guilt;
    }
    
    public Parents() {
        parentId = count;
        count++;
        this.email =new String();
        this.password = new String();
        this.username = new String();
        this.bigChanges = false;
        this.comSituation = false;
        this.currChildrenOnBoard = false;
        this.eduRealities = false;
        this.finChild = false;
        this.guilt = false;
        this.promises = false;
        this.worstCaseScenerio = false; 
        this.counselor = new String();
        this.isAvailable = false;
        
    }

    public int getParentId() {
        return parentId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    
    public String getUsername() {
        return username;
    }
    
    public void setAllValues(String username, String firstName, String LastName, String email, String blood, int funds, String address, String imgPath, String contact) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = LastName;
        this.email = email;
        this.bloodGroup = blood;
        this.funds = funds;
        this.address = address;
        this.imgPath = imgPath;
        this.contactParent = contact;
    }
    
    @Override
    public String toString() {
        return username;
    }

}
