
package Methods;

import Classes.Message;
import java.io.Serializable;


/**
 *
 * @author andrey
 */
public class methodsMessage implements Serializable{
    public Message head; //indicate first nodo of list
    
    public static methodsMessage instance = null;
    public static methodsMessage getInstance(){
        if(instance == null){
            instance = new methodsMessage();
        }
        return instance;
    }
    

       //Insert message to a first nodo of the list
    public boolean insertBegin (int messageID,String message, String image,String sender, String addressee){
     Message instance = Message.getInstance();
     instance.messageID = messageID;
     instance.messageText = message;
     instance.urlImage= image;
     instance.sender = sender;
     instance.addressee = addressee;

     Message newMessage = new Message(instance.messageID,instance.messageText,instance.urlImage, instance.sender, instance.addressee);
     if (head == null) {
         head = newMessage;
         return true;
     }
     Message aux = head;
     while(aux != null){
        if(aux.messageID == messageID){
            return false;
        }
        aux = aux.next;
        }
        newMessage.next = head;
        head = newMessage;
        return true;
    }
    
      //validates ID
    public Message searchID(int ID){
        Message aux = head;
        while(aux != null){
            if (aux.messageID == ID) {
                return aux;
            }
            
            aux = aux.next;
        }
        return null;
    }
   
    
             //Delete by ID
    public boolean DeleteMessage(int ID){
        if (head == null) {
            return false;
        }
        if (head.messageID == ID) {
            head = head.next;
            return true;
        }
        Message prev = head;
        Message aux = head;
        while (aux != null) {            
            if (aux.messageID == ID) {
                prev.next = aux.next;
                return true;
            }
            prev = aux;
            aux = aux.next;
        }
        return false;
    }
    
    
    
    public boolean modifyMssg(String text, int ID){
        Message aux = head;
        while (aux != null) {            
            if (aux.messageID == ID) {
                aux.messageText = text;
                return true;
            }
            aux = aux.next;
        }
        return false;
    }
       
 }