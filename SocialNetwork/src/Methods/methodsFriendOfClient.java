/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Methods;

import Classes.Client;
import Classes.FriendList;
import Classes.FriendOfClient;

/**
 *
 * @author marco
 */
public class methodsFriendOfClient {
    
    public static  methodsFriendOfClient instance = null;
    public static  methodsFriendOfClient getInstance(){
    if(instance == null){
        instance = new methodsFriendOfClient();
    }
    return instance;
    }
      public int insertFinal(String userName, String listName, Client userName2){
        methodsClient metClient = methodsClient.getInstance();
        Client auxClient = metClient.searchXUserName(userName);
        if (auxClient == null) { //there's not client
            return 0; 
        }
        methodsFriendList metFriendList = methodsFriendList.getInstance();
          FriendList auxFriendList = metFriendList.searchFriendlist(listName);
        if (auxFriendList ==null) { //there's not friendList
            return 1;
        }
        
        FriendOfClient friendClient = new FriendOfClient(userName2);
        friendClient.sigClient = auxFriendList; // aims to the last node
        if (auxClient.nextFriend == null) { //if there is not a node, it create it
            auxClient.nextFriend = friendClient;
            return 2; 
        }
        FriendOfClient aux = auxClient.nextFriend;
        while(aux.sig!=null){
        aux = aux.sig;
        }
        aux.sig = friendClient;
        return 2;
    }
    
    


}