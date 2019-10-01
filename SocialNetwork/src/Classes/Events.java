/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.Date;

/**
 *
 * @author marco
 */
public class Events {
    public int  id_event;
    public String eventName;
    public String eventDescription;
    public String city;
    public Date eventDate;
    public String state; // Pending, Cancelled or Realized
    public Events sig = null;
    public Events next, prev;
    public String owner;
  
  //Create the instance
    public static Events instance = null;
    public static Events getInstance(){
        if(instance == null){
            instance = new Events();
        }
        return instance;
    }

    public Events() {
    }

    public Events(int id_event, String eventName, String eventDescription, String city, Date eventDate, String state, String owner) {
        this.id_event = id_event;
        this.eventName = eventName;
        this.eventDescription = eventDescription;
        this.city = city;
        this.eventDate = eventDate;
        this.state = state;
        this.owner = owner;
    }
    
    

    public int getId_event() {
        return id_event;
    }

    public void setId_event(int id_event) {
        this.id_event = id_event;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
