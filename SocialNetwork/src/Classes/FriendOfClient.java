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
    public String friend;
    public FriendOfClient sigFrienOfClient;
    public Client sigClient;

    public FriendOfClient() {
    }

    public FriendOfClient(String friend) {
        this.friend = friend;
    }
}
