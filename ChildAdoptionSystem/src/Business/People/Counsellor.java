/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import Business.WorkQueue.BirthMotherToLoan;
import Business.WorkQueue.BirthMotherToCounselor;
import Business.WorkQueue.ParentToCounselor;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author priya
 */
public class Counsellor extends Employee {
   private int workRequestCount;
   private int ratingReviews;
   private boolean isAvailable;
   private LocalTime availableTime;
   private ArrayList<BirthMotherToCounselor> birthMotherAlloted;
   private ArrayList<ParentToCounselor> parentsAlloted;

    public Counsellor(int ratingReviews, boolean isAvailable, LocalTime availableTime, ArrayList<BirthMotherToCounselor> bMA, ArrayList<ParentToCounselor> pA) {
        super();
        this.ratingReviews = ratingReviews;
        this.isAvailable = isAvailable;
        this.availableTime = availableTime;
        this.birthMotherAlloted = bMA;
        this.parentsAlloted = pA;
    }
    
    public Counsellor(){
        super();
        this.isAvailable = true;
        this.availableTime = LocalTime.MIN;
        this.birthMotherAlloted = new ArrayList<BirthMotherToCounselor>();
        this.parentsAlloted = new ArrayList<ParentToCounselor>();
    
    
    }
    public int getWorkRequestCount() {
        return workRequestCount;
    }

    public void setWorkRequestCount(int workRequestCount) {
        this.workRequestCount = workRequestCount;
    }

    public int getRatingReviews() {
        return ratingReviews;
    }

    public void setRatingReviews(int ratingReviews) {
        this.ratingReviews = ratingReviews;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public LocalTime getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(LocalTime availableTime) {
        this.availableTime = availableTime;
    }

    public ArrayList<BirthMotherToCounselor> getBirthMotherAlloted() {
        return birthMotherAlloted;
    }

    public void setBirthMotherAlloted(ArrayList<BirthMotherToCounselor> birthMotherAlloted) {
        this.birthMotherAlloted = birthMotherAlloted;
    }

    public ArrayList<ParentToCounselor> getParentsAlloted() {
        return parentsAlloted;
    }

    public void setParentsAlloted(ArrayList<ParentToCounselor> parentsAlloted) {
        this.parentsAlloted = parentsAlloted;
    }
}