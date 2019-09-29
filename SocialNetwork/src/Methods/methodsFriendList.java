package Methods;

import Classes.*;
import javax.swing.JOptionPane;
/**
 *
 * @author andrey
 */
public class methodsFriendList {
    public FriendList head, last;
    
    public static methodsFriendList instance = null;
    public static methodsFriendList getInstance(){
        if(instance == null){
            instance = new methodsFriendList();
        }
        return instance;
    }
    public boolean insertFinal (String user,String listName, String listDescription){
        FriendList instance = FriendList.getInstance();
        instance.listName = listName;
        instance.listDescription = listDescription;
        
        FriendList newList = new FriendList(instance.listName, instance.listDescription );
        if (head==null){
            head = newList;
            head.next=null;          
            return true;
        }
        FriendList aux = head;
        
        while (aux != null){
            if (aux.listName.equals(listName)){
                return false;
            }          
            if (aux.next==null){
                aux.next = newList;             
                return true;   
            }
            aux = aux.next;
        } 
        return false;
    }
    public FriendList searchSpecificFriendlist(Client user,String listName){
        if(user.nextFriendList== null){
            return null;
        }
        FriendList aux = user.nextFriendList;
        while (aux != null){
            if (aux.listName.equals(listName)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
    }
    
     public FriendList searchAnyList(Client userName,String listName){
        if(userName.nextFriendList ==null){
            return null;
        }
        FriendList aux = userName.nextFriendList;
        while(aux!=null){
            if(aux.getListName().equals(listName)){
                return aux;
            }
            aux = aux.next;
        }
        return null;
    
    }
    
     public boolean deleteFriendList(Client user,String listName){
       FriendList aux = searchSpecificFriendlist(user,listName);
       if (aux == null) {
           JOptionPane.showMessageDialog(null, "It doesn't exist");
           return false;          
       }
       
       if (aux == head){
          if(head.next == null){
          head = last = null;
          }else{
          head = head.next;
          head.ant = null;
          head.next = null;
          }
          return true;
       }
       
       if(aux == last){
       last= last.ant;
       last = head;
       return true;
       
       }
       aux.ant.next = aux.next; 
       aux.next.ant = aux.ant;
       return true;
   }
    
}
