
package Methods;

import Classes.Message;


/**
 *
 * @author andrey
 */
public class methodsMessage {

    public static methodsMessage instance = null;
    public static methodsMessage getInstance(){
        if(instance == null){
            instance = new methodsMessage();
        }
        return instance;
    }
    
    public Message head; //indicate first nodo of list
    public Message aux= head;
    public Message ant;
    
    
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
        if(searchID(messageID)== null){
            newMessage.next = head;
            head = newMessage;
            return true;
        }
        return false;
    }
    
      //validates ID
    public Message searchID(int ID){
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
        
        
        Message ant = head;
      while(aux != null){
           if(aux.messageID == ID){
               ant.next = aux.next;
                return true;
           }
           ant = aux;
           aux = aux.next;
    }
      return false;    
    }
    
       public boolean modifyMssg(String text, int ID){
        while(aux != null){
             if (aux.messageID == ID) {
                aux.messageText = text;
                return true;
            }
               aux = aux.next;
        }
        return false;
   }
       
    }