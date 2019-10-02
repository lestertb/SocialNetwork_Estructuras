package Classes;

import java.io.Serializable;

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
public class Client implements Serializable{

    public Client sig = null;

    public Client(String userName1) {
    }
    //atributes
    public String userName;
    public String password;
    public String country;
    public String city;
    public int id;
    public String name;
    public String lastName1;
    public String lastName2;
    public String urlImage;
    //pointers
    public Client next, prev;
    //links
    public FriendList nextFriendList;
    public  Reports nextReports;
    public Message nextMessage;
    
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
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }


}
