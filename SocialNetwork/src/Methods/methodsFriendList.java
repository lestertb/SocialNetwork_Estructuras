package Methods;

import Classes.*;
import javax.swing.JOptionPane;
/**
 *
 * @author andrey
 */
public class methodsFriendList {
    public FriendList head, last;
    
//Create the instance to get the FriendList
    public static methodsFriendList instance = null;
    public static methodsFriendList getInstance(){
        if(instance == null){
            instance = new methodsFriendList();
        }
        return instance;
    }
    public boolean insertFinal (String user,String listName, String listDescription){
        FriendList newList = new FriendList (listName, listDescription);
        if (head==null){
            head = newList;
            last = newList;
            return true;
        }
        FriendList aux = head;
        
        while (aux != null){
            if (aux.listName.equals(listName)){
                JOptionPane.showMessageDialog(null, "List name repeated");
                return false;
            }          
            if (aux.next==null){
                aux.next = newList;
                last=newList;
                return true;   
            }
            aux = aux.next;
        } 
        return false;
    }
    public FriendList searchFriendlist(String listName){
        FriendList aux = head;
        while (aux != null){
            if (aux.listName.equals(listName)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
    }
}
