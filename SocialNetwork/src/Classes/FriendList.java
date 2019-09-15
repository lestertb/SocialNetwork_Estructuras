/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author andrey
 */

//Class to create FriendList
public class FriendList {
    public String listName;
    public String listDescription;
    public FriendList next;
    public Client nextUsuario;
    
    
    
    
    public FriendList() {
    }
    //Constructor with params to generate the new Friendlist
    public FriendList(String listName, String listDescription) {
        this.listName = listName;
        this.listDescription = listDescription;
    }
    
}