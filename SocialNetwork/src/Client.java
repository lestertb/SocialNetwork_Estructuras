/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marco
 */
public class Client {
    String userName;
    String password;
    String country;
    String city;
    int id;
    String name;
    String lastName1;
    String lastName2;
    String urlImage;
    
    public static Client instance = null;
    public static Client getInstance(){
        if(instance == null){
            instance = new Client();
        }
        return instance;
    }

    public Client(){
    }    
    
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
    }  
}
