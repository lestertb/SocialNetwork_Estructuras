/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.*;
import java.io.Serializable;
import javax.swing.JOptionPane;


/**
 *
 * @author marco
 */
public class methodsAddFriend implements Serializable{
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
        if(searchList(user,listName)==null){
            FriendList newFriendList = new FriendList(listName, description);
            if(user.nextFriendList==null){
                user.nextFriendList = newFriendList;
                return true;
            }
            FriendList aux = user.nextFriendList;
            while(aux !=null){
                if(aux.next == null){
                    aux.next = newFriendList;
                    return true;
                }
                aux = aux.next;
            }
            
            
            
        }
        
        return false;
        
    }
     public Client searchFriends(Client user,String listName,String userName) {
        
        FriendList list = searchList(user,listName);
        FriendsToAdd auxFriends = list.nextFriend;
        while(auxFriends!=null){
            if(auxFriends.newFriend.getUserName().equals(userName)){
                return auxFriends.newFriend;
                
            }
            auxFriends = auxFriends.sig;
        }
        return null;
    }
     
     
   public FriendList searchFriendInAListName(Client userName,String listName,String friend) {
        System.out.println("1");
        FriendList list = metFriendList.searchSpecificFriendlist(userName, listName); 
        Client userFriend = metClient.searchXUserName(friend);
        if(list!=null){
            System.out.println("2");
            if(userFriend!=null){
                System.out.println("3");
                FriendsToAdd auxFriends = list.nextFriend;//inicio
                FriendsToAdd newAddFriend = new FriendsToAdd();
                newAddFriend.newFriend = userFriend;//nuevo
                if (newAddFriend.newFriend.userName.equals(list.nextFriend.newFriend.userName)) {
                    System.out.println("4");
                    return list;
                }/*else{
                    auxFriends = auxFriends.sig;
                    FriendList aux = list;
                    while (auxFriends != list.nextFriend) {
                        if (auxFriends.newFriend.equals(newAddFriend.newFriend)) {
                           return aux;}
                        else{
                            aux = aux.next;
                        }
                      auxFriends = auxFriends.sig;
                    }
                    return null;
                   }*/
                }
                 return null;                           
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
     public FriendList searchList(Client user,String listName){
        if(user.nextFriendList ==null){
            return null;
        }
        FriendList aux = user.nextFriendList;
        while(aux!=null){
            if(aux.getListName().equals(listName)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
    
    }
     
     FriendsToAdd latest;//Final of list
     public boolean addFriends(Client user,String listName,String userName){
        
        if(searchFriends(user, listName, userName)!=null){
            JOptionPane.showMessageDialog(null, "Frienda already added in this list");
            return false;
        }
        
         FriendList list = searchList(user,listName); 
        Client userFriend = metClient.searchXUserName(userName);
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
     
      public boolean deleteFriend(Client user,String listName,String userName){
        FriendList list = searchList(user, listName);
        FriendsToAdd auxFriend = list.nextFriend;
        if(searchFriends(user, listName, userName)!=null){
            while(auxFriend !=null){

                if(list.nextFriend.newFriend.getUserName().equals(userName)){
                        list.nextFriend = auxFriend.sig;
                        return true;
                    }
                if(auxFriend.sig.newFriend.getUserName().equals(userName)){
                    auxFriend.sig = auxFriend.sig.sig;
                    return true;

                }
                auxFriend = auxFriend.sig;
            }

            return false;
        }
        
        JOptionPane.showMessageDialog(null, "Friend not finded");
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
