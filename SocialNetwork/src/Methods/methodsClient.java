/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.Client;
import Views.*;
import javax.swing.*;

/**
 *
 * @author Lester Trejos
 */
public class methodsClient {
    // Creation of varibles to carry the first nodo and the lastone
    public Client head, last;
 
    //Create the instance
    public static methodsClient instance = null;
    public static methodsClient getInstance(){
        if(instance == null){
            instance = new methodsClient();
        }
        return instance;
    }

    //--------------------------Methods-------------------------------+
    
    
    //Method to insert ordered by userName alphabetically
    public boolean InsertOrdered(String userName, String password, String country, String city, int id, String name, String lastName1, String lastName2, String urlImage){
        Client instance = Client.getInstance(); 
        instance.userName = userName;
        instance.password = password;
        instance.country = country;
        instance.city = city;
        instance.id = id;
        instance.name = name;
        instance.lastName1 = lastName1;
        instance.lastName2 = lastName2;  
        instance.urlImage = urlImage;
        Client newUser = new Client(instance.userName, instance.password, 
                instance.country, instance.city, instance.id, instance.name,
                instance.lastName1, instance.lastName2, instance.urlImage);
        // is null?
        if (head == null) { 
            head = last = newUser;
            head.prev = last;
            last.next = head;
            head.next = last;
            last.prev = head;
            return true;
        }
        //already exist?
        if ((head.userName.equals(newUser.userName))|(last.userName.equals(newUser.userName))) { 
            return false;
        }
        //already exist?
        if ((head.id == newUser.id) | (last.id == newUser.id)) {
            return false;
        }
        //Insert at the beginning
        if(newUser.userName.compareTo(head.userName) < 0){ 
            newUser.next = head;
            head.prev = newUser;
            head = newUser;
            head.prev = last;
            last.next = head;
            return true;
        }
        //Insert in the end
        if(last.userName.compareTo(newUser.userName) < 0){
            last.next = newUser;
            newUser.prev = last;
            last = newUser;
            head.prev = last;
            last.next = head;
            return true;
        }
        // back up the head in an auxiliar varible
        Client aux = head;
        while (aux != null) {
            // Already exist?
            if (newUser.userName.equals(aux.userName)) {
                return false;
            }
            // Already exist?
            if (newUser.id == aux.id) {
                return false;
            }
            //Insert in the middle
            if (newUser.userName.compareTo(aux.userName) < 0) {
                aux.prev.next = newUser;
                newUser.prev = aux.prev;
                newUser.next = aux;
                aux.prev = newUser;
                return true;
            }
            aux = aux.next;
        }
        return false;
   }
    
    // Method to search by User Name
    public Client searchXUserName(String userName){
        Client aux = head;
        while (aux != null){
            if (aux.userName.equals(userName)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
           
    }
    // Method to search by ID
    public Client searchXID(int id){  
         Client aux = head;
        while (aux != null){
            if (aux.id == id){
                return aux;
            }
            aux = aux.next;
        }
        return null;
    }
   
    public Client searchXCountry(String country){
        Client aux = head;
        while (aux != null){
            if (aux.country.equals(country)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
    }
    
    public Client searchXCity(String City){
        Client aux = head;
        while (aux != null){
            if (aux.city.equals(City)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
    }
    
    
       public boolean delete(String userName){
        Client aux = searchXUserName(userName);
       if (aux == null) {
           JOptionPane.showMessageDialog(null, "Doesn't exist");
           return false;          
       }
       
       if (aux == head){
          if(head.sig == null){
          head = last = null;
          }else{
          head = head.sig;
          head.prev = null;
          }
          return true;
       }
       
       if(aux == last){
       last= last.prev;
       last.next = null;
       return true;
       
       }
       aux.prev.next = aux.next;
       aux.next.prev = aux.prev;
       return true;
   }
       
    
    
}
