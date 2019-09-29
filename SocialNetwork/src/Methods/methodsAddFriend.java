/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.*;
import javax.swing.JOptionPane;


/**
 *
 * @author marco
 */
public class methodsAddFriend {
    FriendList head, last; 
    methodsClient metClient = methodsClient.getInstance();
     methodsFriendList metFriendList = methodsFriendList.getInstance();
        
    public static methodsAddFriend instance = null;
    public static methodsAddFriend getInstance(){
        if(instance == null){
            instance = new methodsAddFriend();
        }
        return instance;
    } 
    
     public boolean createList(Client user,String listName,String description){
         
         if(metClient.searchXUserName(user.userName)==null){//Checking if the user exists
              return false;
         }
        if(metFriendList.searchAnyList(user,listName)==null){// If the list doesn't exist, create it
            FriendList newList = new FriendList(listName, description);
            if(user.nextFriendList==null){
                user.nextFriendList = newList;
                return true;
            }
            FriendList aux = user.nextFriendList;
            while(aux !=null){
                if(aux.next == null){ //Insert in the last position
                    aux.next = newList;
                    return true;
                }
                aux = aux.next;
            }
        }
        return false;
     }
     
     public Client searchFriendInAListName(Client userName,String listName,String friend) {
        
        FriendList list = metFriendList.searchSpecificFriendlist(userName,listName);
        FriendsToAdd aux = list.nextFriend;
        while(aux!=null){
            if(aux.newFriend.userName.equals(friend)){
                return aux.newFriend;
                
            }
            aux = aux.sig;
        }
        return null;
    }
     
     public Client searchFriend(Client userName,String listName,String friend) {
        
        FriendList list = userName.nextFriendList;
        FriendsToAdd aux = list.nextFriend;
        while(aux!=null){
            if(aux.newFriend.userName.equals(friend)){
                return aux.newFriend;
                
            }
            aux = aux.sig;
        }
        return null;
    }
    
     public boolean addFriendToSpecificList(Client userName,String listName,String friend){
        
        if(searchFriendInAListName(userName, listName, friend)!=null){//Search if the friend exists in the list required
            JOptionPane.showMessageDialog(null, "Friend doesn't exist");
            return false;
        }
        
        FriendList list = metFriendList.searchSpecificFriendlist(userName, listName); 
        Client userFriend = metClient.searchXUserName(friend);
        if(list!=null){
            if(userFriend!=null){
                FriendsToAdd auxFriends = list.nextFriend;
                FriendsToAdd newAddFriend = new FriendsToAdd();
                newAddFriend.newFriend =userFriend;
                if(auxFriends==null){
                    
                    
                    list.nextFriend = newAddFriend;
                    return true;
                }
                
                while(auxFriends !=null){
                    if(auxFriends.sig==null){
                        auxFriends.sig = newAddFriend;
                        return true;
                    }
                    auxFriends =auxFriends.sig;
                }
                
                        
            }
                
                
        }
        
        return false;
    }
     
     
     public boolean deleteACompleteFriendList(Client user,String listName){//This method delete a friend list by it's list name
        
        FriendList aux = user.nextFriendList;
        
        while(aux!=null){
            if(aux.listName.equals(listName)){
                user.nextFriendList = aux.next;
                return true;
            }
            if(aux.next.listName.equals(listName)){
                
                aux.next = aux.next.next;
                return true;
            }
            aux = aux.next;
        }
        
    
        return false;
    }
     
      public boolean deleteFriend(Client userName,String listName,String friend){
        FriendList friendList = metFriendList.searchSpecificFriendlist(userName, listName);
        FriendsToAdd aux = friendList.nextFriend;
        if(searchFriendInAListName(userName, listName, friend)!=null){
            while(aux !=null){

                if(friendList.nextFriend.newFriend.userName.equals(friend)){
                        friendList.nextFriend = aux.sig;
                        return true;
                    }
                if(aux.sig.newFriend.userName.equals(friend)){
                    aux.sig = aux.sig.sig;
                    return true;

                }
                aux = aux.sig;
            }

            return false;
        }
        
       // JOptionPane.showMessageDialog(null, "Can't find the Friend in the list");
        return false;
    }
      
      public boolean modifyListFriend(Client userName, String listName, String newListName, String newDescription){
     /* if(metFriendList.searchSpecificFriendlist(userName, listName)==null){
          return false;
      }*/
      FriendList aux = userName.nextFriendList;
      while(aux!=null){
          if(aux.getListName().equals(listName)){
                    aux.setListName(newListName); 
                    aux.setListDescription(newDescription); 
                    return true;
              }
          aux = aux.next;
      }
      return false;
      }
      
}
