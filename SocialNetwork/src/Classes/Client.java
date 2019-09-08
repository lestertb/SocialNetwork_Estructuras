package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
//Class to create Users
public class Client {

    public Client(String userName1) {
    }
    public String userName;
    public String password;
    public String country;
    public String city;
    public int id;
    public String name;
    public String lastName1;
    public String lastName2;
    public String urlImage;
    public Client next, prev;
    
    //Create the instance to get the user  
    public static Client instance = null;
    public static Client getInstance(){
        if(instance == null){
            instance = new Client();
        }
        return instance;
    }

    //Constructor without params to generate the instance
    public Client() {
    }
  
    
    //Constructor with params to generate the new user
    
      public Client(String userName, String password, String country, String city, int id, String name, String lastName1, String lastName2, String urlImage) {
        this.userName = userName;
        this.password = password;
        this.country = country;
        this.city = city;
        this.id = id;
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.urlImage = urlImage;
        this.next = this.prev = null;
    }
    
   
}
