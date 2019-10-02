/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.Client;
import Classes.Events;
import java.io.Serializable;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Lester Trejos
 */
public class methodsEvents implements Serializable{
    
    // Creation of varibles to carry the first nodo and the lastone
    public Events head, last;
 
    //Create the instance
    public static methodsEvents instance = null;
    public static methodsEvents getInstance(){
        if(instance == null){
            instance = new methodsEvents();
        }
        return instance;
    }

    //--------------------------Methods-------------------------------+
    
    //Method to insert ordered by Date
    public boolean InsertOrdered(int id_event, String eventName,
        String eventDescription, String city, Date eventDate, String state, String owner){
        Events instance = Events.getInstance(); 
        instance.id_event = id_event;
        instance.eventName = eventName;
        instance.eventDescription = eventDescription;
        instance.city = city;
        instance.eventDate = eventDate;
        instance.state = state;
        instance.owner = owner;
        Events newEvent = new Events(instance.id_event, instance.eventName, 
                instance.eventDescription, instance.city, instance.eventDate, instance.state, instance.owner);
        // is null?
        if (head == null) { 
            head = last = newEvent;
            head.prev = last;
            last.next = head;
            head.next = last;
            last.prev = head;
            return true;
        }
        //already exist?
        if ((head.eventName.equals(newEvent.eventName))|(last.eventName.equals(newEvent.eventName))) { 
            return false;
        }
        //already exist?
        if ((head.id_event == newEvent.id_event) | (last.id_event == newEvent.id_event)) {
            return false;
        }
        //Insert at the beginning
        if(newEvent.eventDate.compareTo(head.eventDate) < 0){ 
            newEvent.next = head;
            head.prev = newEvent;
            head = newEvent;
            head.prev = last;
            last.next = head;
            return true;
        }
        //Insert in the end
        if(last.eventDate.compareTo(newEvent.eventDate) < 0){
            last.next = newEvent;
            newEvent.prev = last;
            last = newEvent;
            head.prev = last;
            last.next = head;
            return true;
        }
        // back up the head in an auxiliar varible
        Events aux = head;
        while (aux != null) {
            // Already exist?
            if (newEvent.eventName.equals(aux.eventName)) {
                return false;
            }
            // Already exist?
            if (newEvent.id_event == aux.id_event) {
                return false;
            }
            //Insert in the middle
            if (newEvent.eventDate.compareTo(aux.eventDate) < 0) {
                aux.prev.next = newEvent;
                newEvent.prev = aux.prev;
                newEvent.next = aux;
                aux.prev = newEvent;
                return true;
            }
            aux = aux.next;
        }
        return false;
   }
    
    
    // Method to search by Event name
    public Events searchXEventName(String eventName){
        System.out.println("1");
        Events aux = head;
        if (eventName.equals(head.eventName)) {
             System.out.println("2");
            return aux;
        }else{
            aux = aux.next;
            while (aux != head){
                if (aux.eventName.equals(eventName)){
                    return aux;
                }
            aux = aux.next;
            }
            return null;
        }
    }
    
    
    public boolean delete(String eventName, String owner){
       Events aux = searchXEventName(eventName);
       if (aux == null) {
           JOptionPane.showMessageDialog(null, "Doesn't exist");
           return false;          
       }
       if (aux.state.equals("Cancelled")){
           JOptionPane.showMessageDialog(null, "This event is canceled");
           return false;
       }
       if (aux.state.equals("Realized")){
           JOptionPane.showMessageDialog(null, "This event is Realized");
           return false;
       }
            if (aux == head){
                if(head.next == null){
                    head = last = null;
                }else{
                head = head.next;
                head.prev = null;
                }
                return true;
            }
            else if(aux == last){
            last = last.prev;
            last.next = null;
            return true;
            }
            aux.prev.next = aux.next;
            aux.next.prev = aux.prev;
            return true;
   }


  
}
