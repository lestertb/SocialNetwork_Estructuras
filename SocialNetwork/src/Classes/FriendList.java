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
    public FriendList next,ant;
    public FriendsToAdd nextFriend;
    
    public static FriendList instance = null;
    public static FriendList getInstance(){
        if(instance == null){
            instance = new FriendList();
        }
        return instance;
    }
    
    
    public FriendList() {
    }
    //Constructor with params to generate the new Friendlist
    public FriendList(String listName, String listDescription) {
        this.listName = listName;
        this.listDescription = listDescription;
        this.next = this.ant = null;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getListDescription() {
        return listDescription;
    }

    public void setListDescription(String listDescription) {
        this.listDescription = listDescription;
    }
    
}