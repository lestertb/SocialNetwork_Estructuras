/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.*;


/**
 *
 * @author marco
 */
public class methodsAddFriend {
    FriendList inicio, ultimo; 
    
    public static methodsAddFriend instance = null;
    public static methodsAddFriend getInstance(){
        if(instance == null){
            instance = new methodsAddFriend();
        }
        return instance;
    } 
    
    public int insertarInicio(String userName,String friendUserName, String listName, String description){
        methodsClient metUser = methodsClient.getInstance();
        Client userListOwner = metUser.searchXUserName(userName);
        if (userListOwner == null) {
            return 0; //Doesn't exist UserOwner
        }
        Client userToAdd = metUser.searchXUserName(friendUserName);
        if (userToAdd ==null) { 
            return 1; //Doesn't exist UserFriend
        }
        FriendList newList = new FriendList(listName,description);
        
        if (userListOwner.sigFriendList == null) { 
            userListOwner.sigFriendList = newList;
            newList.nextUsuario = userToAdd;
            return 2; 
        }
        newList.next = userListOwner.sigFriendList;
        newList.nextUsuario = userToAdd; 
        userListOwner.sigFriendList = newList;
        return 2;
    }
}
