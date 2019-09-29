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
public class FriendOfClient {
    public String name;
    public String lastName1;
    public String  lastName2;
    public FriendOfClient nextFrienOfClient;
    public Client nextClient;
    

    public FriendOfClient() {
    }

    public FriendOfClient(String name, String lastName1, String lastName2) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
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

   

}
