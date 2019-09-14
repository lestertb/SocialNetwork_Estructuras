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
    
    public int insertarInicio(String userName,String friendName, String listName, String description){
        methodsClient metUser = methodsClient.getInstance();
        Client auxUsuarioEnvio = metUser.searchXUserName(userName);
        if (auxUsuarioEnvio == null) {
            return 0; //no existe Usuario Remitente
        }
        methodsClient metFriend = methodsClient.getInstance();
        Client auxUsuarioDesti = metFriend.searchXUserName(friendName);
        if (auxUsuarioDesti ==null) { //no existe Usuario Destinatario
            return 1;
        }
        FriendList newList = new FriendList(listName,description);
        newList.nextUsuario  = auxUsuarioEnvio;
        //auxUsuarioDesti.sigUsarioEnvio sería el inicio de cada subLista
        if (auxUsuarioDesti.sigFriendList == null) { //si no exite nodo, lo crea
            auxUsuarioDesti.sigFriendList = newList;
            return 2; 
        }
        newList.next = auxUsuarioDesti.sigFriendList; //en caso de que ya exista nodo, lo asigna al inicio
        auxUsuarioDesti.sigFriendList = newList;  
        return 2; //asignado
    }
}
