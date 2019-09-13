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

    public Client client; //recibes a client
    public FriendOfClient next;
    public FriendList sigClient;
    public Client clientsig;

    public FriendOfClient() {
    }

    public FriendOfClient(Client client) {
        this.client = client;
    }

}
