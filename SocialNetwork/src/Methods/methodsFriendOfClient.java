/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.*;

/**
 *
 * @author andre
 */
public class methodsFriendOfClient {
    
    public FriendOfClient head;
    
    
    public boolean insetFinal(String name, String lstName1,String lstName2 ){
        
        FriendOfClient newFriend = new FriendOfClient(name,lstName1, lstName2);
        if (head == null){
        head = newFriend;
        head.nextFrienOfClient = head;
        return true;
        }
        if (head.nextFrienOfClient == head){
            head.nextFrienOfClient = newFriend;
            newFriend.nextFrienOfClient = head;
            return true;
        }
                
      FriendOfClient aux = head;     
      while(aux != null){
           if(aux.nextFrienOfClient == null){
           aux.nextFrienOfClient = newFriend;
           aux.nextFrienOfClient = head;
           return true;
           }
           aux = aux.nextFrienOfClient;
      }
      

      return false;
  }
}
