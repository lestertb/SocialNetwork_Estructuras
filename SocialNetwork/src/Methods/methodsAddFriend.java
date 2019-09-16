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
    FriendList head, last; 
    
    public static methodsAddFriend instance = null;
    public static methodsAddFriend getInstance(){
        if(instance == null){
            instance = new methodsAddFriend();
        }
        return instance;
    } 
    
    public int insertFinal(String userName,String friendUserName, String listName, String description){
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
        newList.nextUsuario = userListOwner;
        if (userListOwner.sigFriendList == null) { 
            userListOwner.sigFriendList = newList;
            newList.nextUsuario = userToAdd;
            return 2; 
        }
        FriendList aux = userListOwner.sigFriendList;
        while (aux != null) {            
            if (aux.next == null) {
                aux.next = newList.next;
                newList.nextUsuario = userToAdd; 
                aux.next = newList;
                return 2;
            }
            aux = aux.next;
        }
        return 3;
    }
}
