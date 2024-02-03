/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.People;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author priya
 */
public class Orphanage {
    
  public String name;
  public String password;
  public String username;
  public String location;
  public Status status = Status.PENDING;
  public String comment;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
  
  

//  public ArrayList<Orphan> orphans;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public Status getStatus() {
    return status;
  }

  public void setStatus(Status status) {
    this.status = status;
  }

//  public ArrayList<Orphan> getOrphans() {
//    return orphans;
//  }
//
//  public void setOrphans(ArrayList<Orphan> orphans) {
//    this.orphans = orphans;
//  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public enum Status{
    APPROVED,
    PENDING,
    INVALID
  }
}