/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author andrey
 */
public class Message {
    //atributes
    public int messageID;
    public String messageText;
    public String urlImage;
    public String sender;
    public String addressee;
    //pointers
    public Message next;
    
        public static Message instance = null;
    public static Message getInstance(){
        if(instance == null){
            instance = new Message();
        }
        return instance;
    }

    public Message() {
    }

    //Constructor with params to generate the new message
    public Message(int messageID, String messageText, String urlImage, String sender,String addressee) {
        this.messageID = messageID;
        this.messageText = messageText;
        this.urlImage = urlImage;
        this.sender = sender;
        this.addressee= addressee;
    }    

    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getAddressee() {
        return addressee;
    }

    public void setAddressee(String addressee) {
        this.addressee = addressee;
    }
     
}
