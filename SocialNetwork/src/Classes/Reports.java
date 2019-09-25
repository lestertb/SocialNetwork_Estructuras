/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author marco
 */
public class Reports {
  public int id_Report;
  public String title;
  public   String clientObservation;
  public String  adminObservation;
  public  String state;
  public   Reports next, prev;
  public Client sigClient;
  public static Reports instance = null;
    public static Reports getInstance(){
        if(instance == null){
            instance = new Reports();
        }
        return instance;
    }

    public Reports() {
    }
    
    public Reports(int id_Report, String title, String clientObservation, String adminObservation, String state) {
        this.id_Report = id_Report;
        this.title = title;
        this.clientObservation = clientObservation;
        this.adminObservation = adminObservation;
        this.state = state;
        this.next = this.prev = null;
    }

    public int getId_Report() {
        return id_Report;
    }

    public void setId_Report(int id_Report) {
        this.id_Report = id_Report;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClientObservation() {
        return clientObservation;
    }

    public void setClientObservation(String clientObservation) {
        this.clientObservation = clientObservation;
    }

    public String getAdminObservation() {
        return adminObservation;
    }

    public void setAdminObservation(String adminObservation) {
        this.adminObservation = adminObservation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    

    
}
